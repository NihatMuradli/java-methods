package scanner;

import java.util.Scanner;

public class ceil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double number = sc.nextDouble();
		int result = (int) Math.ceil(number);
		System.out.println(result);
		sc.close();
	}
}
