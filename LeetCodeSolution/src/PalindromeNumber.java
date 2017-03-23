
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(5));
		//1000110001 10 0 -121 1122 1001
	}

    public static boolean isPalindrome2(int x) {
    	return false;
    }
    
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        if(x % 10 == 0) return false;
        int reverse = 0;
        int temp = x;
        while(temp > reverse) {
        	reverse = reverse * 10 + temp % 10;
        	temp /= 10;
        }
        if(reverse > temp) reverse /= 10;
        return reverse == temp;
    }
}
