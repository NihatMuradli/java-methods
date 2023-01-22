package scanner;

import java.util.Scanner;

public class rectangle_area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		double h = sc.nextInt();
		System.out.println("Enter width");
		double w = sc.nextInt();
		System.out.println("Area"+h*w);
		double sum = h + w;
		System.out.println("Perimeter"+2*sum);
		sc.close();
	}
}
