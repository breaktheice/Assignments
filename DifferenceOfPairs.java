import java.util.HashMap;
import java.util.Map;


public class DifferenceOfPairs {
	
	public static int findPairs(int[] input, int target ){
		if(input == null){
			return 0;
		}
		
		int count = 0;
		Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < input.length ; i++){
			if( !myMap.containsKey(input[i]) ){
				myMap.put( target + input[i] , input[i]);  
			}
			else{
				System.out.println( myMap.get(input[i]) + "," + input[i]);
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		
		int[] input = {2,7,1,10,11};
		System.out.println(findPairs(input,9));
		
		int[] input1 = null;
		System.out.println(findPairs(input1,9));

	}
}
