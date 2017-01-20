package zju.ningkai.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @what 患者体征实体类
 * @author ningkai
 *
 */
public class BodySign {

	private String height;
	private String weight;
	private String systolicpressure;
	private String distolicpressure;
	private Date recordTime;

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSystolicpressure() {
		return systolicpressure;
	}

	public void setSystolicpressure(String systolicpressure) {
		this.systolicpressure = systolicpressure;
	}

	public String getDistolicpressure() {
		return distolicpressure;
	}

	public void setDistolicpressure(String distolicpressure) {
		this.distolicpressure = distolicpressure;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	@Override
	public String toString() {
		return "BodySign [height=" + height + ", weight=" + weight + ", systolicpressure=" + systolicpressure
				+ ", distolicpressure=" + distolicpressure + ", recordTime=" + recordTime + "]";
	}

}
