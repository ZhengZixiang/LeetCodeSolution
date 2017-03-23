
public class ExcelSheetColumnNumber {
	public static void main(String [] args) {
		String s = "";
		System.out.println(titleToNumber(s));
	}
	
	public static int titleToNumber(String s) {
		int len = s.length();
		int num = 0;
		for(int i = 0; i < len; i++) {
			num += (s.charAt(i) - 'A' + 1) * (int)Math.pow(26, len - i - 1);
		}
		return num;
	}
}
