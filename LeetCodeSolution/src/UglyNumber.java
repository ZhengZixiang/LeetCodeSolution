
public class UglyNumber {
	public static void main(String [] args) {
		System.out.println(isUgly(19));
	}
	
	public static boolean isUgly(int num) {
		while(true) {
			int temp = num;
			if(num % 2 == 0) num = num / 2;
			if(num % 3 == 0) num = num / 3;
			if(num % 5 == 0) num = num / 5;
			if(num == 1) return true;
			if(temp == num) return false;
		}
	}
}
