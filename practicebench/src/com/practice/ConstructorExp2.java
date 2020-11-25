package com.practice;

public class ConstructorExp2 {
    
	int id;
	String name;
	ConstructorExp2(int i, String s)
	{
		 id =i;
	   name = s;
		
	}
	void method1()
	{
		System.out.println(id+ " "+name);
	}
	public static void main(String[] args) {
		
		
		ConstructorExp2 c = new ConstructorExp2(10 , "saikumar");
		c.method1();

	}

}
