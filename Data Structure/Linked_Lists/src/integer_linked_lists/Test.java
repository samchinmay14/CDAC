package integer_linked_lists;
import java.util.Scanner;
public class Test {
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
			System.out.println("\n1. Add Node at End\n2. Add at Beginning\n3. Delete end\n4. Delete Beginning");
			System.out.println("5. Display First\n6. Display Last\n7. Display full Linked list.\n8. Count");
			System.out.println("9. Min-Max-Sum-Avg\n0. Exit");
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
				int d=l.delEnd();
				if(d==-1)
					System.out.println("Linked List Empty.");
				else
					System.out.println("Deleted : "+d);
				break;
			case 4:
				d=l.delBeg();
				if(d==-1)
					System.out.println("Linked List Empty.");
				else
					System.out.println("Deleted : "+d);
				break;
			case 5:
				l.printFirst();
				break;
			case 6:
				l.printLast();
				break;
			case 7:
				l.display();
				break;
			case 8:
				System.out.println("Count : "+l.countNodes());
				break;
			case 9:
				int[]arr=l.MinMaxSumAvg();
				if(arr[0]!=-1)
				{
					System.out.println("Minimum value : "+arr[0]);
					System.out.println("Maximum value : "+arr[1]);
					System.out.println("Sum : "+arr[2]);
					System.out.println("Average : "+arr[3]);
				}
				else
					System.out.println("Linked List Empty.");
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid Entry!");
					break;
			}
		}
	}
}