package com.boa.training.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.boa.training.spring.Address;
import com.boa.training.spring.Employee;

public class IOCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context=new FileSystemXmlApplicationContext("c:/test/beans.xml");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=(Employee) context.getBean("emp");
		System.out.println("Id: "+employee.getEmpId());
		System.out.println("Name: "+employee.getEmpName());
		System.out.println("Designation:: "+employee.getDesignation());
		
		Address address=employee.getAddress();
		System.out.println("Location: "+address.getLocation());
		System.out.println("City: "+address.getCity());
		
	}

}
