class Ans10
{
	public static void main(String args[])
	{
		//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		double a1=4.0;
		int b1=1;
		double c1=1.0;
		int d1=3;
		int e1=5;
		int f1=7;
		int g1=9;
		int h1=11;
		
		double x=a1*(b1-(c1/d1)+(c1/e1)-(c1/f1)+(c1/g1)-(c1/h1));
		System.out.println(x);
	}
}
		
		