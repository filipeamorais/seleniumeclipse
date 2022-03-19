package introductionselenium;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("java");
		System.out.println(a);
		a.add(0,"second");
		a.remove("java");
		System.out.println(a);
		System.out.println(a.contains("first"));
		
	}

}
