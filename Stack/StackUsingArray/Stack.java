package StackUsingArray;

public class Stack {
	int top;
	int arr[];

	public Stack() {
		this.top = 0;
		arr = new int[10];
	}

	public Stack(int n) {
		this.top = 0;
		arr = new int[n];
	}

	public void push(int data) {
		if (top < arr.length) {
			arr[top] = data;
			top++;
		} else {
			throw new StackOverflowError("Stack is Full");
		}
	}

	public int pop() {
		if (top == 0) {
			throw new RuntimeException("Stack is Full");
		} else {
			int value = arr[top - 1];
			arr[top - 1] = 0;
			top = top - 1;
			return value;
		}
	}

	public int getStackSize() {
		return top;
	}

	public void displayStack() {
		for (int i = 0; i < top; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void deleteStack() {
		arr = new int[arr.length];
		this.top = 0;
	}
}
