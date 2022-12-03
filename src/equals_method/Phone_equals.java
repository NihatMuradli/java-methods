package equals_method;

public class Phone_equals {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.model="Samsung";
		p1.price=1600;
		
		Phone p2 = new Phone();
		p2.model="N";
		p2.price=1600;
		
		boolean b = p1.equals(p2);
		System.out.println(b);
	}

}
