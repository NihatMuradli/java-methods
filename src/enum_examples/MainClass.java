package enum_examples;

public class MainClass {

	public static void main(String[] args) {

		BMW X5 = new BMW();
		X5.name = "X5";
		X5.id = 1;
		X5.type = Type.SUV;
		System.out.println("Avtomobilin adı: "+X5.name);
		System.out.println("Avtomobilin növü: "+X5.type.i);
		
		BMW M5 = new BMW();
		M5.name = "M5";
		M5.id = 2;
		M5.type = Type.SEDAN;
		System.out.println("Avtomobilin adı: "+M5.name);
		System.out.println("Avtomobilin növü: "+M5.type.i);
		
	}

}
