package com.tech.practicePrograms;
public class QueueObject {

	private int[] queueObject;
	private int front;
	private int rear;
	private int queueSize;

	// Initialise size of Queue
	public QueueObject() {
		queueSize = 3;
		queueObject = new int[queueSize];
		front = -1;
		rear = -1;

	}

	/**
	 * To push data into Queue
	 * @param item
	 */
	public void push(int item) {
		if (front + 1 >= queueSize) 
			resize();
			queueObject[++front] = item;
		
	}

	/**
	 * For resizing the Queue
	 */
	public void resize() {
		int temp[] = queueObject;
		queueSize = queueSize * 2;
		queueObject = new int[queueSize];
		for (int i = 0; i <= front; i++) {
			queueObject[i] = temp[i];
		}

	}

	/**
	 * Pop element
	 * @return
	 */
	public Integer pop() {
		if (front <= rear) {
			return null;
		} else {
			return queueObject[++rear];
		}
	}
	
	public boolean isEmpty(){
		return front <= rear;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueObject queue = new QueueObject();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		queue.push(50);
		queue.push(60);
		queue.push(70);
		queue.push(80);
		queue.push(90);
		
		for(int j=0; j < queue.queueSize ; j++){
			System.out.println("" + queue.pop());
		}

	}
}
