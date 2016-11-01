package zju.ningkai.spring.demo;
/**
 * @what 转账案例的业务层接口
 * @author ningkai
 * @since 2016-11-1
 */
public interface AccountService {
	/**
	 * 
	 * @param out 转出账户 
	 * @param in 转入账户
	 * @param money  转账金额
	 */
	public void transfer(String out,String in,int money);

}
