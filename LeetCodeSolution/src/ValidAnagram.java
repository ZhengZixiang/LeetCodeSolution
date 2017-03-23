import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidAnagram {
	public static void main(String [] args) {
		String s = "car";
    	String t = "tac";
    	System.out.println(isAnagram(s, t));
    	
	}
	
	
    public static boolean isAnagram(String s, String t) {
    	if(s.length() != t.length())
    		return false;
    	
    	char [] sArr = s.toCharArray();
    	char [] tArr = t.toCharArray();
    	Arrays.sort(sArr);
    	Arrays.sort(tArr);
    	
    	s = Arrays.toString(sArr);
    	t = Arrays.toString(tArr);
    	
    	if(!s.equals(t))
    		return false;
    	
    	return true;
    }
}



