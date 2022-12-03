package static_code_block;

public class main_static_code_block {
	public static void main(String[] args) {
		
	}
	static {
		System.out.println("static 1");
	}
	static {
		System.out.println("static 2");
	}
	static {
		System.out.println("static 3");
	}
	static {
		System.out.println("static 4");
		static_method();
	}
	public static void static_method() {
		System.out.println("Hello World");
	}
}
