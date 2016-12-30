package zju.ningkai.domain;

import java.util.Date;
/**
 * @what 体重记录实体类
 * @author ningkai
 *
 */
public class Weight {
	
	private int seq;
	private String weight;
	private Date recordTime;
	private String memo;
	private int excuteScheduleFlag;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
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
