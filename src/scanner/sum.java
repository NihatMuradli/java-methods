package scanner;

import java.util.Scanner;

public class sum {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number");
	int first = sc.nextInt();
	System.out.println("Enter 2nd number");
	int second = sc.nextInt();
	System.out.println(first+second);
	sc.close();
}
}
