package students;

import P1.Student;

public class ForiegnStudent extends Student{
	
	char grade = 'B';
	
	public String nationality;
	
	public ForiegnStudent(){
		super();		
	}
	
	public ForiegnStudent(String na,float age, String nationality ){
		super(na,age);
		this.nationality = nationality;		
	}
	
	void payFeesInDollars(float dollars){
		
	}
	
	
	//Overriding super class's displayDetails method
	public void displayDetails(){
//		System.out.println("Student's name: " + name);
//		System.out.println("Age is " + this.age);	
		
		super.displayDetails();
		
		System.out.println("Nationality is " + this.nationality);	
	}

}
