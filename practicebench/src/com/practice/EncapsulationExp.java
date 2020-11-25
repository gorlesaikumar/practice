package com.practice;

class test
{
	private long acc_num;
	private String name, email;
	private double balance;
	
	public long getAcc_num()
	{ 
		return acc_num;
		
	}
	public void setAcc_num(long acc_num)
	{
		this.acc_num=acc_num;
	}
	public String name() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	 public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
}
public class EncapsulationExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		t.setAcc_num(123456789);
		t.setName("kumar");
		t.setEmail("xyz@gmail.com");
		t.setBalance(1000.00);
		
		System.out.println(t.getAcc_num()+ " "+ t.getBalance()+ " "+ t.getEmail()+ " ");

	}

}
