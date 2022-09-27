import java.util.Scanner;
class TryCatch {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		try{
			int n;
			System.out.print("Enter the number=");
			n=ob.nextInt();
			int data=n/0;
		}

		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}