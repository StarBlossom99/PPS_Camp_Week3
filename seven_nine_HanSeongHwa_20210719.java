
public class seven_nine_HanSeongHwa_20210719 {
	public static void main(String[] args) {
		int[] array = {0,0,1,1,1,2,2,3,3,4};
		int result = removeDuplicates(array);
		
		System.out.println(result); 
	}
	public static int removeDuplicates(int[] nums) {
		int prev = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[prev] != nums[i]) {
                nums[++prev] = nums[i];
            }
        }
        return prev + 1;
	}
}
