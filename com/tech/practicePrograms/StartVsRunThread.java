/**
 * // .start() would put the above 2 threads in 2 different call stacks, hence output would be as follows with proper Context Switching.
 * // .run() directly invokes Thread 1 and Thread 2 one after the another , No Context Switching Happens
 * 
 */

package com.thread.programs;

public class ThreadContextSwitching extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadContextSwitching t1 = new ThreadContextSwitching();
		ThreadContextSwitching t2 = new ThreadContextSwitching();


		t1.start();
		t2.start();
		/*
		 * Output:
		1
		1
		2
		2
		3
		3
		4
		4*/
		
		t1.run();
		t2.run();
		/*
		 * Output:
		1
		2
		3
		4
		1
		2
		3
		4*/
	}
	
}
