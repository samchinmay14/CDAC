package queue_3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tEnter Circular-Queue Size : ");
		
		int s=sc.nextInt();
		Queue_prio pq=new Queue_prio(s);
		Element e;
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
				System.out.println("Enter its priority out of 10: ");
				int p=sc.nextInt();
				e=new Element(d,p);
				pq.enQueue(e);
				System.out.println("Enqued enQueue : "+d+", "+p);
				break;
				
			case 2:
				Element dq=pq.deQueue();
				if(dq.data!=-9999)
					System.out.println("Deleted Value : "+dq);
				else
					System.out.println("Queue Empty!!!!");
				break;
				
			case 3:
				pq.display();
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
