package integer_linked_lists;
public class Linked_List 
{
	Node head;
	Node move;	
	public Linked_List()
	{
		head=null;
	}
	public int countNodes()
	{
		int count=0;
		if(!isEmpty())
		{
			count=1;
			move=head;
			while(move.next!=null)
			{
				move=move.next;
				count++;
			}
		}	
		return count;
	}
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else 
			return false;
	}
	public void addNodeEnd(int data)
	{
		Node n=new Node(data);
		
		if(head==null)
		{
			head=n;
		}
		else
		{
			move=head;
			while(move.next!=null)
				move=move.next;
			move.next=n;
		}
	}
	public void addNodeBeg(int n)
	{
		Node newn=new Node(n);
		newn.next=head;
		head=newn;
	}
	public int delBeg()
	{
		int d;
		if(!isEmpty())
		{
			d=head.data;
			move=head;
			head=head.next;
			move.next=null;
		}
		else
			d=-1;
		return d;
	}
/*``public int delEnd()
	{
		 Node del;
		 Node move=head;
		 while(move.next.next!=null)
			 move=move.next;
		 del=move.next;
		 move.next=null;
		 return del.data;
	}*/
	public int delEnd()
	{
		int d;
		if(!isEmpty())
		{
			int c=countNodes()-1;
			if(c==0)
			{
				d=head.data;
				head=null;
			}
			else
			{
				move=head;
				while(c>1)
				{
					move=move.next;
					c--;
				}
				d=move.next.data;
				move.next=null;
			}
		}
		else
			d=-1;
		return d;
	}
	public void delMid(int d)
	{
		move=head;
		Node temp;
		if(head.data==d)
		{
			delBeg();
			System.out.println("Deleted Element : "+d);
		}
		while(move.next!=null)
			{
				temp=move.next;
				if(temp.next!=null)
				{
					if(temp.data==d)
					{
						move.next=temp.next;
						System.out.println("Deleted Element : "+d);
						break;
					}
					else
						move=move.next;
				}
				else if(temp.data==d)
				{
					int s=delEnd();
					System.out.println("Deleted Element : "+d);
					return;
				}
			}
		
		 
	}
	public void printFirst()
	{
		if(!isEmpty())
		{
			System.out.println("\nFirst : "+head);
		}
		else
			System.out.println("Linked List Empty.");
	}
	public void printLast()
	{
		if(!isEmpty())
		{
			move=head;
			while(move.next!=null)
				move=move.next;
			System.out.println("\nLast : "+move);
		}
		else
			System.out.println("Linked List Empty.");
	}
	public int[] MinMaxSumAvg()
	{
		if(!isEmpty())
		{
			Node move=head;
			int min=head.data;
			while(move!=null)
			{
				if(min>move.data)
					min=move.data;
				move=move.next;
			}
			int max=head.data;
			move=head;
			while(move!=null)
			{
				if(max<move.data)
					max=move.data;
				move=move.next;
			}
			int sum=0;
			move=head;
			while(move!=null)
			{
				sum=sum+move.data;
				move=move.next;
			}
			int avg=sum/countNodes();
			int[] arr= {min,max,sum,avg};
			return arr;
		}
		else
		{
			int[]arr= {-1,-1,-1,-1};
			return arr;
		}
	}
	public void Merge(Linked_List l2)
	{
		Node h2=l2.head;
		Node move=head;
		while(move.next!=null)
			move=move.next;
		move.next=h2;
		display();
	}
	public void SplitEvenOdd()
	{
		move=head;
		Linked_List e=new Linked_List();
		Linked_List o=new Linked_List();
		while(move!=null)
		{
			if(move.data%2==0)
				e.addNodeEnd(move.data);
			else
				o.addNodeEnd(move.data);
			move=move.next;
		}
		e.display();
		o.display();
	}
	public void reverse()
	{
		Node p1,p2,p3;
		p1=head;
		p2=p1.next;
		p3=p2.next;
		while(p2!=null)
		{
			p2.next=p1;
			p1=p2;
			p2=p3;
			if(p3!=null)
				p3=p3.next;
		}
		head.next=null;
		head=p1;
	}
	public void printReverse()
	{
		Node temp,tag;
		for(temp=head;temp.next!=null;temp=temp.next);
		while(temp!=head)
		{
			System.out.print(temp);
			for(tag=head;tag.next!=temp;tag=tag.next);
			temp=tag;
		}
		System.out.print(head);
	}
	public void display()
	{
		System.out.println("\n------------------------------------------------------------\n");
		if(!isEmpty())
		{
			move=head;
			while(move!=null)
			{
				System.out.print(move);
				move=move.next;
			}
		}
		else
			System.out.println("Linked List Empty.");
	}
}