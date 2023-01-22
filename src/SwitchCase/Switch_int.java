package SwitchCase;

import java.util.Scanner;

public class Switch_int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qiyməti daxil edin.");
		int i = sc.nextInt();
		switch (i) {
		case 5: {
			System.out.println("Əla");
			break;
		}
		case 4: {
			System.out.println("Yaxşı");		
			break;
		}
		case 3: {
			System.out.println("Kafi");
			break;
		}
		case 2: {
			System.out.println("Qeyri Kafi");	
			break;
		}
		default:
			System.out.println("Məlumatın düzgünlüyünü yoxlayın");
			break;
		}
	}

}
