package zju.ningkai.service;

import java.util.List;
import zju.ningkai.domain.BP;
import zju.ningkai.domain.BodySign;
import zju.ningkai.domain.Discomfort;
import zju.ningkai.domain.Followup;
import zju.ningkai.domain.HR;
import zju.ningkai.domain.HypertensionHis;
import zju.ningkai.domain.ManagePlan;
import zju.ningkai.domain.Medicine;
import zju.ningkai.domain.Weight;

/**
 * @what 用于患者各类健康数据的获取
 * @author ningkai
 *
 */
public interface PatientDataService {

	/**
	 * @what 获取患者血压数据
	 * @param patientId
	 * @param start
	 * @param end
	 * @return
	 */
	List<BP> getBPData(String patientId, String start, String end);

	/**
	 * @what 获取患者体重数据
	 * @param patientId
	 * @param start
	 * @param end
	 * @return
	 */
	List<Weight> getWeightData(String patientId, String start, String end);

	/**
	 * @what 获取患者心率数据
	 * @param patientId
	 * @param start
	 * @param end
	 * @return
	 */
	List<HR> getHRData(String patientId, String start, String end);

	/**
	 * @what 获取患者服药历史数据
	 * @param patientId
	 * @param start
	 * @param end
	 * @return
	 */
	List<Medicine> getMedicationData(String patientId, String start, String end);

	/**
	 * @what 获取患者不适症状历史数据
	 * @param patientId
	 * @param start
	 * @param end
	 * @return
	 */
	List<Discomfort> getDiscomfortData(String patientId, String start, String end);

	/**
	 * @what 获取患者随访记录历史数据
	 * @param patientId
	 * @param start
	 * @param end
	 * @return
	 */
	List<Followup> getFollowupData(String patientId, String start, String end);

	/**
	 * @what 获取患者体征数据
	 * @param patientId
	 * @return
	 */
	List<BodySign> getBodySignData(String patientId);

	/**
	 * @what 获取患者当前管理计划
	 * @param patientId
	 * @return
	 */
	List<ManagePlan> getManagePlanData(String patientId);

	/**
	 * @what 获取患者病史信息
	 * @param patientId
	 * @return
	 */
	List<HypertensionHis> getHypertensionHisData(String patientId);

}
