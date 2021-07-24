import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class seven_one_HanSeongHwa_20210719 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String[][] array = new String[n][2];
		
		for(int i = 0;i<n;i++) {
			array[i][0] = kb.next();
			array[i][1] = kb.next();
		}
		kb.close();
		
		Arrays.sort(array, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for(int i = 0;i<n;i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}
}
