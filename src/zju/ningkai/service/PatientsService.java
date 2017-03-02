package zju.ningkai.service;

import java.util.List;

import zju.ningkai.domain.Patient;
import zju.ningkai.domain.Patient_1;
/**
 * @what 列表服务
 * @author ningkai
 *
 */
public interface PatientsService {
	/**
	 * @what 查询随访患者
	 * @param doctor
	 * @param type
	 * @return
	 */
	List<Patient> getFollowups(String doctor,int type);
	/**
	 * @what 查询患者列表
	 * @param doctor
	 * @param level
	 * @return
	 */
	List<Patient_1> getPatients(String doctor,int level);
	/**
	 * @what 查询预警患者
	 * @param doctor
	 * @param type
	 * @return
	 */
	List<Patient> getWarnings(String doctor,int type);
	


}
