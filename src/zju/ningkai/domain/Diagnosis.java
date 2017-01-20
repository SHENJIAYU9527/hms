package zju.ningkai.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @what 诊断实体类
 * @author ningkai
 *
 */
public class Diagnosis {
	private String diagnosisIdentifier;
	private String diagnosisItemName;
	private Date diagnosisDate;
	
	public String getDiagnosisIdentifier() {
		return diagnosisIdentifier;
	}
	public void setDiagnosisIdentifier(String diagnosisIdentifier) {
		this.diagnosisIdentifier = diagnosisIdentifier;
	}
	public String getDiagnosisItemName() {
		return diagnosisItemName;
	}
	public void setDiagnosisItemName(String diagnosisItemName) {
		this.diagnosisItemName = diagnosisItemName;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getDiagnosisDate() {
		return diagnosisDate;
	}
	public void setDiagnosisDate(Date diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}
	
	

}
