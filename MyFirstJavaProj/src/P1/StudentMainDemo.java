package P1;
import ForiegnStudent;

public class StudentMainDemo {

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
		
		
		Student stud2 = new Student();
		stud2.name="Kelly";
		stud2.age =54;
		
		stud2.voteEligibility();
		
		ForiegnStudent fstudent1 = new ForiegnStudent();
		fstudent1.name = "Jerry";
		fstudent1.age = 33;
		fstudent1.nationality="Namibia";
		
		fstudent1.displayAge();

	}

}
