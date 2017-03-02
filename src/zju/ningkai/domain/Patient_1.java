package zju.ningkai.domain;

import java.util.Date;

/**
 * @what 患者列表中患者实体类
 * @author ningkai
 *
 */
public class Patient_1 {
	private String fullName;
	private String patientIdentifier;
	private String sexCode;
	private Date birthDate;
	private Date admitDateTime;
	private String diagnosisItemName;
	private String complication;
	private String manageDoctor;
	//private float SBP;
	//private float DBP;
	private Date latestFollowTime;
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	public void setPatientIdentifier(String patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}
	public String getSexCode() {
		return sexCode;
	}
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getDiagnosisItemName() {
		return diagnosisItemName;
	}
	public void setDiagnosisItemName(String diagnosisItemName) {
		this.diagnosisItemName = diagnosisItemName;
	}
	
	public String getManageDoctor() {
		return manageDoctor;
	}
	public void setManageDoctor(String manageDoctor) {
		this.manageDoctor = manageDoctor;
	}
//	public float getSBP() {
//		return SBP;
//	}
//	public void setSBP(float sBP) {
//		SBP = sBP;
//	}
//	public float getDBP() {
//		return DBP;
//	}
//	public void setDBP(float dBP) {
//		DBP = dBP;
//	}
	public Date getLatestFollowTime() {
		return latestFollowTime;
	}
	public void setLatestFollowTime(Date latestFollowTime) {
		this.latestFollowTime = latestFollowTime;
	}
	
	@Override
	public String toString() {
		return "Patient_1 [fullName=" + fullName + ", patientIdentifier=" + patientIdentifier + ", admitDateTime="
				+ admitDateTime + ", diagnosisItemName=" + diagnosisItemName + ", manageDoctor=" + manageDoctor + "]";
	}
	public String getComplication() {
		return complication;
	}
	public void setComplication(String complication) {
		this.complication = complication;
	}
	public Date getAdmitDateTime() {
		return admitDateTime;
	}
	public void setAdmitDateTime(Date admitDateTime) {
		this.admitDateTime = admitDateTime;
	}
	
	
	
	

}
