import java.util.Scanner;
class Student{
	String name;
	int rollno;
	Scanner input = new Scanner(System.in);
	void getNumber(int n){
		rollno=n;
		System.out.print("Enter your name:");
		name = input.next();
	}

	void putNumber(){
		System.out.println("Rollno:" +rollno);
	}
}

class Marks extends Student{
	int mark1;
	int mark2;
	void getMarks(int m1,int m2){
		mark1=m1;
		mark2=m2;
	}
	void putMarks(){
		System.out.println("**Obtained marks are**");
		System.out.println("mark1=" + mark1);
		System.out.println("mark2=" + mark2);
	}
}

interface Sports{
	int sportW=10;
	void putW();
}

class Results extends Marks implements Sports {
	int total;
	public void putW(){
		System.out.println("sports marks:" +sportW); 
	}
	void display(){
		total=mark1+mark2+sportW;
		putNumber();
		putMarks();
		putW();
		System.out.println("__Total mark=" +total); 
	}
}

class multilevel{
	public static void main(String args[]){
		Results s1=new Results();
		s1.getNumber(12);
		s1.getMarks(34,67);
		s1.display();
	}
}