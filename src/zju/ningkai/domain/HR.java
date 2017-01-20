package zju.ningkai.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @what 心率记录实体类
 * @author ningkai
 *
 */
public class HR {

	private long seq;
	private float heartrate;
	private int excuteScheduleFlag;
	private Date recordTime;

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
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

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
