import java.util.Scanner;
class Nested
	{
	public static void main(String args[])
		{
			int number;
			System.out.println("Enter a number:");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			
			if(number <= 100)
			{
				if(number <= 50)
				{
					System.out.println("The number is less than 50");
				}
				else
				{
					System.out.println("The number is less than 100");
				}
			}
			else if(number > 100)
			{
				System.out.println("The number is greater than 100");
			}
		}
	}