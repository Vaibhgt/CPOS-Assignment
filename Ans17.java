class Ans17
{
	public static void main(String args[])
	{
		// program to add two binary numbers
		String num1="10";
		String num2="11";
		
		int number1=Integer.parseInt(num1,2);
		int number2=Integer.parseInt(num2,2);
		
		int sum = number1 + number2;
		System.out.println(Integer.toBinaryString(sum));
	}
}
		
		