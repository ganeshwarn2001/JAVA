package string;

import java.util.Arrays;

public class MaxNoOfOccuranceInString {

	public static void main(String[] args) {

		String s = "BOLD";
		char[] arr = s.toCharArray();
		
		int i = 0;
		
		while(i<s.length()) {
			
			int j = i+1;
			while(j<s.length()) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(arr);
		
//		Arrays.sort(arr);
//		System.out.println(arr);

	}

} 
