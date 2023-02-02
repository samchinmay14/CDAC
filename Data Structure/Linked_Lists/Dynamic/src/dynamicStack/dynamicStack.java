package dynamicStack;

import dynamicQueue.Node;

public class dynamicStack 
{
	private Node top;
	public dynamicStack()
	{
		top=null;
	}
	public void push(int d)
	{
		Node record=new Node(d);
		if(top!=null)
		{
			record.setNext(top);
			top=record;
		}
		else
		{
			top=record;
		}
	}
	public int pop()
	{
		int d=-999;
		if(top!=null)
		{
			d=top.getData(); 
			top=top.getNext();
		}
		return d;
	}
	public void display()
	{
		Node move=top;
		if(top!=null)
		{
			for(;move!=null;move=move.getNext())
			
			{
				System.out.print(move);
			}
		}
		else
			System.out.println("Stack Empty!!");
	}
}
