package zju.ningkai.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * @what 血压实体类
 * @author ningkai
 *
 */
public class BP {
	
	private long seq;
	private Date recordTime;
	private float systolicpressure;
	private float diastolicpressure;
	private String memo;
	private int excuteScheduleFlag;
	
	
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public float getSystolicpressure() {
		return systolicpressure;
	}
	public void setSystolicpressure(float systolicpressure) {
		this.systolicpressure = systolicpressure;
	}
	public float getDiastolicpressure() {
		return diastolicpressure;
	}
	public void setDiastolicpressure(float diastolicpressure) {
		this.diastolicpressure = diastolicpressure;
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
	
	@Override
	public String toString() {
		return "BP [seq=" + seq + ", recordTime=" + recordTime
				+ ", systolicpressure=" + systolicpressure + ", diastolicpressure=" + diastolicpressure + "]";
	}
	
	

}
