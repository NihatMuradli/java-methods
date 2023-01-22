package scanner;

import java.util.Scanner;

public class sphere_radius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		int r = sc.nextInt();
		int radius = (int) Math.pow(r,3);
		System.out.println(Math.PI*radius*4/3);
		sc.close();
	}
}
