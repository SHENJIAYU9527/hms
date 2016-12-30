package zju.ningkai.domain;
/**
 * @what 药品名实体类
 * @author ningkai
 *
 */
public class Medicine {
	private int seq;
	private String medicineName;
	private String dosage;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	@Override
	public String toString() {
		return medicineName + "," + dosage + ";";
	}

}
