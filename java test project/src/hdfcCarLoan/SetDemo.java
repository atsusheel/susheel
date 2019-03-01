package hdfcCarLoan;

import java.util.HashSet;
//import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		//LinkedHashSet<Integer> h = new LinkedHashSet<>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		
		System.out.println(h);

	}

}
