package methods;

public class Name {
 public static void main(String[] args) {
	 Name myName = new Name();
	 System.out.println("main-1");
	 System.out.println("main-2");
	 myName.sayMyName("Heisenberg");
	 System.out.println("main-3");
	 System.out.println("main-4");
}

 public  void sayMyName(String s) {
	System.out.println(s);
	
 }
}
