import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s="leetcode";
		System.out.println(reverseVowels(s));
	}
	
	public static String reverseVowels(String s) {
		char [] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		ArrayList<Character> list = new ArrayList<>();
		ArrayList<Integer> loc = new ArrayList<>();
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < vowels.length; j++) {
				if(vowels[j] == s.charAt(i)) {
					list.add(vowels[j]);
					loc.add(i);
					break;
				}
			}
		}
		
		for(int i = 0; i < loc.size(); i++) {
			sb.setCharAt(loc.get(i), list.get(loc.size() - i - 1));
		}
		
		return sb.toString();
	}
}
