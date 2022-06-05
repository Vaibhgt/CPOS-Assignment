import java.util.Scanner;
class Ans7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			int y=a*i;
			System.out.println(a+" X "+i+" = "+y);
		}
	}
}