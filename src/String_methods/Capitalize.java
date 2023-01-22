package String_methods;

public class  Capitalize {

	public static void main(String[] args) {

		String sentence = "mən java öyrənirəm";
		String ans = "";
		System.out.println(sentence);

		String[] wordsArray = sentence.split(" ");
		for (String word : wordsArray) {
			char first = word.charAt(0); 
			first=Character.toUpperCase(first); 
			String ansWord = first + word.substring(1);
			ans += ansWord+" ";
		}
		System.out.println(ans);
	}

}
