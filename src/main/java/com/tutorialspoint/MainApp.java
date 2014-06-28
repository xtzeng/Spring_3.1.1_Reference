package com.tutorialspoint;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 * The @Required annotation applies to bean property setter methods and it indicates that the affected bean property 
 * must be populated in XML configuration file at configuration time 
 * otherwise the container throws a BeanInitializationException exception. 
 * Below is an example to show the use of @Required annotation
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("beans.xml");

      Student student = (Student) context.getBean("student");

      System.out.println("Name : " + student.getName() );
      System.out.println("Age : " + student.getAge() );
   }
   
   
}
