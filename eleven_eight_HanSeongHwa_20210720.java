
public class eleven_eight_HanSeongHwa_20210720 {
	public static void main(String[] args) {
		int[] nums = {2,5,6,0,0,1,2};
		int target = 3;
		
		boolean result = search(nums,target);
		System.out.println(result);
	}
	public static boolean search(int[] nums, int target) {
		boolean result = false;
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i]== target) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
}
