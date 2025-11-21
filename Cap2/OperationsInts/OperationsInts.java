/* 
Esse programa solicita dois ints do usuário e imprime 4 operações aritméticas 
entre os dois
*/ 

import java.util.Scanner;

public class OperationsInts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2;

		System.out.print("Enter first integer: ");
		num1 = input.nextInt();

		System.out.print("Enter second integer: ");
		num2 = input.nextInt();

		int som, sub, mult, div;
		som = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		

		System.out.printf("%d + %d = %d\n", num1, num2, som);
		System.out.printf("%d - %d = %d\n", num1, num2, sub);
		System.out.printf("%d x %d = %d\n", num1, num2, mult);
		System.out.printf("%d / %d = %d\n", num1, num2, div);
	}
}