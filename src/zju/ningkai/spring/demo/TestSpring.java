package zju.ningkai.spring.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @what 转账案例测试类
 * @author ningkai
 * @since 2016-11-1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestSpring {
	@Resource(name="accountService")
	private AccountService accountService;
 
	@Test
	public void test1(){
		accountService.transfer("aaa", "bbb", 200);
	}
}
