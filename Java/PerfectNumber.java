public class PerfectNumber
{
	public static void main(String[]args)
	{
		int num=496, sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("\n"+num+" is a Perfect Number!");
		}
		else
			System.out.println("\n"+num+" is NOT a Perfect Number!");
	}
}