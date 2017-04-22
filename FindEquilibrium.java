
public class FindEquilibrium {

	public static int findEquilibriumIndex(int[] inputArr){
		
		if(inputArr == null || inputArr.length <= 2){
			return 0;
		}
		int left = 0, right = 0 , total = 0;
		
		for(int i = 0; i < inputArr.length ; i++){
			total += inputArr[i];
		}
		
		for(int i = 1 ; i< inputArr.length ; i++){
			left += inputArr[i-1];
			
			right = total - left - inputArr[i];
			
			if(left == right){
				return i+1;
			}
		}
		
		
		return 0;
	}
	
	public static void main(String[] args){
		int[] inputArr = {1,2,3,4,5};
		System.out.println(findEquilibriumIndex(inputArr));
	}
	
}
