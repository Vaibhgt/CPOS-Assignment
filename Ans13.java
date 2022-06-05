import java.util.Scanner;
class Ans13
{
	public static void main(String args[])
	{
		float Width=5.6f;
		float Height=8.5f;
		float Area=Width*Height;
		float Perimeter=2*(Height+Width);
		System.out.println("Area is "+Width+" * "+Height+" = "+Area);
		System.out.println("Perimeter is 2 * "+"(5.6 + 8.5)"+" = "+Perimeter);
	}
}

/*Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

