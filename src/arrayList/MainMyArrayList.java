package arrayList;

public class MainMyArrayList {

	public static void main(String[] args) {
	    MyArrayList myList = new MyArrayList();
	    myList.əlavəEt("Alma");
	    myList.əlavəEt("Kitab");
	    System.out.println(myList.eldeEt(0)); 
	    System.out.println(myList.olcu()); 
	    myList.temizle();
	    System.out.println(myList);
	}

	
}
