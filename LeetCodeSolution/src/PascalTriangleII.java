import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleII {
	public static void main(String[] args) {
		System.out.println(getRow2(3));
	}
	
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int level = 1;
        for(int i = 0; i < rowIndex; i++) {
            for(int j = level - 1; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
            list.add(1);
            level++;
        }
        return list;
    }
    
    public static List<Integer> getRow2(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        int [] arr = new int[rowIndex + 1];
        arr[0] = 1;
        int level = 1;
        for(int i = 0; i < rowIndex; i++) {
            for(int j = level - 1; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
            arr[level] = 1;
            level++;
        }
        for(int i = 0; i < rowIndex + 1; i++) {
        	list.add(arr[i]);
        }
        return list;
    }
}
