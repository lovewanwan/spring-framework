import com.th.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: SpringMybatisTest
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/26 16:36
 * @Version 1.0
 */
public class SpringMybatisTest {
	@Test
	public  void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		UserService userService =applicationContext.getBean(UserService.class);
		System.out.println(userService.selectByPrimaryKey(2));
	}
}