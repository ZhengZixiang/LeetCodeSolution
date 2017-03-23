
public class NextGreaterElementI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] arr = new int[findNums.length];
		for (int i = 0; i < findNums.length; i++) {
			int result = findNums[i];
			int max = -1;
			for (int j = nums.length - 1; j >= 0; j--) {
				if (nums[j] == result)
					break;
				else {
					if (nums[j] > result)
						max = nums[j];
				}
			}
			arr[i] = max;
		}
		return arr;
	}
}
