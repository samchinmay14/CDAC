class Point
{
	int x=0,y=0;
	public Point()
	{
	}
	public Point(int a, int b)
	{
		x=a;
		y=b;
	}
	public Point(int a)
	{
		x=a;
	}
	public void coord()
	{
		System.out.println("["+x+","+y+"]");
	}
}