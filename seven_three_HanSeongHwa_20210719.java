import java.util.*;

public class seven_three_HanSeongHwa_20210719{
	public static void main(String [] args) {
		int[] array = {2,2,1,1,1,2,2};
		int result = majorityElement(array);
		
		System.out.println(result);
	}
	public static int majorityElement(int[] nums) {
		int index = 0;
		int result = 0;
		
		HashMap<Integer, Integer> array = new HashMap<Integer, Integer>();
		
		for(int i = 0;i<nums.length;i++) {
			if(i==0) {
				array.put(nums[i],1);
				index = nums[i];
				result = 1;
			}
			else {
				if(array.containsKey(nums[i])) {
					array.replace(nums[i], array.get(nums[i]) + 1);
					if(array.get(nums[i])>result) {
						index = nums[i];
						result = array.get(nums[i]);
					}
				}
				else {
					array.put(nums[i], 1);
				}
			}
		}
		return index;
	}
}
