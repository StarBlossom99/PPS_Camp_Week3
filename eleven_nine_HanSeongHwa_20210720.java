import java.util.*;

public class eleven_nine_HanSeongHwa_20210720 {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> array = new ArrayList<Integer>();
		
		array = spiralOrder(matrix);
		
		System.out.println(array);
	}
	public static List<Integer> spiralOrder(int[][] matrix){
		List<Integer> result = new ArrayList<Integer>();
		int size = matrix.length * matrix[0].length;
		int minR = 0;
		int maxR = matrix.length-1;
		int minC = 0;
		int maxC = matrix[0].length-1;
		
		while(size != result.size()) {
			int i = minC;
			
			while(i<=maxC && size != result.size()) {
				result.add(matrix[minR][i++]);
			}
			
			minR++;
			i = minR;
			while(i<=maxR && size != result.size()) {
				result.add(matrix[i++][maxC]);
			}
			
			maxC--;
			i = maxC;
			while(i>=minC && size != result.size()) {
				result.add(matrix[maxR][i--]);
			}
			
			maxR--;
			i = maxR;
			while(i>=minR && size != result.size()) {
				result.add(matrix[i--][minC]);
			}
			
			minC++;
		}
		
		
		return result;
	}
}
