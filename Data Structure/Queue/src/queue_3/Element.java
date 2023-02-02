package queue_3;

public class Element 
{
	protected int data;
	protected int prio;
	
	public Element()
	{
		data=-1;
		prio=-1;
	}
	public Element(int d,int p)
	{
		data=d;
		prio=p;
	}

	public String toString()
	{
		return "Data:"+data+"\tPriority : "+prio+"\n";
	}
}
