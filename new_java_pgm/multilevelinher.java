import java.util.Scanner;
class Student{
	String name;
	int rollno;
	Scanner input = new Scanner(System.in);
	void getNumber(){
		System.out.print("Enter the roll no:");
		rollno=input.nextInt();
	}

	void putNumber(){
		System.out.println("Rollno:" +rollno);
	}

	void getName(){
		System.out.print("Enter your name:");
		name = input.next();
	}

	void putName(){
		System.out.println("Name:" +name);
	}
}

class Marks extends Student{
	int mark1;
	int mark2;
	void getMarks(){
		getName();
		System.out.print("Enter the marks of two subjects:");
		mark1=input.nextInt();
		mark2=input.nextInt();
	}

	void putMarks(){
		System.out.println("obtained marks are");
		System.out.println("mark of 1st subject=" + mark1);
		System.out.println("mark of second subject=" + mark2); }
	}

class Sports extends Marks{
	int score;
	int total;
	void getScore(){
		getNumber();
		getMarks();
		System.out.print("Enter the sports score=");
		score=input.nextInt();
	}
	void putScore(){
		System.out.println("sports score=" + score);
	}
	void display(){
		System.out.println("****Student Details are****");
		total=mark1+mark2+score;
		putName();
		putNumber();
		putMarks();
		putScore();
		System.out.println("Total mark=" +total); 
	}
}

class multilevelinher{
	public static void main(String args[]){
	Sports s1=new Sports();
	s1.getScore();
	s1.putScore();
	s1.display();
	}
}