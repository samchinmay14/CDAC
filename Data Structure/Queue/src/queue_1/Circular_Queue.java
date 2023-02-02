package queue_1;

public class Circular_Queue 
{
	private int rear;
	private int front;
	private int size;
	private int[]arr;
	
	public Circular_Queue()
	{
		front=rear=-1;
		size=5;
		arr=new int[size];
	}
	public Circular_Queue(int size)
	{
		front=rear=-1;
		this.size=size;
		arr=new int[size];
	}
	
	public boolean isFull()
	{
		return front==(rear+1)%size;
	}
	
	public boolean isEmpty()
	{
		return front==-1;
	}
	
	public void enQueue(int n)
	{
		
		if(!isFull())
		{
			if(front==-1)
			{
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=n;
		}
		else
			System.out.println("Queue Full!!");
		
	}
	
	public int deQueue()
	{
		int d=-9999;
		if(!isEmpty())
		{
			d=arr[front];
			if(front==rear)
			{
				front=rear=-1;
			}
			else
			{
				front=(front+1)%size;
			}
		}
		return d;
	}
	
	public void display()
	{
		if(front!=-1)
		{
			for(int i=front;i!=rear;i=(i+1)%size)
			{
				System.out.print(arr[i] +" ");
			}
			System.out.println(arr[rear]);
		}
		else
			System.out.println("Queue Empty!!");
		System.out.println("\nFront : "+front+"\nRear : "+rear);
	}
}
