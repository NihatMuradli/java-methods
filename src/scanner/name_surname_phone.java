package scanner;

import java.util.Scanner;

public class name_surname_phone {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name");
	String name = sc.nextLine();
	System.out.println("Hello," + name);
	System.out.println("Enter Surname");
	String surname = sc.nextLine();
	System.out.println("Hello," + surname);
	System.out.println("Enter Phone Number");
	int phone = sc.nextInt();
	System.out.println("Your Number," + phone);
	sc.close();
}
}
