package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemos {

	public static void main(String[] args) {

		LinkedList<Integer> al = new LinkedList<>();
		al.add(45);
		al.add(55);
//		addData(al,66,77);
		System.out.println(al);
		
		List<Integer> l = Arrays.asList(12,3,4,5,6,7);
		printData(l);
		printData(al);
		
		List<Integer> l1 = new LinkedList<>();
		l1.add(5);
		l1.add(10);
		printData(l1);
	}
	
	private static void printData(List<Integer> l) {
		for (Integer i : l) {
			System.out.println(i);
		}
		
	}

	static void addData(ArrayList<Integer> i,int val,int val1) {
		i.add(val);
		i.add(val1);
		System.out.println(i);
	}

}
