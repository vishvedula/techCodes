package com.tech.practicePrograms;

public class MyStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push(20);
		myStack.push(40);
		myStack.push(60);
		myStack.push(80);
		myStack.push(100);
		
		System.out.println("popping the elements :" + myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
