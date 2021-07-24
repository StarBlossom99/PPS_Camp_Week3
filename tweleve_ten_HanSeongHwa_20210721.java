import java.util.Scanner;

public class tweleve_ten_HanSeongHwa_20210721 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = 0;
		num = kb.nextInt();
		
		int h = 0;
		int w = 0;
		int n = 0;
		
		int a = 0; //Ãþ
		int b = 0; //È£¼ö
		String[] result = new String[num];
		
		for(int i = 0;i<num;i++) {
			h = kb.nextInt();
			w = kb.nextInt();
			n = kb.nextInt();
			
			a = n%h;
			b = n/h +1;
			
			if(a==0) {
				a = h;
				b = n/h;
			}
			if(b<10) {
				result[i] = Integer.toString(a) + "0" + Integer.toString(b);
			}
			else {
				result[i] = Integer.toString(a) + Integer.toString(b);
			}
		}
		
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		kb.close();
	}
}
