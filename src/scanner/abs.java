package scanner;

import java.util.Scanner;

public class abs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		System.out.println(Math.abs(number));
		sc.close();
	}

}
