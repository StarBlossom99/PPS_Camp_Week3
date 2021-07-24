import java.util.*;

public class eleven_five_HanSeongHwa_20210720 {
	public static void main(String[] args) {
		String[] ops = {"1"};
		int result = calPoints(ops);
		
		System.out.println(result);
	}
	public static int calPoints(String[] ops) {
		int result = 0;

		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0;i<ops.length;i++) {
			if(!(ops[i].equalsIgnoreCase("c") || ops[i].equalsIgnoreCase("d") || ops[i].equalsIgnoreCase("+"))) {
				array.add(Integer.parseInt(ops[i]));
			}
			else {
				if(ops[i].equalsIgnoreCase("c")) {
					array.remove(array.size()-1);
				}
				else if(ops[i].equalsIgnoreCase("d")) {
					array.add(array.get(array.size()-1)*2);
				}
				else {
					array.add(array.get(array.size()-1) + array.get(array.size()-2));
				}
			}
		}
		
		for(int i = 0;i<array.size();i++) {
			result = result + array.get(i);
		}
		
		return result;
	}
}
