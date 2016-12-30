package zju.ningkai.domain;

import java.util.Date;
import java.util.List;
/**
 * @what 服药记录实体类
 * @author ningkai
 *
 */
public class MedicationRecord {
	private int seq;
	private String meno;
	private List<Medicine> medicines;
	private Date recordTime;
	private int excuteScheduleFlag;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	public List<Medicine> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	public int getExcuteScheduleFlag() {
		return excuteScheduleFlag;
	}
	public void setExcuteScheduleFlag(int excuteScheduleFlag) {
		this.excuteScheduleFlag = excuteScheduleFlag;
	}
	
	
	
	
	

}
