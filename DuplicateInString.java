package string;

public class DuplicateInString {

	public static void main(String[] args) {

		String s = "MOMOS";
		int i = 0;
		
		while(i < s.length()) {
			char c = s.charAt(i);
			int j = i+1;
			
			while(j < s.length()) {
				if(s.charAt(i) == s.charAt(j)) {
					System.out.println("duplicate "+s.charAt(i) );
				}
				j++;
			}
			i++;
		}
	}

}
