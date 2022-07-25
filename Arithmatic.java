import java.util.Scanner;



class Arithmatic{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("input first number : ");
		int num1 = input.nextInt();
		System.out.println("input second number : ");
		int num2 = input.nextInt();
		
		
		int c = num1 + num2;
		
		System.out.println("sum : "+c);
	}
}

