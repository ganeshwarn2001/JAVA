package collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[5];
		arr1[0] = 1;
		
		ar.add(1);
		ar.add("ganesh");
		ar.add(5.6f);
		
		ListDemo d = new ListDemo();
		
//		ar.add(d);
//		
//		int length = ar.size();
//		System.out.println(length);
//		System.out.println(ar);
		
		ar.add(1, 12);
		ar.add("ganesh");
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	ar.remove("ganesh");
	ar.add(null);
	System.out.println(ar);
	System.out.println("sublist "+ar.subList(0, 3));
	
	ArrayList ar1 = new ArrayList();
//	for (int i = 0; i < ar.size(); i++) {
//		ar1.add(ar.get(i));
//	}
	ar1.addAll(ar.subList(0, 3));
	
	ar.removeAll(ar1);
	
	System.out.println("ar1 "+ar1);
	System.out.println("ar1 "+ar);
	
	ArrayList<Integer> arr2 = new ArrayList<Integer>();
	arr2.add(1);
	arr2.add(2);
	arr2.add(3);
	
	for(Object obj : arr) {
		System.out.println(obj);
	}

    System.out.println("arr "+arr2); 
}
	}
