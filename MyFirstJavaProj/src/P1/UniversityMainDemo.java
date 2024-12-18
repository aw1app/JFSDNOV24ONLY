package P1;
import fruits.Apple;
import fruits.AppleLikeFruit;
import students.ForiegnStudent;

public class UniversityMainDemo {

	public static void main(String[] args) {
		
		System.out.println("Student class pq is "+Student.pq);
		
		Student stud1 = new Student();
		stud1.name="Joseph";
		stud1.age =34;
		
		
		stud1.displayAge();
		
		stud1.displayAge();
		
		stud1.displayAge();
		
		stud1.displayName();
		
		stud1.voteEligibility();
		
		
		
		stud1.displayName(true);
		
		// creditCardNo is decl as private in Student class ands therefore cannot be accessed here
		// stud1.creditCardNo = 56735646745662345L; 
		
		stud1.setCreditCardNo(56735646745662345L);
		
		
		Student stud2 = new Student();
		stud2.name="Kelly";
		stud2.age =54;
		
		stud2.voteEligibility();
		
		ForiegnStudent fstudent1 = new ForiegnStudent();
		fstudent1.name = "Jerry";
		fstudent1.age = 33;
		fstudent1.nationality="Namibia";
		
		fstudent1.displayAge();
		
		System.out.println("\n *** STUDENT 3 DETAILS ****");
		Student stud3 = new Student("Brian", 22.7f, 1234123456785678L);
		stud3.displayDetails();
		
		System.out.println("\n *** FORIEGN STUDENT 2 DETAILS ****");
		Student fstud2 = new ForiegnStudent("Johnny", 22.7f, "British");
		fstud2.displayDetails();
		
		System.out.println("\n *** POLYMORPHISM DEMO ****");
		Student fs1 = new ForiegnStudent();
		System.out.println(fs1.grade);
		fs1.displayDetails();
		
		
		//Apple a1 = new Apple(); // Apple class is abstract so we cannot create Apple objects
		
		// so we create subclass of Apple like AppleLikeFruit, impllement the abstract methods
		// Then we can instantiate and test out methods that are implemented!
		Apple a1 =  new AppleLikeFruit();
		a1.ripen();
		
		
		
		// Static variable demo
		System.out.println("\n\n ** Static variable demo **");
		System.out.println("Student class pq is "+Student.pq);
		System.out.println("stud1 pq is "+stud1.pq);
		System.out.println("stud2 pq is "+stud2.pq);
		stud2.pq = 100000;
		System.out.println("stud3 pq is "+stud3.pq);
		System.out.println("fs1 pq is "+fs1.pq);
		System.out.println("Student class pq is "+Student.pq);
		
		Student.tellHi();
		stud1.tellHi();
		stud2.tellHi();

	}

}
