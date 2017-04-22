import java.util.HashSet;
import java.util.Set;


/**
 * Created by IceBreakers on 3/5/17.
 * if an input array has distinct elements, return TRUE, otherwise false
 *  input = [3,4,6,2,1,6,8] - False
 *  input = [2,3,1,7,6] - True
 */
public class DistinctElements {
    private static boolean isDistinct(int[] nums){
    	if(nums==null){
    		return true;
    	}
    	else if(nums.length==1){
    		return true;
    	}
  
    	Set<Integer> mySet = new HashSet<>();
		
		for(int i=0;i<nums.length;i++){
			if(!mySet.add(nums[i])){
				return false;
			}
		}
		return true;
	
    }

    public static void testBench(){
        //null case
    	int[] nums = null;
    	System.out.println("is" + " " + null + " " + "Distinct" + ":" + isDistinct(nums) );
        // 1 element array
    	int[] nums1 = {5};
    	System.out.println("is" + " " + "{5}" + " " + "Distinct" + ":" + isDistinct(nums1) );
        // array with distinct elements case
    	int[] nums2 = {6,3,2,1,4,7};
    	System.out.println("is" + " " + "{6,3,2,1,4,7}" + " " + "Distinct" + ":" + isDistinct(nums2) );
        // array with not distinct elements case
    	int[] nums3 = {6,3,2,1,4,6};
    	System.out.println("is" + " " + "{6,3,2,1,4,6}" + " " + "Distinct" + ":" + isDistinct(nums3) );
    }
    public static void main(String args[]){
        testBench();
    }

}
