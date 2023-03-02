package javafsdpracticeproject;

import java.util.Scanner;

public class PP1ArithmeticCalculator {
	public static void main(String[] args) {
		System.out.println("Calculator");

		System.out.println("Enter two numbers :");

		Scanner sc = new Scanner(System.in);

		double op1 = sc.nextInt();
		double op2 = sc.nextInt();

		System.out.println("select Operation: +,-,*,/");

		char op = sc.next().charAt(0);

		double result = 0;

		switch (op) {
		case '+':
			result = op1 + op2;
			break;
		case '-':
			result = op1 - op2;
			break;
		case '*':
			result = op1 * op2;
			break;
		case '/':
			result = op1 / op2;
			break;
		default:
			System.out.println("Enter Correct Inputs");
		}

		System.out.println("Result :3");
		System.out.println(op1 + " " + op + " " + op2 + " = " + result);
	}
}
