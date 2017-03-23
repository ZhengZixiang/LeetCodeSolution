import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int [] nums = {1,1,2,3,3,3,5,5,6,7};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

    public static int removeDuplicates(int[] nums) {
    	int length = 1;
    	for(int i = 1; i < nums.length; i++) {
    		if(nums[i] > nums[i - 1]) {
    			nums[length++] = nums[i];
    		}
    	}
        return length;
    }
}
