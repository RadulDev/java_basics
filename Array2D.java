import java.util.Scanner;
class Array2D{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int row,col,i,j;
		int [][] arr = new int [15][15];
		
		System.out.print("enter row: ");
		row = input.nextInt(); 
		System.out.print("enter col: ");
		col = input.nextInt(); 
		
		System.out.println("enter "+ (row*col) + " numbers");
		
		for(i=0; i< row; i++){
			
			for(j=0;j<col;j++){
				
				arr[i][j] = input.nextInt();
			}
		
		}
		System.out.println("****** The matrix ******");
		
		for(i=0; i< row; i++){
			
			for(j=0;j<col;j++){
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
			}
}
}
