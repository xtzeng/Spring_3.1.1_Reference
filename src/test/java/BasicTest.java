import com.xiaoti.lovely.model.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BasicTest {

	
	
	@org.junit.Test
	public void testGetBean() {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
		Test test = (Test) context.getBean("te");
		test.printTest();
		
	}
}
