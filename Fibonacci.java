import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("***** fibonacci *****");
		System.out.print("limit : ");
		int limit = input.nextInt();
		int num1=0,num2=1,num3;
		
		for(int i = 2; i <= (limit+1) ; i++){
			num3 = num1 + num2;
      			num1 = num2;
      			num2 = num3;
      			
      			System.out.println(num3);
		}
	}
}
