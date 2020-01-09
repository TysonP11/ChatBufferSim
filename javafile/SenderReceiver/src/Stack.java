
public class Stack {

	private int max;		//maximum capacity of the stack
	private int count;		//current number of elements in stack
	private int top;		//top points to the element on top of the stack
	private String[] arr;	//array to store elements of the stack
	
	//Contructor to initialze the stack
	public Stack(int x) {
		max = x;
		arr = new String[max];
		count = 0;
		top = -1;
	}
	
	//Utility function to add a string to the top of the stack
	public void push(String s) {
		//Check if the stack is full
		if(isFull()) {
				System.out.println("Stack is Full\nProgram Terminated");
				System.exit(1);
		}
		
		//Increase the number of element by one, move the top pointer to the next element
		count++;
		top = (top + 1) % max;
		//Add the input string to the top of the stack
		arr[top] = s;
	}
	
	//Utility function to get the top element and removes it from the stack
	public String pop() {
		//Check if the stack is empty
		if(isEmpty()) {
			System.out.println("StackUnderFlow\nProgram Terminated");
			System.exit(1);
		}
		
		//Return the top element, move the pointer to the next element and decrease count
		int temp = top;
		top = (top + max - 1) % max;
		count--;
		return arr[temp];		
	}
	
	//Utility function to get number of elements
	public int size()
	{
		return count;
	}
	
	//Utility function to check if stack is empty
	public Boolean isEmpty()
	{
		return (size() == 0);
	}
	
	//Utility function to check if stack is full
	public boolean isFull() {
		return (size() == max); 
	}
}
