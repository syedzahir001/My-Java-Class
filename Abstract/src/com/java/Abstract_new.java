package com.java;

public  class Abstract_new extends Abstract {
	@Override
	void Student_hallticket() {
		// TODO Auto-generated method stub
		System.out.println(32221);
		
		
	}
	
	
	@Override
	void Student_Results() {
		// TODO Auto-generated method stub
		System.out.println("positive ");
	}
public static void main(String[] args) {
	Abstract_new a = new Abstract_new();
	a.Student_hallticket();
	a.Student_Name();
	a.Student_Results();
	
}
}
