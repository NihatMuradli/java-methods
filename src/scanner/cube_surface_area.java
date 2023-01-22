package scanner;

import java.util.Scanner;

public class cube_surface_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l = sc.nextInt();
		int length = (int) Math.pow(l,2);
		System.out.println(6*length);
		sc.close();
	}

}
