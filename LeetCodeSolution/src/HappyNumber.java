import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String [] args) {
		System.out.println(isHappy(19));
	}
	
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		int t = 0;
		int sum = 0;
		while(n != 1) {
			while(n != 0) {
				t = n / 10;
				sum += (int) Math.pow((n-t * 10), 2);
				n = t;
			}
			if(set.contains(sum)) return false;
			set.add(sum);
			n = sum;
			sum = 0;
		}
		return true;
    }
}
