//Write a java program to convert a decimal number to octal number number
class Ans21
{
	public static void main(String args[])
	{
		int n=15;
		String bin="";
		while(n>0)
		{
		int r=n%8;
		bin=bin+r;
		n=n/8;
		}
		System.out.println(bin);
		//further we need to reverse string
	}
}
		