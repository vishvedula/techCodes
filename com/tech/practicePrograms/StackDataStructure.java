package com.tech.practicePrograms;

public class StackDataStructure {
	
	
	// First we need to define an int array object for holding the stack elements
	// We need to know the stackSize , and the top of the stack

	private int[] stackObject;
	private int top;
	private int stackSize;
	
	
	public StackDataStructure(){
		top = -1;
		stackSize = 1;
	stackObject = new int[stackSize];
	}
	/**
	 * Method to add elements into Stack
	 */
	private void push(int item) {
		if(top >= stackSize - 1)
			resize();
		stackObject[++top] = item;
		
	}
	
	/**
	 * To increase the size of the stack as and when elements get appended
	 * and the size falls short of space
	 */
	public void resize() {
		int temp[] = stackObject;
		stackSize = stackSize * 2;
		stackObject = new int[stackSize];
		for (int i = 0 ; i <=top; i++){
			stackObject[i] = temp[i];
		}
	}
	
	/**
	 * Method to pop the elements
	 */
	
	private Integer pop() {
		if(top < 0) {
			return null;
		} else {
			return stackObject[top--];
		}
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackDataStructure ds = new StackDataStructure();
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.push(6);
		for(int i=0 ; i <= ds.stackSize; i++){
			System.out.println("Element popped out of stack" + ds.pop());
			
		}

	}

}
