	import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(generate(0));
	}

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> pascal = new ArrayList<List<Integer>> ();
    	List<Integer> list = new ArrayList<Integer> ();
        for(int i = 0;  i < numRows; i++) {
	        for(int j = i - 1; j > 0; j--) {
	          	list.set(j, list.get(j) + list.get(j - 1));
	        }
	        list.add(1);
            pascal.add(new ArrayList<Integer>(list));
        }
        return pascal;
        
        /*List<List<Integer>> pascal = new ArrayList<List<Integer>> ();
        for(int i = 0;  i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer> ();
            list.add(1);
            if(i > 1) {
	            for(int j = 1; j < i; j++) {
	            	list.add(j, pascal.get(i - 1).get(j) + pascal.get(i - 1).get(j - 1));
	            }
            }
            if(i > 0) list.add(1);
            pascal.add(list);
        }
        return pascal;*/
    }
}
