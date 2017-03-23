public class BullsAndCows {
	
	public static void main(String[] args) {
		System.out.println(getHint("1123", "0111"));
	}
	
    public static String getHint(String secret, String guess) {
    	int len = secret.length();
    	int bulls = 0;
        int cows = 0;
        
    	char [] sArr = secret.toCharArray();
    	char [] gArr = guess.toCharArray();
    	int [] sCount = new int[10];
    	int [] gCount = new int[10];
        
        for(int i = 0; i < len; i++) {
            if(sArr[i] == gArr[i]) bulls++;
            switch(sArr[i]) {
            	case '0': sCount[0]++; break;
            	case '1': sCount[1]++; break;
            	case '2': sCount[2]++; break;
            	case '3': sCount[3]++; break;
            	case '4': sCount[4]++; break;
            	case '5': sCount[5]++; break;
            	case '6': sCount[6]++; break;
            	case '7': sCount[7]++; break;
            	case '8': sCount[8]++; break;
            	case '9': sCount[9]++; break;
            }
            switch(gArr[i]) {
	        	case '0': gCount[0]++; break;
	        	case '1': gCount[1]++; break;
	        	case '2': gCount[2]++; break;
	        	case '3': gCount[3]++; break;
	        	case '4': gCount[4]++; break;
	        	case '5': gCount[5]++; break;
	        	case '6': gCount[6]++; break;
	        	case '7': gCount[7]++; break;
	        	case '8': gCount[8]++; break;
	        	case '9': gCount[9]++; break;
            }
        }
        
        for(int i = 0; i < 10; i++) {
        	int min = Math.min(sCount[i], gCount[i]);
        	if(min > 0) cows += min;
        }
        cows -= bulls;
        
        return (bulls == 0?"":bulls + "A") + (cows == 0?"":cows + "B");
    }
    
}
