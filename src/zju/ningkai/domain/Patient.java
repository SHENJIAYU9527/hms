package zju.ningkai.domain;
/**
 * @what 患者实体类，包含各类患者信息
 * @author ningkai
 *
 */
public class Patient {
	
	private PatientBasic basic;
	private Level level;
	//随访信息
	private Followup fu;
	private Diagnosis diagnosis;
	private AvgBP avgBP;
	private FollowupBrief briefFu;
	
	
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public PatientBasic getBasic() {
		return basic;
	}
	public void setBasic(PatientBasic basic) {
		this.basic = basic;
	}
	public Followup getFu() {
		return fu;
	}
	public void setFu(Followup fu) {
		this.fu = fu;
	}
	public Diagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}
	public AvgBP getAvgBP() {
		return avgBP;
	}
	public void setAvgBP(AvgBP avgBP) {
		this.avgBP = avgBP;
	}
	public FollowupBrief getBriefFu() {
		return briefFu;
	}
	public void setBriefFu(FollowupBrief briefFu) {
		this.briefFu = briefFu;
	}
	
	
	
	

}
