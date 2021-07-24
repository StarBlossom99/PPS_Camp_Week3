
public class ten_six_HanSeongHwa_20210721 {
	public static void main(String [] args) {
		
		String a;
		String b;
		
		a = "11";
		b = "1";
		
		String result = addBinary(a,b);
		System.out.println(result);
	}
	public static String addBinary(String a, String b) {
		int a_num;
		int b_num;
		String c;
		String result = "result";
		String special = "special";
		int sum = 0;
		int temp = 0;
		
		
		
		
		if(a.length()<b.length()) {
			c = a;
			a = b;
			b = c;
		}
		if(a.length() == b.length()) {
			int n = a.length();
			for(int i = 0; i<a.length();i++) {
				a_num = Integer.parseInt(a.substring(n-1-i,n-i));
				b_num = Integer.parseInt(b.substring(n-1-i,n-i));
				
				sum = a_num + b_num + temp;
				
				if(sum >=2) {
					temp = 1;
					sum = sum -2;
				}
				else {
					temp = 0;
				}
				
				if(i==0) {
					result = Integer.toString(sum);
				}
				else {
					result = Integer.toString(sum).concat(result);
				}
			}
			if(temp ==1) {
				result = Integer.toString(temp).concat(result);
			}
			System.out.println(result);
		}
		else if(a.length() != b.length()) {
			int n = b.length();
			for(int i = 0; i<n;i++) {
				a_num = Integer.parseInt(a.substring(a.length()-i-1,a.length()-i));
				b_num = Integer.parseInt(b.substring(b.length()-i-1,b.length()-i));
				
				sum = a_num + b_num + temp;
				
				if(sum>=2) {
					temp = 1;
					sum = sum -2;
				}
				else {
					temp = 0;
				}
				
				if(i==0) {
					result = Integer.toString(sum);
				}
				else {
					result = Integer.toString(sum).concat(result);
				}
			}
			if(temp == 1) {
				int temp2 = 1;
				for(int i = 0;i<a.length()-n;i++) {
					a_num = Integer.parseInt(a.substring(a.length()-n-i-1,a.length()-n-i));

					sum = a_num + temp2;
					
					if(sum>=2) {
						temp2 = 1;
						sum = sum -2;
					}
					else {
						temp2 = 0;
					}
					
					if(i==0) {
						special = Integer.toString(sum);
					}
					else {
						special = Integer.toString(sum).concat(special);
					}
				}
				if(temp2 == 1) {
					result = Integer.toString(temp2).concat(special).concat(result);
				} 
				else {
					result = special.concat(result);
				}
			}
			else {
				result = a.substring(0,a.length()-b.length()).concat(result);
			}
		}
		return result;
	}
}
