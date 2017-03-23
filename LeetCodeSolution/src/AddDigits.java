/**
 * 参考维基百科：https://en.wikipedia.org/wiki/Digital_root
 */
public class AddDigits {
	public static void main(String [] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(addDigits(num));
	}
	
	public static int addDigits(int num) {
		if(num == 0) return 0;
		num = num % 9;
		if(num == 0) return 9;
		return num;
	}
}
