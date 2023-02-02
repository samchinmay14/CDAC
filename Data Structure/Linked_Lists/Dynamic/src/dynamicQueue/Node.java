package dynamicQueue;
public class Node 
{
	private int data;
	private Node next;
	public Node()
	{
		data=-1;
		next=null;
	}
	public Node(int d)
	{
		data=d;
	}
	public String toString()
	{
		return "("+data+")->";
	}
	public int getData()
	{
		return data;
	}
	public void  setData(int d)
	{
		data=d;
	}
	public Node getNext()
	{
		return next;
	}
	public void setNext(Node n)
	{
		
		next=n;
	}
}