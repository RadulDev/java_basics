import java.util.Scanner;

class PrimeNo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print(" enter no to check prime or not : ");
		int number = input.nextInt();
		int count = 0;
		
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
				count = count+1 ;
			}
		System.out.println(count);
		if(count > 2)
			System.out.println("not a prime number");
		else
			System.out.println(" its a prime number");
		
		
	}
}
