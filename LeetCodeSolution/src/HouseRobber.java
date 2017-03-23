import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HouseRobber {

	public static void main(String[] args) {
		int [] nums = {1,1,1};
		System.out.println(rob(nums));
	}
	
	public static int rob(int [] nums) {
		int sum = 0;
		/*Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int [] sort = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			sort[i] = nums[i];
		}
		Arrays.sort(sort);
		for(int i = nums.length - 1; !map.isEmpty(); i--) {
			if(map.containsKey(sort[i])) {
				sum += sort[i];
				int loc = map.get(sort[i]);
				if(loc != nums.length - 1) map.remove(nums[loc + 1]);
				if(loc != 0) map.remove(nums[loc - 1]);
				map.remove(sort[i]);
			}
		}*/
		String studentName = null;
		System.out.println(studentName.isEmpty());
		return sum;
	}
}
