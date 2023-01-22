package scanner;

import java.util.Scanner;

public class floor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		double number = sc.nextDouble();
		int result = (int) Math.floor(number);
		System.out.println(result);
		sc.close();
	}
}
