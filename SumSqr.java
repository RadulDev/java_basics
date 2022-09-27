import java.util.Scanner;

class SumSqr{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println(" enter the limit : ");
		int limit = input.nextInt();
		int product = 0;
		for(int i=0; i<= limit; i++){
			product = i*i;
			product += product;
		}
		System.out.println("sum of square is : "+ product);
	}
}
