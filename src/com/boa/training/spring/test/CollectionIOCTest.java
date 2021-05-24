package com.boa.training.spring.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.boa.training.spring.collections.Address;
import com.boa.training.spring.collections.Employee;

;

public class CollectionIOCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context=new FileSystemXmlApplicationContext("c:/test/beans.xml");
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans-with-collection.xml");
		Employee employee=(Employee) context.getBean("emp");
		System.out.println("Id: "+employee.getEmpId());
		System.out.println("Name: "+employee.getEmpName());
		System.out.println("Designation:: "+employee.getDesignation());
		
		List<Address> addresses=employee.getAddresses();
		
		for(Address address:addresses) {
		
		System.out.println("Location: "+address.getLocation());
		System.out.println("City: "+address.getCity());
		}
	}

}
