
public class fifteen_one_HanSeongHwa_20210723 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode()	{}
		TreeNode(int val){
			this.val = val;
		}
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(2);
		TreeNode b1 = new TreeNode(3);
		TreeNode c1 = new TreeNode(1,a1,b1);
		
		TreeNode a2 = new TreeNode(2);
		TreeNode b2 = new TreeNode(3);
		TreeNode c2 = new TreeNode(1,a2,b2);
		
		boolean result = isSameTree(c1,c2);
		System.out.println(result);
		
	}
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		
		if(p == null && q == null) {
			return true;
		}
		
		if((p == null && q != null) || (p != null && q == null)) {
			return false;
		}
		
		if((p.val == q.val) && (isSameTree(p.left,q.left)) && (isSameTree(p.right,q.right))) {
			return true;
		}
		else {
			return false;
		}
	}
}
