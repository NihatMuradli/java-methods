package scanner;

import java.util.Scanner;

public class sphere_area {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius");
	int r = sc.nextInt();
	int radius = (int) Math.pow(r,2);
	System.out.println(Math.PI*radius*4);
	sc.close();
}
}
