import java.util.Scanner;

class Great3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println(" ***** check largest number amoung 3 ***** ");
		System.out.print(" num1 : ");
		num1 = input.nextInt();
		System.out.print(" num2 : ");
		num2 = input.nextInt();
		System.out.print(" num3 : ");
		num3 = input.nextInt();
		
		if(num1 == num2 && num2 == num3){
			System.out.println(" numbers are equal");
			
		}else if(num1>num2 && num1>num3){
			System.out.println(num1 + " is greatest.");
		}else if(num2>num1 && num2>num3){
			System.out.println(num2 + " is greatest.");
		}else if(num3>num1 && num3>num2){
			System.out.println(num3 + " is greatest.");
		}else{
			System.out.println("check your input.");
		}
	}
}
