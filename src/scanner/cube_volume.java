package scanner;

import java.util.Scanner;

public class cube_volume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter surface area");
		int s = sc.nextInt();
		int side = s/6;
		Math.sqrt(side);
		int result = (int) Math.pow(Math.sqrt(side), 3);
		System.out.println(result);
		sc.close();

	}

}
