package P1;

public class Student implements Human{
	// Data/Attributes/Feilds
	public String name;
	public float age;

	protected float weight;

	boolean isGraduate;

	char grade = 'A';

	private long creditCardNo;
	
	
	public static int pq=10;

	// Constructor
	public Student() {

	}

	public Student(String na,float age  ) {
		this.name = na;
		this.age = age;
	}
	
	Student(String na,float age,long cCNo  ) {
		this.name = na;
		this.age = age;
		this.creditCardNo = cCNo;
	}

	// Operations/Methods
	void promote(int n) {
		// method body
		int x;
	}

	public void setCreditCardNo(long newccNo) {
		// do some security checks and then allow modification
		// send some OTP
//		if(OTP was entered correct) {
//			
//		this.creditCardNo=newccNo;
//		}
//		else
//		{
//			
//		}
	}

	/*
	 * The fee to be paid while joing
	 */
	void payFees(float fee) {

	}

	public void displayDetails(){
		System.out.println("Student's name: " + name);
		System.out.println("Age is " + this.age);	
	}
	
	// method to display Student’s age
	public void displayAge() {
		System.out.println("Age is " + this.age);
	}

	// method to display Student’s name
	void displayName() {
		System.out.println("Student's name: " + name);
	}

	void displayName(boolean inCaps) {
		if (inCaps == true)
			System.out.println("Student's name: " + name.toUpperCase());
		else
			System.out.println("Student's name: " + name);
	}

	void voteEligibility() {
		if (age >= 18) {
			System.out.println("Student is eligible to vote");
		} else {
			System.out.println("Student is not eligible to vote");
		}
	}

	@Override
	public void speak(String words) {
		System.out.println("Sir");
		System.out.println(words);
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	
	// static method demo
	public static void tellHi() {
		System.out.println("Hi " );
	}

	// return twice the age

}
