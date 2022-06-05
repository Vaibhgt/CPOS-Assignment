import java.util.Scanner;
class Ans15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter x");
		int x=sc.nextInt();
		System.out.println("Please enter y");
		int y=sc.nextInt();
		int temp=x;
		x=y;
		y=temp;
		System.out.println("x is = "+x);
		System.out.println("y is = "+y);
	}
}
		
		