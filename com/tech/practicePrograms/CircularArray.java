package com.tech.practicePrograms;

public class CircularArray {

	// There are 2 methods in Circular array which is used by Queue : enqueue and dequeue
	
	private int[] circularArray;
	private int front;
	private int rear;
	private int size;
	
	private CircularArray() {
		front = rear = 0;
		size = 5;
		circularArray = new int[size];
	}
	
	private void enqueue(int item) {
		if(front > size){
			resize();
			circularArray[front] = item;
		}
		
		private void resize() {
			if(front)
		}
		
		private Integer dequeue(){
			if(front == rear) 
				return null;
			return circularArray[rear++];
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
