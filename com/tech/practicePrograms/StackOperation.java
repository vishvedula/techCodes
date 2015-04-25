package com.tech.practicePrograms;
public class StackOperation {

	private int[] stackObject;
	private int top;
	private int stackSize;

	/**
	 * Creating a constructor to initialize the above values
	 */
	private StackOperation() {
		stackSize = 1;
		top = -1;
		stackObject = new int[stackSize];
	}

	/**
	 * push() method to push entries into stack
	 */

	private void push(int item) {
		if (top >= stackSize - 1)
			resize();
		stackObject[++top] = item;
	}

	private void resize() {
		int[] temp = stackObject;
		stackSize = stackSize * 2;
		stackObject = new int[stackSize];
		for (int i = 0; i <= top; i++) {
			stackObject[i] = temp[i];
		}
	}

	/**
	 * pop() to retrieve a value , hence return type is int
	 * 
	 * @return
	 */
	private Integer pop() {
		if (top < 0) {
			return null;
		} else {
			return stackObject[top--];
		}
	}

	public static void main(String arg[]) {
		StackOperation stackOp = new StackOperation();
		stackOp.push(10);
		stackOp.push(20);
		stackOp.push(30);
		stackOp.push(40);
		stackOp.push(50);
		stackOp.push(60);
		stackOp.push(70);
		stackOp.push(80);
		stackOp.push(90);
		stackOp.push(100);
		for (int i = 0 ; i <= stackOp.stackSize; i++){
			System.out.println("Popped elemet" +stackOp.pop());
		}

	}
}
