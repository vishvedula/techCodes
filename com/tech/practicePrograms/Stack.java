package com.tech.practicePrograms;

public class Stack {

	private int[] object ;
	private int top;
	private int stackSize;
	
	public Stack() {
		stackSize = 1;
		top =-1;
		object = new int[stackSize];
	}
	
	public void push(int item){
		if(top >= stackSize-1) 
			reSize();
			object[++top] = item;
	}
		
		private void reSize() {
			int[] temp= object;
			stackSize = stackSize * 2;
			object = new int[stackSize];
			for (int i = 0 ; i <= top ; i++) {
				object[i]= temp[i];
			}
		}
		
		public Integer pop() {
			if(top <0) {
				return null;
		} else {
			return object[top--];
		}
	}
	
}
