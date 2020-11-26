package com.multithreading;


public class Multi implements Runnable
{
	public void run()
	{
		System.out.println("multithreading");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi m = new Multi();
		Thread t = new Thread(m);
		t.start();

	}

}


