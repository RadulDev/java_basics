import java.util.Scanner;
class SumArray{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int limit, i,j,sum=0;
		int [] arr = new int [15];
		
		System.out.print("enter a limit: ");
		limit = input.nextInt(); 
		
		for(i =0; i< limit; i++){
			System.out.print("a ["+ i +"] = ");
			arr[i] = input.nextInt();
			
		}
		//System.out.println(" array is : ");
		
		for(j=0;j<limit;j++){
			sum += arr[j];
			//System.out.println(arr[j]); 
		}
		
		System.out.println("Sum of array :" + sum);
		
	}

}
