package LL2;

import org.w3c.dom.Node;

public class LL 
	{
	Node head;
	Node move;	
	public LL()
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
	public void removeDuplicate()
	{
		move=head;
		while(move!=null)
		{
			Node del=move.next;
			while(move.data==move.next.data)
			{
				move.next=del.next;
				del=null;
			}
			move=move.next;
		}
	}
}
