package com.manikanta.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com.manikanta.SpringDemo1.Beans.xml");
        
                 Student s1=(Student) context.getBean("student");
                 
                 System.out.println(s1.getSid());
                 Student s2=(Student) context.getBean("student1");
                 s2.show();
                 
                 Student s3=(Student) context.getBean("student2");  
                 
                 s3.show();
                 
                 
                 
        
    }
}
