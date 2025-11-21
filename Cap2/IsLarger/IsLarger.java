/*
Solicita dois ints do usuário e compara-os
*/

import java.util.Scanner;

public class IsLarger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int larger = 0;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		if (num1 > num2) larger = num1;
		if (num2 > num1) larger = num2;
		if (larger == 0) System.out.println("These numbers are equal.");
		if (larger != 0) System.out.printf("%d is larger.\n", larger);
	}
}