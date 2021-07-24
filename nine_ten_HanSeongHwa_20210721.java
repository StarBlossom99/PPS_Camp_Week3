import java.util.Scanner;

public class nine_ten_HanSeongHwa_20210721 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		int result = 0;
		kb.close();
		
		while(true) {
			if(num %5 == 0) {
				result = result + num/5;
				System.out.println(result);
				break;
			}
			else {
				num = num - 3;
				result ++;
			}
			
			if(num<0) {
				System.out.println("-1");
				break;
			}
			
		}

	}
}
