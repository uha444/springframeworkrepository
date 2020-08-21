package com.vidvaan.student.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.student.bean.Student;

public class StudentClient {
	public static void main(String[] args) {
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("spring.xml");
		Student student = cont.getBean("student", Student.class);
	//	Student student2 = cont.getBean("student", Student.class);
		student.display();
	//	System.out.println(student2.toString());

	}

}
