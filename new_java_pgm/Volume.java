import java.util.Scanner;
class Area{
	int length,width;
	Scanner ob=new Scanner(System.in);
	void input1(){
		System.out.println("Enter the length and width:");
		length=ob.nextInt();
		width=ob.nextInt();
	}
}

class volume extends Area{
	int height;
	void input2(){
		input1();
		System.out.println("Enter the height:");
		height=ob.nextInt();
	}
	void show(){
		System.out.println("Enter the length =" +length);
		System.out.println("Enter the width =" +width);
		System.out.println("Area =" +length*width);
		System.out.println("Enter the height =" +height);
		System.out.println("volume =" +length*width*height);
	}
}

class VOLUME1{
	public static void main(String args[]){
		volume v = new volume ();
		v.input2();
		v.show();
	}
}