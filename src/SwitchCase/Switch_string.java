package SwitchCase;

import java.util.Scanner;

public class Switch_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qiyməti daxil edin.");
		String str = sc.next();
		switch (str) {
		case "IV": {
			System.out.println("Tapşırığı sərbəst yerinə yetirir.");
			break;
		}
		case "III": {
			System.out.println("Tapşırığı çətinliklə yerinə yetirir.");		
			break;
		}
		case "II": {
			System.out.println("Tapşırığı müəllimin köməyi ilə yerinə yetirir.");
			break;
		}
		case "I": {
			System.out.println("Tapşırığı yerinə yetirə bilmir.");	
			break;
		}
		default:
			System.out.println("Məlumatın düzgünlüyünü yoxlayın");
			break;
		}
	}

}
