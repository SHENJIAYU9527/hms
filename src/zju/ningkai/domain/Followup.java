package zju.ningkai.domain;

import java.util.Date;
/**
 * @what 患者应随访信息实体类
 * @author ningkai
 * 
 */
public class Followup {
	
	private int seq;
	private Date followTime;
	private int followMark;
	private Date startTime;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public Date getFollowTime() {
		return followTime;
	}
	public void setFollowTime(Date followTime) {
		this.followTime = followTime;
	}
	public int getFollowMark() {
		return followMark;
	}
	public void setFollowMark(int followMark) {
		this.followMark = followMark;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	
	

}
