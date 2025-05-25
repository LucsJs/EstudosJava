import java.util.Scanner;

public class Ordenation1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.print("Enter first integer: ");
		a = input.nextInt();

		System.out.print("Enter second integer: ");
		b = input.nextInt();

		System.out.print("Enter third integer: ");
		c = input.nextInt();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.printf("Em ordem fica: %d %d %d", a, b, c);
	}
}