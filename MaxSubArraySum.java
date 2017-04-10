
public class MaxSubArraySum {

	public static int findMaxSum(int[] input){
		int sum = 0; int n = input.length - 1;
		int max = 0;
		for(int i = n ; i >= 0 ; i--){
			if(input[i] > 0){
				break;
			}
			else
				input[i] = 0;
		}
		for(int i = 0 ; i <= n ; i++){
			
			if(sum + input[i] < input[i]){
				sum = input[i];
			}
			else {
				sum = sum + input[i];
			}
			
			if(max < sum)
				max = sum;
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { -2, -3, 44, 44, -20,-50, -200,1, 5, -3,-185};
		System.out.println(findMaxSum(input));
	}

}
