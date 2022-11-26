package variable_arguments;

public class sum {

	public static void main(String[] args) {
		int i = cemlemek(10,20,70);
		System.out.println(i);

	}
	
	static int cemlemek(int...i) {
		int result = 0;
		for(int a:i) {
			result+=a;
		}
		return result;
	}
	
//	static int cemlemek(int a,int b) {
//		int result = 0;
//		result=a+b;
//		return result;
//		
//	}
//	
//	static int cemlemek(int a,int b, int c) {
//		int result = 0;
//		result=a+b+c;
//		return result;
//		
//	}

}
