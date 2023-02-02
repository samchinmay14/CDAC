class Calculator
{
	int no1=2,no2=2;
	
	public Calculator()
	{
	}
	public Calculator(int n, int m)
	{
		no1=n;
		no2=m;
	}
	
	public void addition()
	{
		int sum=no1+no2;
		System.out.println("Addition = "+sum);
	}
	public void subtraction()
	{
		int diff=no1-no2;
		System.out.println("Subtraction = "+diff);
	}
	public void multiplication()
	{
		int mul=no1*no2;
		System.out.println("Multiplication = "+mul);
	}	
	public void division()
	{
		int div=no1/no2;
		System.out.println("Division = "+div);
	
	}
}