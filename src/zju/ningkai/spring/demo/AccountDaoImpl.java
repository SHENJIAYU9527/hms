package zju.ningkai.spring.demo;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @what 转账案例dao层实现类
 * @author ningkai
 * @since 2016-11-1
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	

	/**
	 * 
	 * @param out 转出账户 
	 * @param money 转出金额
	 */
	@Override
	public void outMoney(String out, int money) {
		String sql="update Account set money=money-? where name=?";
		
		this.getJdbcTemplate().update(sql, money,out);
		
	

	}

	/**
	 * 
	 * @param in 转入账户
	 * @param money 转入金额
	 */
	@Override
	public void inMoney(String in, int money) {
		String sql="update Account set money=money+? where name=?";
		this.getJdbcTemplate().update(sql, money,in);

	}

}
