package scanner;

import java.util.Scanner;

public class circle_diameter {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter diametre");
	int diameter = sc.nextInt();
	System.out.println(Math.PI*diameter);
	sc.close();
}
}
