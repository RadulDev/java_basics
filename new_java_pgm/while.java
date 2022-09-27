import java.util.Scanner;
class Squaresum{
	public static void main(String args[]){
		int limit,count, num = 1, sum = 0;
		System.out.println("Enter the limit:");
		Scanner input = new Scanner(System.in);
		limit = input.nextInt();
		System.out.println("The squares of the numbers upto " + limit + " are:");

		while(num <= limit){
			count = num * num;
			num = num + 1;
			sum = sum + count;
			System.out.println(count);
		}
	System.out.println("The sum of the squares:" + sum);
	}
}
