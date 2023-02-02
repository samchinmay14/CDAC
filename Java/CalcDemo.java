public class CalcDemo
{
	public static void main(String[]args)
	{
		Calculator c1=new Calculator();
		c1.addition();
		c1.subtraction();
		c1.multiplication();
		c1.division();

		Calculator c2=new Calculator();
		c2.addition(42,6);
	}
}