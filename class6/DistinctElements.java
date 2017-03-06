package IceBreakers;

public class DistinctElements {
    private static boolean isDistinct(int[] nums){
    	int[] res = new int[10];
    	for(int i=0;i<nums.length;i++) {
    		if(res[nums[i]] != 0) {
    			return false;
    		} else {
    			res[nums[i]] = 1;
    		}
    	}
    	return true;
    }

    public static void testBench(){
        //null case
        // 1 element array
        // array with distinct elements case
        // array with not distinct elements case
    	System.out.println(isDistinct(new int[] {3,4,6,2,1,6,8}));
    	System.out.println(isDistinct(new int[] {1,2,3,4,5,6,1}));
    	System.out.println(isDistinct(new int[] {2,3,1,7,6}));
    	System.out.println(isDistinct(new int[] {1}));
    	System.out.println(isDistinct(new int[] {}));
    }
    public static void main(String args[]){
        testBench();
    }

}
