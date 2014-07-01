import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.Student;


public class StudentTest {

	
	@Test
	public void testRequire() {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");

	      Student student = (Student) context.getBean("student");

	      System.out.println("Name : " + student.getName() );
	      System.out.println("Age : " + student.getAge() );
	}
}
