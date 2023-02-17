package string;

public class CountOfVowels {

	public static void main(String[] args) {

		String s = "elephant";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			switch(c) {
			    case 'a' : count ++; 
			    System.out.println(count);
			    break;
			}
		}
	}

}
