package zju.ningkai.domain;

import java.util.Date;
/**
 * @what 心率记录实体类
 * @author ningkai
 *
 */
public class HR {
	
	private int seq;
	private float heartrate;
	private int excuteScheduleFlag;
	private Date recordTime;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public float getHeartrate() {
		return heartrate;
	}
	public void setHeartrate(float heartrate) {
		this.heartrate = heartrate;
	}
	public int getExcuteScheduleFlag() {
		return excuteScheduleFlag;
	}
	public void setExcuteScheduleFlag(int excuteScheduleFlag) {
		this.excuteScheduleFlag = excuteScheduleFlag;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	@Override
	
	public String toString() {
		return "HR [seq=" + seq + ", heartrate=" + heartrate + ", excuteScheduleFlag=" + excuteScheduleFlag
				+ ", recordTime=" + recordTime + "]";
	}

	
	
	

}
