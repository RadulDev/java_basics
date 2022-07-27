import java.util.Scanner;

class DiagonalSum{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int [][] array = new int [15][15];
		int i,j,row,col,sum=0;
		
		System.out.print("enter row: ");
		row = input.nextInt(); 
		System.out.print("enter col: ");
		col = input.nextInt(); 
		
		System.out.println("enter "+ (row*col) + " numbers");
		
		for(i=0; i< row; i++){
			
			for(j=0;j<col;j++){
				
				array[i][j] = input.nextInt();
			}
			}
			
		System.out.println("****** The matrix ******");
		
		for(i=0; i< row; i++){
			
			for(j=0;j<col;j++){
				
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
			}
		System.out.println("****** The Diagonal matrix ******");
		
		for(i=0; i< row; i++){
			
			for(j=0;j<col;j++){
				
				if(i == j){
					System.out.print(array[i][j] + " ");
					sum += array[i][j]; 
				}
				}
			//System.out.println(" ");
			}
			System.out.println(" sum = "+ sum);
		}
		
	}

