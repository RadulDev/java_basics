import java.util.Scanner;
class Rect{
	void area(){
		int width;
		int height;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the height:");
		height = input.nextInt();
		System.out.println(" Enter the width:");
		width=input.nextInt();
		int area=width*height;
		System.out.println("Area of rectangle="+area);
	}
}
class rectangle{
	public static void main(String args[]){
		Rect r1=new Rect();
		r1.area();
	}
}
