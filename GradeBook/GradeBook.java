import java.util.Scanner;

public class GradeBook {
	private String courseName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;


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

	public void incrementLetterGradeCounter(int grade) {
		switch (grade/10) {
			case 9:
			case 10:
				aCount++;
				break;
			case 8:
				bCount++;
				break;
			case 7:
				cCount++;
				break;
			case 6:
				dCount++;
				break;
			default:	
				fCount++;
				break;
		}
	}

	public void inputGrades() {
		Scanner input = new Scanner(System.in);
		int grade;

		System.out.printf("%s \n%s \n", 
			"Enter the integer grades in the range 0-100.",
			"Type EOF indicator to terminate the input:");
		
		while (input.hasNext()) {
			grade = input.nextInt();
			total += grade;
			++gradeCounter;

			incrementLetterGradeCounter(grade);			
		}
	}

	public void displayGradeReport() {
		System.out.println("\nGrade Report: ");
		
		if (gradeCounter != 0) {
			double avarage = (double) total / gradeCounter;
			System.out.printf("Total of the %d grades entered is %d\n", total, 
			gradeCounter);

			System.out.printf("Class Avarage: %.2f\n", avarage);
			System.out.printf("%s \n%s %d \n%s %d \n%s %d \n%s %d \n%s %d \n", 
				"Number of students who received each grade:",
				"A:", aCount,
				"B:", bCount,
				"C:", cCount,
				"D:", dCount,
				"F:", fCount);	
		} else {
			System.out.println("No grades were entered.");
		}
	}
}






















