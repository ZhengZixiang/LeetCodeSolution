import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int [] nums = {1,2,1,312,343,2,2,1,2,1};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int [] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	int num = nums[i];
            if(map.containsKey(num)) {
            	map.replace(num, map.get(num) + 1);
            } else {
            	map.put(num, 1);
            }
        }
        
        int max = 0;
        int maj = 0;
        for(int num : map.values()) {
        	if(num > max) {
        		max = num;
        	}
        }
        
        for(int num : map.keySet()) {
        	if(map.get(num) == max) {
        		maj = num;
        	}
        }
        return maj;
        
	}

}
