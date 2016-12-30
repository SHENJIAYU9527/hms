package zju.ningkai.domain;

import java.util.Date;
/**
 * @what 不适症状实体类
 * @author ningkai
 *
 */
public class Discomfort {
	private int seq;
	private int managementID;
	private String patientIdentifier;
	private Date recordTime;
	private int discomfortTyoe;
	private String memo;
	private int excuteScheduleFlag;
	private int status;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getManagementID() {
		return managementID;
	}
	public void setManagementID(int managementID) {
		this.managementID = managementID;
	}
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	public void setPatientIdentifier(String patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public int getDiscomfortTyoe() {
		return discomfortTyoe;
	}
	public void setDiscomfortTyoe(int discomfortTyoe) {
		this.discomfortTyoe = discomfortTyoe;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getExcuteScheduleFlag() {
		return excuteScheduleFlag;
	}
	public void setExcuteScheduleFlag(int excuteScheduleFlag) {
		this.excuteScheduleFlag = excuteScheduleFlag;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Discomfort [seq=" + seq + ", managementID=" + managementID + ", patientIdentifier=" + patientIdentifier
				+ ", recordTime=" + recordTime + ", discomfortTyoe=" + discomfortTyoe + ", memo=" + memo
				+ ", excuteScheduleFlag=" + excuteScheduleFlag + ", status=" + status + "]";
	}
	
	
	
	

}
