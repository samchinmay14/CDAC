package queue_4;

public class Book 
{
	protected int bid;
	protected String bname;
	protected double price;
	
	public Book()
	{
		bid=-1;
		bname=null;
		price=-1;
	}
	public Book(int id, String n, double pr)
	{
		bid=id;
		bname=n;
		price=pr;
	}
	
	public String toString()
	{
		return "\nBook ID : "+bid+"\tName : "+bname+"\tPrice : "+price;
	}
}
