
public class SumOfTwoIntegers {
	public static void main(String [] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(getSum(a, b));
	}
	
	public static int getSum(int a, int b) {
		int sum = a;
		int carry = b;
		while(carry != 0) {
			sum = a ^ carry;
			carry = (a & carry) << 1;
			a = sum;
		}
		return a;
	}
}
