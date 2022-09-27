import java.util.Scanner;
class Find{
	int count, fact = 1;
	void read(){
		System.out.println("Enter a limit:");
		Scanner input = new Scanner(System.in);
		count = input.nextInt();
		}
	}
class Show extends Find{
	void print(){
		read();
		while(count >= 1){
			fact = fact * count;
			count = count - 1;
		}
		System.out.println("The factorial of the given number: " + fact);
	}
}

class Fact{
	public static void main(String args[]){
		Show obj = new Show();
		obj.print();
	}
}