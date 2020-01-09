import java.util.Scanner;


public class MessageSimulation {
	
	//Utility function to send messages in the buffer to the stack
	public static void processBuffer(Queue q, int size, Stack s) {		
		for(int i = 0; i < size; i++) {
			//If the stack is full, all content are popped and printed on the screen
			if(s.isFull()) {
				System.out.println("Stack is Full --> Processing...");
				while(!s.isEmpty()) {
					System.out.println(s.pop());
				}				
			}
			
			//If the stack is not full, all messages stored in the buffer are transfered to the stack
			s.push(q.peek());
			q.dequeue();
		}		
		System.out.println("All messages sent\nReseting Buffer");
	}
	
	public static void main(String[] args) {
		//The instructions for the simulation are coded in the main method
		
		//A Scanner is declared to get user's input
		Scanner in = new Scanner(System.in);
		
		//The messages limit for the buffer and process stack is declared as 5 and 6
		int sizeQueue = 5;
		int sizeStack = 6;
		Queue q = new Queue(sizeQueue);
		Stack s = new Stack(sizeStack);
		
		//outermost loop to keep the program running until user chooses to exit
		outerloop:
		while(true) {
			//loop to keep the user inputing messages until the buffer is full
			while(true) {
				if(q.isFull()) {
					break;
				}
				System.out.print("Input Message: ");
				String mess = in.nextLine();
				q.enqueue(mess);
			}
			
			//Once the buffer is full, all messages are transfered to the stack
			System.out.println("Sending all messages...");						
			processBuffer(q, sizeQueue, s);				
			
			//loop to ask if the user wants to input more messages once the buffer is full
			innerloop:
			while(true) {
				System.out.println("Would you like to send more messages? Y/N: ");
				String end = in.nextLine();
					
				//If user inputs N for No, the program terminates
				if(end.equals("N")) {
					System.out.println("Program Terminated.");
					break outerloop;
				}
				
				//If user inputs Y for Yes, the program resets and asks for more input
				else if(end.equals("Y")) {
					System.out.println("Waiting for more messages...");	
					break innerloop;
				}
				
				//The program doesn't understand if the user inputs neither Y or N.
				else {
					System.out.println("invalid choice.");
				}
			}			
		}
	}
	
}
