package string;

public class LastNonRepeatedChar {

	public static void main(String[] args) {

		String s = "register";
		int[] arr = new int [128];
		
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		    }
		for(int i = s.length()-1; i>=0; i--) {
			if(arr[s.charAt(i)] == 1) {
				System.out.println("last Non Repeated char " + s.charAt(i));
				break;
			}
		}
	}

}
