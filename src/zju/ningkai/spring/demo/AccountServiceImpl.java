package zju.ningkai.spring.demo;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @what 转账业务层实现类
 * @author ningkai
 * @since 2016-11-1
 */
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	
	

	/**
	 * 
	 * @param out 转出账户 
	 * @param in 转入账户
	 * @param money  转账金额
	 */
	@Override
	public void transfer( String out,  String in,  int money) {
		
				accountDao.outMoney(out, money);
				accountDao.inMoney(in, money);
				
		
		

	}


	public AccountDao getAccountDao() {
		return accountDao;
	}


	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}





}
