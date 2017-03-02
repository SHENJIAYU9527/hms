package zju.ningkai.dao.impl;

import java.util.ArrayList;
import java.util.List;
import zju.ningkai.dao.PatientDao;
import zju.ningkai.domain.AvgBP;
import zju.ningkai.domain.Diagnosis;
import zju.ningkai.domain.Followup;
import zju.ningkai.domain.FollowupBrief;
import zju.ningkai.domain.Level;
import zju.ningkai.domain.Patient;
import zju.ningkai.domain.PatientBasic;
import zju.ningkai.domain.Patient_1;
import zju.ningkai.util.DBHelper;

public class PatientDaoImpl implements PatientDao {

	public List<Patient> findFollowups(String userId, int type) {
		List<Patient> patients = new ArrayList<Patient>();
		Object[] parameters = { userId, type };
		String IDs_sql = "select PersonPatient.patientidentifier from personpatient,FollowupTime where PersonPatient.doctor=? and FollowupTime.FollowMark=? and PersonPatient.patientidentifier=FollowupTime.PatientIdentifier";
		List<String> patientList = this.patientIDs(IDs_sql, parameters);
		for (String id : patientList) {
			PatientBasic basic = this.getBasic(id);
			Level level = this.getLevel(id);
			Followup fu = this.getFollowup(id, type);
			Diagnosis diagnosis = this.getDiagnosis(id);
			AvgBP avgBP = this.getAvgBP(id, 14);
			avgBP.setDuration(14);
			FollowupBrief brief = this.getFollowupBrief(id, 1);
			Patient patient = new Patient();
			patient.setBasic(basic);
			patient.setLevel(level);
			patient.setFu(fu);
			patient.setDiagnosis(diagnosis);
			patient.setAvgBP(avgBP);
			patient.setBriefFu(brief);
			patients.add(patient);

		}

		return patients;
	}

	/**
	 * 获取患者随访历史概要信息
	 * 
	 * @param id
	 * @param type
	 * @return
	 */
	private FollowupBrief getFollowupBrief(String id, int type) {
		String sql_conut = "SELECT count(*) FROM [dbo].[followupvisit] WHERE patientidentifier=? AND followstate=?";
		Object[] parameters = { id, type };
		DBHelper helper = new DBHelper();
		int count = helper.queryCount(sql_conut, parameters);
		String latestFollowup = null;
		if (count > 0) {
			String sql_latest = "SELECT top 1 followtime FROM [dbo].[followupvisit] WHERE patientidentifier=? AND followstate=? ORDER BY seq DESC";
			latestFollowup = helper.queryString(sql_latest, parameters).get(0);
		}

		FollowupBrief brief = new FollowupBrief();
		brief.setTimes(count);
		brief.setLatestFu(latestFollowup);
		return brief;
	}

	/**
	 * 获取患者最近一段时间内的平均血压值
	 * 
	 * @param id
	 * @param duration
	 * @return
	 */
	private AvgBP getAvgBP(String id, int duration) {
		String sql = "SELECT round(isnull(avg(isnull(systolicpressure,0)),0),0) AS avgsbp, round(isnull(avg(isnull(diastolicpressure,0)),0),0) AS avgdbp FROM [dbo].[bloodpressurerecord] WHERE patientidentifier=? AND datediff(DAY, recordtime, getdate())<=?";
		Object[] parameters = { id, duration };
		DBHelper helper = new DBHelper();
		AvgBP avgBP = (AvgBP) helper.queryEntity(new AvgBP(), sql, parameters).get(0);
		return avgBP;
	}

	/**
	 * 获取患者诊断信息
	 * 
	 * @param id
	 * @return
	 */
	private Diagnosis getDiagnosis(String id) {
		String sql = "SELECT top 1 diagnosisidentifier, diagnosisitemname, diagnosisdate FROM [dbo].[diagnosis] WHERE patientidentifier=? ORDER BY diagnosisidentifier DESC";
		Object[] parameters = { id };
		DBHelper helper = new DBHelper();
		Diagnosis diag = (Diagnosis) helper.queryEntity(new Diagnosis(), sql, parameters).get(0);
		return diag;
	}

	/**
	 * 获取患者随访信息
	 * 
	 * @param id
	 * @param type
	 * @return
	 */
	private Followup getFollowup(String id, int type) {
		String sql = "SELECT top 1 seq, followtime, followmark, starttime FROM [dbo].[followuptime] WHERE patientidentifier=? AND followmark=? ORDER BY seq DESC";
		Object[] parameters = { id, type };
		DBHelper helper = new DBHelper();
		Followup fu = helper.queryEntity(new Followup(), sql, parameters).get(0);
		return fu;

	}

	/**
	 * 获取患者管理等级信息和依从度
	 * 
	 * @param id
	 * @return
	 */
	private Level getLevel(String id) {
		String sql = "SELECT seq, managelevel, complication FROM [dbo].[patientlevel] WHERE patientidentifier=?";
		Object[] parameters = { id };
		DBHelper helper = new DBHelper();
		Level level = (Level) helper.queryEntity(new Level(), sql, parameters).get(0);
		return level;
	}

	/**
	 * 获取患者基本信息
	 * 
	 * @param id
	 * @return
	 */
	private PatientBasic getBasic(String id) {
		String sql = "SELECT patientidentifier, fullname, sexcode, birthdate, profession, education, identitycardnumber, phonenumber, doctor, managemark, hospital, region FROM [dbo].[personpatient] WHERE patientidentifier=? ";
		Object[] parameters = { id };
		DBHelper helper = new DBHelper();
		PatientBasic basic = (PatientBasic) helper.queryEntity(new PatientBasic(), sql, parameters).get(0);
		return basic;
	}

	/**
	 * 获取患者ID列表
	 */
	@Override
	public List<String> patientIDs(String sql, Object[] parameters) {

		DBHelper helper = new DBHelper();
		List<String> IDs = helper.queryString(sql, parameters);

		return IDs;
	}

	@Override
	public List<Patient> findWorks(String userId, int auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient_1> findPatients(String doctor, int level) {
		int auth=this.getAuth(doctor);
		Object[]  parameters={level,doctor};
		String pList_sql="SELECT PersonPatient.PatientIdentifier, PersonPatient.FullName, PersonPatient.BirthDate, PersonPatient.SexCode, PersonPatient.ManageDoctor, Admission.AdmitDateTime, PatientLevel.Complication, Diagnosis.DiagnosisItemName, (SELECT top 1 FollowTime FROM [dbo].[FollowupVisit] WHERE PatientIdentifier=PersonPatient.PatientIdentifier ORDER BY FollowTime DESC) AS LatestFollowTime"
	         	+" FROM PersonPatient, PatientLevel, Admission, Diagnosis WHERE PersonPatient.PatientIdentifier = PatientLevel.PatientIdentifier AND PatientLevel.ManageLevel = ? AND Admission.PatientIdentifier = PersonPatient.PatientIdentifier AND PersonPatient.PatientIdentifier = Diagnosis.PatientIdentifier AND PersonPatient.ManageMark != 2";
		if(auth==0){
			pList_sql=pList_sql+" AND PersonPatient.Doctor = ?";
			
		}
		DBHelper helper = new DBHelper();
		List<Patient_1> patients=helper.queryEntity(new Patient_1(), pList_sql, parameters);
		


		return patients;
	}

	public List<Patient> findWarnings(String userId, int auth) {

		return null;
	}

	@Override
	public void delete(Patient patient) {

	}

	@Override
	public Patient find(String patientId) {

		return null;
	}

	@Override
	/**
	 * 获取医生用户的权限级别
	 */
	public int getAuth(String doctor) {
		String auth_sql="SELECT Auth FROM [dbo].[User] WHERE UserId = ?";
		Object[] parameters = { doctor };
		DBHelper helper = new DBHelper();
		int auth=Integer.valueOf(helper.queryString(auth_sql, parameters).get(0));
		return auth;
	}

}
