import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PowerOfFour {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(1));
	}

	public static boolean isPowerOfFour(int num) {
		return num > 0 && (num&(num - 1)) == 0 && (num - 1) % 3 == 0; 
	}

}


