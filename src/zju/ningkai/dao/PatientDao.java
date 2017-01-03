package zju.ningkai.dao;

import java.util.List;

import zju.ningkai.domain.Patient;

/**
 * @what 患者操作接口
 * @author ningkai
 *
 */
public interface PatientDao {

	/**
	 * 根据管理师的权限加载对应管理的患者列表
	 * 
	 * @param userId
	 * @param password
	 * @param auth
	 * @return
	 */
	List<Patient> findPatients(String userId, int auth);

	/**
	 * 根据管理师的权限加载对应管理的工作总结
	 * 
	 * @param userId
	 * @param auth
	 * @return
	 */
	public List<Patient> findWorks(String userId, int auth);

	/**
	 * 根据管理师的权限加载对应管理的随访信息
	 * 
	 * @param userId
	 * @param auth
	 * @return
	 */
	public List<Patient> findFollowups(String userId, int auth);

	/**
	 * 根据管理师的权限加载对应管理的预警信息
	 * 
	 * @param userId
	 * @param auth
	 * @return
	 */
	public List<Patient> findWarnings(String userId, int auth);

	/**
	 * 删除患者
	 * 
	 * @param patient
	 */
	void delete(Patient patient);

	/**
	 * 根据患者Id查询患者基本信息
	 * 
	 * @param patientId
	 * @return
	 */
	Patient find(String patientId);

	/**
	 * 根据参数获取患者ID列表
	 * 
	 * @param parameters
	 * @param sql
	 * @return
	 */
	List<String> patientIDs(String sql, Object[] parameters);

}
