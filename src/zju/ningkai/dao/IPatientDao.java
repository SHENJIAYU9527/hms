package zju.ningkai.dao;

import java.util.List;

import zju.ningkai.domain.Patient;

/**
 * @what 患者操作接口
 * @author ningkai
 *
 */
public interface IPatientDao {
	
	/**
	 * 根据管理师的权限加载对应惯例的患者列表
	 * @param userId
	 * @param password
	 * @param auth
	 * @return
	 */
	List<Patient> find(String userId,String password,int auth);
	
	
	/**
	 * 删除患者
	 * @param patient
	 */
	void delete(Patient patient);
	
	
	/**
	 * 根据患者Id查询患者基本信息
     * @param patientId
	 * @return
	 */
	Patient find(String patientId);
	
}
