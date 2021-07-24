import java.util.Arrays;

public class eleven_four_HanSeongHWa_20210720 {
	public static void main(String[] args) {
		int[] nums = {3,2,4,3};
		int result = largestPerimeter(nums);
		System.out.println(result);
	}
	public static int largestPerimeter(int[] nums) {
		int result = 0;
		int size = nums.length;
		
		Arrays.sort(nums);
		
		for(int i =0;i<nums.length-2;i++) {
			if(nums[size-i-1] < nums[size-i-2] + nums[size-i-3]) {
				result = nums[size-i-1] + nums[size-i-2] + nums[size-i-3];
				break;
			}
		}
		
		return result;
	}
}
