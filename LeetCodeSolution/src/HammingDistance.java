
public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(hammingDistance2(1, 4));
	}
	
    static int hammingDistance(int x, int y) {
        String str = Integer.toBinaryString(x^y);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) == '1') count++;
        }
        return count;
    }
    
    static int hammingDistance2(int x, int y) {
    	int count = 0;
    	while(x !=0 || y != 0) {
    		if((x&1) != (y&1)) count++;
    		x>>=1;
        	y>>=1;
    	}
        return count;
    }
}
