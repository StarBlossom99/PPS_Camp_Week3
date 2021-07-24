import java.util.*;

public class nine_six_HanSeongHwa_20210722 {	
	static Set<String> list = new HashSet<String>();
	static int[] x_inc = {-1,1,0,0};
	static int[] y_inc = {0,0,1,-1};
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int length = 0;
		int[][] array = new int[5][5];
		
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				array[i][j] = kb.nextInt();
			}
		}
		kb.close();
		
		String string = "";
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				length = 0;
				number_string(i,j,length,string,array);
			}
			
		}
		
		System.out.println(list.size());
	}
	public static void number_string(int i,int j, int length, String string,int[][] array) {
		if(length == 7) {
			list.add(string);
			return;
		}
		else {
			if(length==0) {
				string = Integer.toString(array[i][j]);
				number_string(i,j,length+1,string,array);
			}
			else {
				for(int c = 0; c<4;c++) {
					int next_i = x_inc[c] + i;
					int next_j = y_inc[c] + j;
					
					if(next_i<0 || next_j<0 || next_i > 4 || next_j > 4) {
						continue;
					}
					number_string(next_i,next_j,length+1,string+Integer.toString(array[i][j]),array);
				}
			}
		}
	}
}
