
public class tweleve_five_HanSeongHwa_20210721 {
	public static void main(String[] args) {
		int[] nums1 = {2,1,3};
		int[] nums2 = {2,3,1};
		
		int[] result = nextGreaterElement(nums1,nums2);
		
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		boolean sign = true;
		for(int i = 0;i<nums1.length;i++) {
			for(int j = 0;j<nums2.length;j++) {
				if(nums1[i] == nums2[j]) {
					for(int k = j; k<nums2.length;k++) {
						if(nums2[j]<nums2[k] && sign == true) {
							result[i] = nums2[k];
							sign = false;
						}
						else if(k == nums2.length-1 && nums2[j] >= nums2[k] && sign == true) {
							result[i] = -1;
							sign = false;
						}
						
					}
				}
				sign = true;
			}
			
		}
		
		return result;
	}
}