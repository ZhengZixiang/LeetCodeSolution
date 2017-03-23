import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		String [] words = {"Hello", "Alaska", "Dad", "Peace"};
		for(int i = 0; i < findWords(words).length; i++) {
			System.out.println(findWords(words));
		}
	}

    public static String[] findWords(String[] words) {
        String[] keyboardRows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < words.length; i++) {
        	int line = 0;
        	String lowWords = words[i].toLowerCase();
            for(int j = 0; j < lowWords.length(); j++) {
            	if(j == 0) {
            		for(int k = 0; k < 3; k++) {
                		if(-1 != keyboardRows[k].indexOf(lowWords.charAt(0))) {
                			line = k;
                			break;
                		}
                	}
            	}
            	if(keyboardRows[line].indexOf(lowWords.charAt(j)) == -1) {
            		line = -1;
            		break;
            	}
            }
            if(line != -1) list.add(lowWords);
        }
        String[] results = new String[list.size()];
        return list.toArray(results);
    }
}
