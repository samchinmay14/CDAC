package dynamicQueue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		DynamicQueue q=new DynamicQueue();
		int ch,d;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n----------------------------------------------------------------------------------------");
			System.out.print("Select your choice : ");
			System.out.println("\n1. enQueue\n2. deQueue\n3. Display\n-1. Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("Enter int data to enQueue : ");
				d=sc.nextInt();
				q.enQueue(d);
				System.out.println("Data EnQueued : "+d);
				break;
			case 2:
				d=q.deQueue();
				if(d==-9999)
					System.out.println("Queue Empty!");
				else
					System.out.println("Data DeQueued : "+d);
				break;
			case 3:
				q.display();
				break;
			case -1:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid Entry.");
			}
		}while(ch!=-1);
	}

}
