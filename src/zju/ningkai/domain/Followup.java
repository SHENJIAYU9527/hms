package zju.ningkai.domain;

import java.util.Date;

public class Followup {
	private int seq;
	// 不适症状预警为负值，其他预警为正值
	private int warningSeq;
	private int complianceSeq;
	private int normalSeq;
	private String blood;
	private String drug;
	private String food;
	private String exercise;
	private String weight;
	private String memo;
	private String followState;
	private String reason;
	private Date followTime;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getWarningSeq() {
		return warningSeq;
	}

	public void setWarningSeq(int warningSeq) {
		this.warningSeq = warningSeq;
	}

	public int getComplianceSeq() {
		return complianceSeq;
	}

	public void setComplianceSeq(int complianceSeq) {
		this.complianceSeq = complianceSeq;
	}

	public int getNormalSeq() {
		return normalSeq;
	}

	public void setNormalSeq(int normalSeq) {
		this.normalSeq = normalSeq;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getDrug() {
		return drug;
	}

	public void setDrug(String drug) {
		this.drug = drug;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getFollowState() {
		return followState;
	}

	public void setFollowState(String followState) {
		this.followState = followState;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getFollowTime() {
		return followTime;
	}

	public void setFollowTime(Date followTime) {
		this.followTime = followTime;
	}

	@Override
	public String toString() {
		if(blood !=null && blood!=""){
			blood="血压"+blood+";";
		}else{
			blood="";
		}
		if(drug !=null && drug!=""){
			drug="服药"+drug+";";
		}else{
			drug="";
		}
		if(food !=null && food!=""){
			food="饮食"+food+";";
		}else{
			food="";
		}
		if(weight !=null && weight!=""){
			weight="体重"+weight+";";
		}else{
			weight="";
		}
		if(exercise !=null && exercise!=""){
			exercise="运动"+exercise+";";
		}else{
			exercise="";
		}
		if(memo==null && memo.equals("")){
			memo="";
		}
		
		if(reason !=null && reason!=""){
			reason="原因："+reason+";";
		}else{
			reason="";
		}
		return blood+drug+weight+food+exercise+memo+reason;
	}

}
