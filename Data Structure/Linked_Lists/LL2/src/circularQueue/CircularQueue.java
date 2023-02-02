package circularQueue;

public class CircularQueue 
{
	private int[]arr;
	private int size;
	private int  front,rear;
	public CircularQueue()
	{
		front=rear=-1;
		size=5;
		arr=new int[5];
	}
	public CircularQueue(int s)
	{
		front=rear=-1;
		size=s;
		arr=new int[size];
	}
	public boolean isFull()
	{
		return front==(rear+1)%size;
	}
	public void enQueue(int d)
	{
		if(front==-1)
		{
			arr[++front]=d;
			rear++;
		}
		else
		{
			arr[++rear]=d;
		}
	}
	public int deQueue()
	{
		int d=-999;
		
		return d;
	}
}
