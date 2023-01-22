package list;

import java.util.ArrayList;

public class MainList {

	public static void main(String[] args) {
		
		String[] names = new String[10];
		names[0]="Eltac";
		System.out.println("Massiv: "+names);
		
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Fateh");
		names2.add("Orxan");
		names2.add("Adil");
		System.out.println("ArrayList: "+names2);
		
		names2.remove("Fateh");
		System.out.println("ArrayList: "+names2);
		
		names2.add("Elton");
		names2.add("Vasif");
		names2.add("Ceyhun");
		names2.add("Nizami");
		System.out.println("ArrayList: "+names2);
		
		names2.remove(2);
		System.out.println("ArrayList: "+names2);
		
		boolean var = names2.contains("Vasif");
		System.out.println("Olub - olmaması: "+var);
		
		String s = names2.get(1);
		System.out.println("Indeksə görə ad: "+s);
		
		int i = names2.indexOf("Nizami");
		System.out.println("Index: "+i);
		
		boolean bosh = names2.isEmpty();
		System.out.println("ArrayListin içində element olmaması: "+bosh);
		
		int say = names2.size();
		System.out.println("Element sayı: "+say);
		
		names2.set(2, "Zeynalabidin");
		System.out.println("ArrayList: "+names2);
	}

}
