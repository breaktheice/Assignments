
/**
 * Created by IceBreakers on 3/5/17.
 * if an input array has distinct elements, return TRUE, otherwise false
 *  input = [3,4,6,2,1,6,8] - False
 *  input = [2,3,1,7,6] - True
 */
public class DistinctElements {
    private static boolean isDistinct(int[] nums){
    	int arrayLength = nums.length;
    	if (arrayLength == 0){
    		return true;
       	}
    	boolean isDistinct = true;
    	int[] count = new int[10];
    	for(int i=0 ; i < nums.length; i++){
    		
    		if(nums[i] >=0 || nums[i] <=9){
    			
    			int index = nums[i];
    			count[index]++;
    			if(count[index] > 1){
    				isDistinct = false;
    				break;
    			}
    			
    		
    		}
    	}
    	return isDistinct;

    }

    public static void testBench(){
        //null case
    	int[] nums = { };
       	System.out.println("Array { } is null =" +isDistinct(nums));
    	
        // 1 element array
    	int[] nums1 = { 2 };    	
    	System.out.println("Array { 2 } is Distinct =" +isDistinct(nums1));
        // array with distinct elements case
    	int[] nums2 = {2,5,8,9,1,3};    	
    	System.out.println("Array {2,5,8,9,1,3} is Distinct =" +isDistinct(nums2));
        // array with not distinct elements case
    	int[] nums3 = {2,5,8,9,2,1,3};    	
    	System.out.println("Array {2,5,8,9,2,1,3} is Distinct =" +isDistinct(nums3));
    }
    public static void main(String args[]){
        testBench();
    }

}
