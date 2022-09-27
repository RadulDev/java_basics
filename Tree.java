import java.util.Scanner;

class Tree{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter number of level:");
	int level = input.nextInt();

	for(int i=1;i<level;i++){

		for(int j=1; j<i; j++){
			System.out.println(j + " ");
			}
		System.out.println("");
		}
	}

}
