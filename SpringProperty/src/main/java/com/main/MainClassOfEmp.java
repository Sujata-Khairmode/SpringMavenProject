package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Login;
import com.entity.Registration;

public class MainClassOfEmp {

	public static void main(String[] args) {
		ApplicationContext contex= new ClassPathXmlApplicationContext("springbeans.xml");
		Registration r=contex.getBean( "reg",Registration.class);
		Login l=contex.getBean("log1",Login.class);
		System.out.println(r);
		

	}

}
