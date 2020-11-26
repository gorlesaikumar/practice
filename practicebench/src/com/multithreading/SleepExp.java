package com.multithreading;

public class SleepExp extends Thread
{
    public void run()
    {
    	
    		for( int i=1; i<5; i++)
    		{
    			try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			System.out.println(i);
    		}
    	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           SleepExp s= new SleepExp();
           SleepExp s1 = new SleepExp();
           
           s.start();
           s1.start();
	}

}
