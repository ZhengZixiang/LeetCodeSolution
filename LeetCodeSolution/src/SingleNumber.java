import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {
	public static void main(String[] args) {
		int [] nums = {2,2,4,3,3};
		System.out.println(singleNumber3(nums));
	}

    public static int singleNumber(int[] nums) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	for(int i : nums) {
    		if(!set.contains(i)) set.add(i);
    		else set.remove(i);
    	}
        return (int) set.toArray()[0];
    }
    
    public static int singleNumber2(int[] nums) {
    	Arrays.sort(nums);
    	for(int i = 0; i < nums.length; i += 2) {
    		if(i == nums.length - 1 || nums[i] != nums[i + 1]) {
    			return nums[i];
    		}
    	}
    	return 0;
    }
    
    public static int singleNumber3(int [] nums) {
    	int ans = 0;
    	for(int n : nums) ans ^= n;
    	return ans;
    }
}
