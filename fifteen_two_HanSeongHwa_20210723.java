
public class fifteen_two_HanSeongHwa_20210723 {
	public static void main(String[] args) {
		int n = 6;
		boolean result = divisorGame(n);
		
		System.out.println(result);
	}
	public static boolean divisorGame(int n) {
		if(n%2 ==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
