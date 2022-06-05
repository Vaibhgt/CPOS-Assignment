// Java program to convert binary number into decimal number
class Ans19
{
	public static void main(String args[])
	{
		int n=5;
		String bin="";
		while(n>0)
		{
		int r=n%2;
		bin = bin+r;
		n=n/2;
		}
		System.out.println(bin);
	}
}
		