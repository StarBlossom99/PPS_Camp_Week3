
public class three_one_HanSeongHwa_20210719 {
	public static void main(String[] args) {
		String string = "PPALLP";
		boolean result = checkRecord(string);
		System.out.println(result);
		
	}
	public static boolean checkRecord(String s) {
		 int consec = 0;
			int abs = 0;
			char check = 0;
			boolean result = true;
			
			for(int i = 0;i<s.length();i++) {
				check = s.charAt(i);
				if(i==0) {
					if(check == 'L') {
						consec = 1;
					}
					else if(check == 'A') {
						abs = 1;
					}
				}
				else {
					if(check == 'L' ) {
						consec++;
					}
					else {
						consec = 0;
					}
					if(check == 'A') {
						abs++;
					}
					if(consec == 3 || abs==2) {
						result = false;
					}
					
				}
			}
			return result;
	}
}
