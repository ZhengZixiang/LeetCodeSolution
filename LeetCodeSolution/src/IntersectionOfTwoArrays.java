import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection(int [] nums1, int [] nums2) {
		Set<Integer> temp = new HashSet<Integer> ();
		Set<Integer> intersection = new HashSet<Integer> ();
		for(int i = 0; i < nums1.length; i++) {
			temp.add(nums1[i]);
		}
		for(int i = 0; i < nums2.length; i++) {
			if(temp.contains(nums2[i])) {
				intersection.add(nums2[i]);
			}
		}
		int [] result = new int[intersection.size()];
		int i = 0;
		for(Iterator<Integer> it = intersection.iterator(); it.hasNext(); ) {
			result[i++] = it.next();
		}
		return result;
	}
}
