package dynamicQueue;

public class DynamicQueue 
{
	private Node front,rear;
	public DynamicQueue()
	{
		front=rear=null;
	}
	public boolean isEmpty()
	{
		return front==null;
	}
	public void enQueue(int d)
	{
		Node record=new Node(d);
		if(front==null)
			front=rear=record;
		else
		{
			rear.setNext(record);
			rear=record;
		}
	}
	public int deQueue()
	{
		int data=-99;
		if(!isEmpty())
		{
			Node del=front;
			data=front.getData();
			if(front!=rear)
				front=front.getNext();
			else
				front=rear=null;
			del=null;
		}
		return data;
	}
	public void display()
	{
		Node move=front;
		for(;move!=null;move=move.getNext())
		{
			System.out.print(move);
		}
	}
}
