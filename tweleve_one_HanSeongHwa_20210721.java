import java.util.*;

public class tweleve_one_HanSeongHwa_20210721 {
	public static void main(String[] args) {
		int[] nums = {4,2,5,7};
		int[] result = sortArrayByParityII(nums);
		
	}
	public static int[] sortArrayByParityII(int[] nums) {
		int[] result = new int[nums.length];
		
		Queue<Integer> even = new LinkedList<>();
		Queue<Integer> odd = new LinkedList<>();
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]%2 == 0) {
				even.add(nums[i]);
			}
			else {
				odd.add(nums[i]);
			}
		}
		
		for(int j = 0;j<nums.length;j++) {
			if(j%2 == 0) {
				result[j] = even.poll();
			}
			else {
				result[j] = odd.poll();
			}
		}
		
		return result;
	}
}
