import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
	
	public static void main(String [] args) {
		int [] nums1 = {1,2,2,1};
		int [] nums2 = {1,2};
		System.out.println(intersect(nums1, nums2));
	}
	
	public static int [] intersect(int [] nums1, int [] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();	
		int start1 = 0;
		int start2 = 0;
		
		for(int i = 0; i < nums1.length; i++) {
			if(i != nums1.length - 1) {
				if(nums1[i] != nums1[i + 1]) {
					map.put(nums1[i], i - start1 + 1);
					start1 = i + 1;
				}
			} else {
				map.put(nums1[i], nums1.length - start1);
			}
		}
		
		for(int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i])) {
				if(i != nums2.length - 1) {
					if(nums2[i] != nums2[i + 1]) {
						int max = Math.min(map.get(nums2[i]), i - start2 + 1);
						for(int j = 0; j < max; j++)  {
							list.add(nums2[i]);
						}
						start2 = i + 1;
					}
				} else {
					int max = Math.max(map.get(nums2[i]), nums2.length - start2 + 1);
					for(int j = 0; j < max; j++)  {
						list.add(nums2[i]);
					}
				}
			} else {
				start2++;
			}
		}
		
		int [] arr = new int[list.size()];
		for(int i = 0; i < list.size(); i++)
			arr[i] = list.get(i);
		return arr;
	}
}
