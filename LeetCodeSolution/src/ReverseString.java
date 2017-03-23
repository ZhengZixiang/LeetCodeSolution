
public class ReverseString {

	public static void main(String[] args) {
		String s = args[0];
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {
		char [] reverse = new char[s.length()];
		String str = null;
		for(int i = 0; i < s.length(); ++i) {
			reverse[i] = s.charAt(s.length()-1-i);
		}
		return String.valueOf(reverse);
	}
}
