import java.util.Scanner;

class Calculator{

	public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);
	
	int a,b,result, option;
	System.out.println("select option \n 1. Addition  2. Subtraction \n 3.Multiplication 4. Division");
	option = input.nextInt();
	System.out.println(" enter first number : ");
	a = input.nextInt();
	System.out.println(" enter second number : ");
	b = input.nextInt();
	
	switch(option){
	
	case(1): 
	result = a + b;
	System.out.println(" the sum of " +a+" + "+b+" is : "+result);
	break;
	
	case(2): 
	result = a - b ;
	System.out.println(" the difference of " +a+" - "+b+" is : "+result);
	break;
	
	case(3): 
	result = a * b ;
	System.out.println(" the product of " +a+" x "+b+" is : "+result);
	break;
	
	case(4): 
	result = a / b ;
	System.out.println(" the quotient of " +a+" / "+b+" is : "+result);
	break;
	
	default:System.out.println("Invalid selection !");  
	}
	}
}
