class Box
{
	int ht=1,wd=1,dp=1;
	public Box()
	{
		
	}
	public Box(int h, int w, int d)
	{
		ht=h;
		wd=w;
		dp=d;
	}
	public Box(int h,int w)
	{
		ht=h;
		wd=w;
	}
	public Box(int s)
	{
		ht=s;
		wd=s;
		dp=s;
	}
	public void volume()
	{
		int vol=ht*wd*dp;
		System.out.println("Volume = "+vol);
	}
}