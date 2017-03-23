
public class NimGame {
	public static void main(String [] args) {
		int n  = Integer.parseInt(args[0]);
		System.out.println(canWinNim(n));
	}
	
	public static boolean canWinNim(int n) {
		if(n%4 == 0) return false;
		else return true;
	}
}
