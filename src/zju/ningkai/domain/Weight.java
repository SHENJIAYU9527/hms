package zju.ningkai.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @what 体重记录实体类
 * @author ningkai
 *
 */
public class Weight {

	private long seq;
	private String weight;
	private Date recordTime;
	private String memo;
	private int excuteScheduleFlag;

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
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
		return "Weight [seq=" + seq + ", weight=" + weight + ", recordTime=" + recordTime + ", memo=" + memo
				+ ", excuteScheduleFlag=" + excuteScheduleFlag + "]";
	}

}
