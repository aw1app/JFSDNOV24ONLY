package P1;
import students.ForiegnStudent;

public class UniversityMainDemo {

	public static void main(String[] args) {
		
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
		stud3.displayAge();

	}

}
