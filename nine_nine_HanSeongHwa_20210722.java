import java.util.Scanner;

public class nine_nine_HanSeongHwa_20210722 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		int step = 1;
		int check = 1;
		int inc = 1;
		int result = 1;
		kb.close();
		
		while(true) {
			if(num==1) {
				System.out.println(result);
				break;
			}
			if(num <= 6 * check + 1) {
				result = result + step;
				System.out.println(result);
				break;
			}
			else {
				step++;
				inc++;
				check = check + inc;
			}
		}
		
	}
}
