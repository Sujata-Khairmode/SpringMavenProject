package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("springbeans.xml");
	   Student s=contex.getBean("stud",Student.class);
	   Country c= contex.getBean("con",Country.class);
	   System.out.println(s);
	  

	}

}
