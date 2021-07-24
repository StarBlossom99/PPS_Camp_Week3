import java.util.*;
import java.io.*;

public class seven_seven_HanSeongHwa_20210719 {
	public static void main(String[] args) throws IOException {
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(kb.readLine()," ");
		
		int num = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		int[] num_array = new int[num];
		
		st = new StringTokenizer(kb.readLine()," ");
		
		for(int i = 0;i<num;i++) {
			num_array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num_array);
		
		System.out.println(num_array[target-1]);
	}
}
