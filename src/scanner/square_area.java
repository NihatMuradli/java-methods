package scanner;

import java.util.Scanner;

public class square_area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght");
		int a = sc.nextInt();
		int area = (int) Math.pow(a,2);
		System.out.println(area);
		sc.close();
	}
}
