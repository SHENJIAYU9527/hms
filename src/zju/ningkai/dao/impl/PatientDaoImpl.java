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
import zju.ningkai.util.DBHelper;

public class PatientDaoImpl implements PatientDao {

	private DBHelper helper;

	public PatientDaoImpl(DBHelper helper) {
		this.helper = helper;
	}

	public List<Patient> findFollowups(String userId, int type) {
		List<Patient> patients = new ArrayList<Patient>();
		Object[] parameters = { userId };
		String IDs_sql = "select patientidentifier from personpatient where doctor=?";
		List<String> patientList = this.patientIDs(IDs_sql, parameters);
		for (String id : patientList) {
			PatientBasic basic = this.getBasic(id);
			Level level = this.getLevel(id);
			Followup fu = this.getFollowup(id, type);
			Diagnosis diagnosis = this.getDiagnosis(id);
			AvgBP avgBP = this.getAvgBP(id, 14);
			avgBP.setDuration(14);
			FollowupBrief brief=this.getFollowupBrief(id,1);
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
	 * @param id
	 * @param type
	 * @return
	 */
	private FollowupBrief getFollowupBrief(String id,int type) {
		String sql_conut="SELECT count(*) FROM [dbo].[followupvisit] WHERE patientidentifier=? AND followstate=?";
		Object[] parameters = { id ,type};
		int count=helper.queryCount(sql_conut, parameters);
		String sql_latest="SELECT top 1 followtime FROM [dbo].[followupvisit] WHERE patientidentifier=? AND followstate=? ORDER BY seq DESC";
		String latestFollowup=helper.queryString(sql_latest, parameters).get(0);
		FollowupBrief brief=new FollowupBrief();
		brief.setTimes(count);
		brief.setLatestFu(latestFollowup);
		return brief;
	}

	/**
	 * 获取患者最近一段时间内的平均血压值
	 * @param id
	 * @param duration
	 * @return
	 */
	private AvgBP getAvgBP(String id, int duration) {
		String sql = "SELECT round(avg(systolicpressure),0) AS avgsbp, round(avg(diastolicpressure),0) AS avgdbp FROM [dbo].[bloodpressurerecord] WHERE patientidentifier=? AND datediff(DAY, recordtime, getdate())<=?";
		Object[] parameters = { id ,duration};
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
		PatientBasic basic = (PatientBasic) helper.queryEntity(new PatientBasic(), sql, parameters).get(0);
		return basic;
	}

	/**
	 * 获取患者ID列表
	 */
	@Override
	public List<String> patientIDs(String sql, Object[] parameters) {

		List<String> IDs = helper.queryString(sql, parameters);

		return IDs;
	}

	@Override
	public List<Patient> findWorks(String userId, int auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> findPatients(String userId, int auth) {

		return null;
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

}
