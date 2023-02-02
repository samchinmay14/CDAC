package queue_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tEnter Circular-Queue Size : ");
		
		int s=sc.nextInt();
		Queue_FL fl=new Queue_FL(s);
		
		int ch=0;
		while(ch!=4)
		{
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\nEnter Choice : ");
			System.out.println("\n\t1.EnQueue.\n\t2.DeQueue.\n\t3.Display.\n\t4.Exit.");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter int value to EnQueue : ");
				int d=sc.nextInt();
				if(fl.isFull())
				{
					System.out.println("Dequeued element : "+fl.deQueue());
					fl.enQueue(d);
					System.out.println("Enqued enQueue : "+d);
				}
				else
				{
					fl.enQueue(d);
					System.out.println("Enqued enQueue : "+d);
				}
				break;
				
			case 2:
				int dq=fl.deQueue();
				if(dq!=-9999)
					System.out.println("Deleted Value : "+dq);
				else
					System.out.println("Queue Empty!!!!");
				break;
				
			case 3:
				fl.display();
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Invalid Input!");
					break;
					
			}
		}
		
	}

}
