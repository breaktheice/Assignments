
/**
 * Created by IceBreakers on 3/5/17.
 * if an input array has distinct elements, return TRUE, otherwise false
 *  input = [3,4,6,2,1,6,8] - False
 *  input = [2,3,1,7,6] - True
 */
import java.util.*;
public class DistinctElements {
    private static boolean isDistinct(int[] nums){
    	if(nums == null)
    		return true;
    	int arrayLength = nums.length;
    	if (arrayLength == 0){
    		return true;
       	}
    	boolean isDistinct = true;
    	HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    	for(int i=0 ; i < nums.length; i++){    		
    				
    			int index = nums[i];
    			if(count.get(index) == null){
    				count.put(index,1);
    			}
    			else{
    				
    				isDistinct = false;
    				break;
    			}
    			
    		
    		
    	}
    	return isDistinct;

    }

    public static void testBench(){
        //null case
    	System.out.println("Array is null =" +isDistinct(null));
    	//empty case
    	int[] nums = { };
       	System.out.println("Array { } is empty =" +isDistinct(nums));
    	
        // 1 element array
    	int[] nums1 = { 2 };    	
    	System.out.println("Array { 2 } is Distinct =" +isDistinct(nums1));
        // array with distinct elements case
    	int[] nums2 = {3,4,6,2,1,6,8};    	
    	System.out.println("Array {3,4,6,2,1,6,8} is Distinct =" +isDistinct(nums2));
        // array with not distinct elements case
    	int[] nums3 = {2,3,1,7,6};    	
    	System.out.println("Array {2,3,1,7,6} is Distinct =" +isDistinct(nums3));
    }
    public static void main(String args[]){
        testBench();
    }

}
