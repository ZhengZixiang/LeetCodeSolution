
public class GuessNumberHigherOrLower {
	public static void main(String[] args) {
		
	}
	
    public int guessNumber(int n) {
        int g = guess(n);
        while(g != 0) {
            if(g == -1) n = n / 2;
            else if(g == 1) {
                if(n != 1) n = n + n / 2;
                else n = n + 1;
            }
            g = guess(n);
        }
        return n;
    }

	private int guess(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
