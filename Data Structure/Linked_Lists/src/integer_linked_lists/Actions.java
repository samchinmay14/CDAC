package integer_linked_lists;

import java.util.Scanner;

public class Actions 
{
	public static void main(String[] args) 
	{
		Linked_List l=new Linked_List();
		Scanner sc=new Scanner(System.in);
		int ch=77;
		int data;
		while(ch!=0)
		{
			System.out.println("\n----------------------------------------------------------\n");
			System.out.println("Enter your Choice : ");
			System.out.println("\n1. Add Node at End\n2. Add at Beginning\n3. Delete Mid\n4. Remove Duplicate Elements");
			System.out.println("5. Merge two Linked Lists\n6. Split Even-Odd\n7. Display full Linked list.\n8. Print Reverse");
			System.out.println("9. Reverse\n10. Sort\n0. Exit");
			System.out.println("\n----------------------------------------------------------\n");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.print("Enter data :");
				data=sc.nextInt();
				l.addNodeEnd(data);
				break;
			case 2:
				data=sc.nextInt();
				l.addNodeBeg(data);
				System.out.print("Enter data :");
				break;
			case 3:
				System.out.println("Enter data to delete : ");
				data=sc.nextInt();
				l.delMid(data);
				break;
			case 4:
				break;
			case 5:
				Linked_List l1=new Linked_List();
				Linked_List l2=new Linked_List();
				data=0;
				System.out.println("Enter first Linked List. Enter '-99' to stop : ");
				while(data!=-99)
				{
					data=sc.nextInt();
					if(data!=-99)
						l1.addNodeEnd(data);
					
				}
				l1.display();
				System.out.println("\n----\n");
				System.out.println("Enter Second Linked List. Enter '-99' to stop : ");
				data=0;
				while(data!=-99)
				{
					data=sc.nextInt();
					if(data!=-99)
						l2.addNodeEnd(data);
					
				}
				l2.display();
				System.out.println("\n---\n");
				l1.Merge(l2);
				break;
			case 6:
				System.out.println("Original : ");
				l.display();
				l.SplitEvenOdd();
				break;
			case 7:
				l.display();
				break;
			case 8:
				l.printReverse();
				break;
			case 9:
				l.reverse();
				l.display();
				break;
			default:
				System.out.println("Invalid Entry!!");
			}
		}
	}
}
