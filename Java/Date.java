class Date
{
	int dd=1, mm=11, yy=1111;
	public Date()
	{
		
	}
	public Date(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}