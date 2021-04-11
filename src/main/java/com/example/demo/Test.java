package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private String name;
	
    @Deprecated
    public static void Print(){
        System.out.println("d");
        System.out.print("cc大家");
    }
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Print();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
