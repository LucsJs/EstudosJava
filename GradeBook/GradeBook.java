import java.util.Scanner;

public class GradeBook {
	private String courseName;

	public GradeBook(String name) {
		setCourseName(name);
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {	
		return courseName;
	}
	
	public void displayMessage() {
		System.out.printf("Welcome to the GradeBook for\n%s!\n", getCourseName());
	}

	public void determineClassAvarage() {
		Scanner input = new Scanner(System.in);
		
		int gradeCounter = 0;
		int grade;
		int total = 0;
		double avarage;
		// solicitação de notas do usuário até ele digitar -1
		System.out.print("Enter grade (-1 to quit): ");
		grade = input.nextInt();
		while (grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;

			System.out.print("Enter grade (-1 to quit): ");
			grade = input.nextInt();
		}
		
		if (gradeCounter != 0) {
			avarage = (double) total / gradeCounter;		
		
			System.out.printf("\nTotal of all 10 grades: %d\n", total);
			System.out.printf("Class avarage is %.2f\n", avarage);
		} else {
			System.out.println("No grades were entered.");
		}
				
	}
}
