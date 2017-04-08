
public class SubArray {

	public SubArray() {
		// TODO Auto-generated constructor stub
	}
	
	public int maximumSubarraySum(int[] inputArray){
		
		int max = 0;
		int sum = 0;
		for(int  i = 0; i < inputArray.length;i++ ){
			
				sum = sum + inputArray[i];
				if(sum > max)
					max = sum;
				if(sum < 0)
					sum = 0;
				
			}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArray maximumSum = new SubArray();
		int[] subArray1 = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Maximum Sum for {-2, -3, 4, -1, -2, 1, 5, -3}  = " + maximumSum.maximumSubarraySum(subArray1));
		int[] subArray2 = {-2, -3, 4, -1, -20, 1, 5, -3};
		System.out.println("Maximum Sum for {-2, -3, 4, -1, -20, 1, 5, -3} = " + maximumSum.maximumSubarraySum(subArray2));
		int[] subArray3 = {-2, -3, 4, -1, -20, -1, 15, -3};
		System.out.println("Maximum Sum for {-2, -3, 4, -1, -20, -1, 15, -3} = " + maximumSum.maximumSubarraySum(subArray3));
		int[] subArray4 = {-2, -3, -4, -1, -20, -1, -5, -3};
		System.out.println("Maximum Sum for {-2, -3, -4, -1, -20, -1, -5, -3} = " + maximumSum.maximumSubarraySum(subArray4));
		
		

	}

}
