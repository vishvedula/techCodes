package com.tech.practicePrograms;

public class ThreadSleep implements Runnable {

	/**
	 * @param args
	 */
	
	public void run(){
		try {
			Thread.sleep(10000);
			System.out.println("Going to sleep");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		ThreadSleep thread = new ThreadSleep();
		Thread t = new Thread(thread);
		t.start();
	}

}
