package zju.ningkai.domain;

/**
 * @what 患者管理等级和依从度实体类
 * @author ningkai
 *
 */
public class Level {

	private int seq;
	private String manageLevel;
	private String complication;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getManageLevel() {
		return manageLevel;
	}

	public void setManageLevel(String manageLevel) {
		this.manageLevel = manageLevel;
	}

	public String getComplication() {
		return complication;
	}

	public void setComplication(String complication) {
		this.complication = complication;
	}

}
