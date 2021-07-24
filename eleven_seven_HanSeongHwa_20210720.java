
public class eleven_seven_HanSeongHwa_20210720 {
	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 3;
		
		int result = search(nums,target);
		System.out.println(result);
	}
	public static int search(int[] nums, int target) {
		int result = -1;
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]== target) {
				result = i;
				break;
			}
		}
		
		return result;
	}
}
