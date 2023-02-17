package string;

import java.util.Arrays;

public class NoOfWordsInString {

	public static void main(String[] args) {

		String s = "Fortune favors the Bold";
		int count = 1;
	//	
		for(int i=0; i<s.length(); i++ ) {
			if(s.charAt(i) == ' '){
				count++;
			}
		}
		System.out.println("No of words " +count);
		
	    //String[] arr = s.split(" ");
		//System.out.println(Arrays.toString(arr));
	    //System.out.println("No of words " + arr.length);
	}

}
