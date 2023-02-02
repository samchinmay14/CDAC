package integer_linked_lists;
public class Node 
{
	int data;
	Node next;
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
}