import java.util.Arrays;

public class RomanToInteger {

	public static void main(String [] args) {
		String s = "MMMCMXCIX";
		System.out.println(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
		char [] roman = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int [] val = {1000, 500, 100, 50, 10, 5, 1};
		int num = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for(int j = 0; j < 7; j++) {
				if(roman[j] == c) {
					if(i == s.length() - 1) {
						num += val[j];
						break;
					} else {
						for(int k = 0; k < 7; k++) {
							if(roman[k] == s.charAt(i + 1)) {
								if(k >= j) {
									num += val[j];
									break;
								} else {
									num -= val[j];
									break;
								}
							}
								
						}
						break;
					}
						/*if() {
						num += val[j];
						break;
					} else {
						num -= val[j];
						break;
					}*/
				}
			}
		}
		
		return num;
	}
	
	public static boolean compare(char c) {
		return false;
	}
}
