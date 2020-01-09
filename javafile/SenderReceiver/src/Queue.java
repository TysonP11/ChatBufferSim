
public class Queue {
	private String arr[];         // array to store queue elements
	private int front;         // front points to front element in the queue
	private int rear;          // rear points to last element in the queue
	private int capacity;      // maximum capacity of the queue
	private int count;         // current size of the queue
	
	// Constructor to initialize queue
	Queue(int size)
	{
		arr = new String[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// Utility function to remove front element from the queue
	public void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		//System.out.println("Received message:  " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	// Utility function to add an item to the queue
	public void enqueue(String item)
	{
		// check for queue overflow
		if (isFull()) 
		{
			System.out.println("Queue is Full\nProgram Terminated"); 	//O(1)
			System.exit(1);												//O(1)
		}

		System.out.println("Inserting to buffer...");					//O(1)
		
		System.out.println("Slots remaining: " + (capacity-(count + 1)));//O(1)		
		rear = (rear + 1) % capacity;									//O(1)
		arr[rear] = item;												//O(1)
		count++;														//O(1)
	}
	
	// Utility function to return front element in the queue
	public String peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Queue is Empty\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

	// Utility function to return the size of the queue
	public int size()
	{
		return count;
	}

	// Utility function to check if the queue is empty or not
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	// Utility function to check if the queue is empty or not
	public Boolean isFull()
	{
		return (size() == capacity);
	}
	
	public void printQ() {
		for(int i = 0; i < count; i++) {
			System.out.println(arr[(front + i)%capacity]);
		}
	}	
}
