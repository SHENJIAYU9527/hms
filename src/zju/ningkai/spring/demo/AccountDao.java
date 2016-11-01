package zju.ningkai.spring.demo;
/**
 * @what 转账业务的DAO层接口
 * @author ningkai
 * @since 2016-11-1
 */
public interface AccountDao {
	/**
	 * 
	 * @param out 转出账户 
	 * @param money 转出金额
	 */
	public void outMoney(String out,int money);
	/**
	 * 
	 * @param in 转入账户
	 * @param money 转入金额
	 */
	public void inMoney(String in,int money);

}
