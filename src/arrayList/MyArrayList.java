package arrayList;

import java.util.Iterator;

public class MyArrayList {
	String[] massiv = new String[5];
	int index = 0;
	public void əlavəEt(String deyer) {
		if(index == massiv.length) {
			String[] a = new String[massiv.length + 5];
			for (int i = 0; i < massiv.length; i++) {
				a[i]= massiv[i];
			}
			massiv = a;
		}
		massiv[index] = deyer;
		index++;
	}
	public String toString() {
		String deyer = "[";
		for (int i = 0; i < index; i++) {
			if (index-1==i) {
				deyer += massiv[i];
			} else {
				deyer += massiv[i] + ", ";
			}
		}
		deyer += "]";
		return deyer;
	}
	public int olcu() {
		return index;
	}
	public void temizle() {
		index=0;
	}
	public String eldeEt(int i) {
		if(i>= index) {
			return "Olmayan indekse muraciet etdin";
		}else {
			return massiv[i];
		}
		
	}
}
