package com.boa.training.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.boa.training.spring.Address;
import com.boa.training.spring.Employee;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context=new FileSystemXmlApplicationContext("c:/test/beans.xml");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee1=(Employee) context.getBean("emp");
		
		Employee employee2=(Employee)context.getBean("emp");
		
		System.out.println(employee1.getEmpName());
		System.out.println(employee2.getEmpName());
		
		System.out.println(employee1==employee2);
		
		
		
	}

}
