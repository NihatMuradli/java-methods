package SwitchCase;

import java.util.Scanner;

public class Switch_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Simvolu daxil edin");
		char i = sc.next().charAt(0);
		switch (i) {
		case 'A': {
			System.out.println("Əla");
			break;
		}
		case 'B': {
			System.out.println("Yaxşı");		
			break;
		}
		case 'C': {
			System.out.println("Kafi");
			break;
		}
		case 'F': {
			System.out.println("Qeyri Kafi");	
			break;
		}   
		default:
			System.out.println("Məlumatın düzgünlüyünü yoxlayın");
			break;
		}
	}

}
