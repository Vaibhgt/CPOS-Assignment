//Java Program to multiply two binary number
class Ans18
{
	public static void main(String args[])
	{
		String num1="10";
		String num2="11";
		// used radix 2 because number is binary
		int number1=Integer.parseInt(num1,2);
		int number2=Integer.parseInt(num2,2);
		
		int Multiply=number1*number2;
		System.out.println(Integer.toBinaryString(Multiply));
	}
}
