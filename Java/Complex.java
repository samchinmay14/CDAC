class Complex
{
	int real=0, imag=0;

	public Complex()
	{
	}
	public Complex(int r, int im)
	{
		real=r;
		imag=im;
	}
	public Complex(int im)
	{
		imag=im;
	}
	
	public void Displaycmp()
	{
		if(imag>0 && real!=0)
			System.out.println(real+"+"+imag+"i");
		else if(imag<0 && real!=0)
			System.out.println(real+""+imag+"i");
		else if(imag==0 && real!=0)
			System.out.println(real);
		else if(real==0 && imag!=0)
			System.out.println(imag+"i");
		else
			System.out.println(real);

	}
}