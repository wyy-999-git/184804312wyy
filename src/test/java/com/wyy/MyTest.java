package com.wyy;

import com.wyy.bao.student;
import com.wyy.bao2.Student;
import com.wyy.bao2.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testSet02(){
        //String config = "total.xml";
        String config = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        student mystudent = (student) ac.getBean("student");
        System.out.println("学生："+mystudent);
    }
    @Test
    public void testCompenet(){
        String config = "ApplicationContext2.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student mystudent = (Student) ac.getBean("student");
        System.out.println("学生："+mystudent);
    }
    @Test
    public void testCompenetValue(){
        String config = "ApplicationContext2.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Teacher teacher = (Teacher) ac.getBean("teacher");
        System.out.println("老师："+teacher);
    }
}
