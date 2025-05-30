import java.util.Scanner;

public class Analysis {
	public static void main(String[] args) {
		int studentCounter = 1;
		int result;
		int passes = 0;
		int failures = 0;

		Scanner input = new Scanner(System.in);

		while (studentCounter <= 10) {
			System.out.print("\nEnter result(1 = pass, 2 = fail) ");
			result = input.nextInt();
			
			if (result == 1) {
				passes++;
			} else {
				failures += 1;
			}
			
			studentCounter++;
		}
		System.out.printf("\nPassed: %d\nFailed: %d\n", passes, failures);

		if (passes > 8) {
			System.out.println("Bonus to instructor!");
		}
	}
}