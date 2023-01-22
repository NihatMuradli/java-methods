package scanner;

import java.util.Scanner;

public class min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n1 = sc.nextInt();
		System.out.println("Enter number");
		int n2 = sc.nextInt();
		System.out.println(Math.min(n1, n2));
		sc.close();
	}
}
