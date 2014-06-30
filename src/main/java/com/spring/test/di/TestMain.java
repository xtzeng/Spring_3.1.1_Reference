package com.spring.test.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
 

public class TestMain {
 

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
 

       // 得到ApplicationContext对象
       ApplicationContext ctx = new ClassPathXmlApplicationContext(
              "applicationContext.xml");
       // 得到Bean
       ctx.getBean("logic");
       //ctx.getBean("anotherBean");
    }
}

