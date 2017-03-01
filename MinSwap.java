/**
 * Created by IceBreakers on 2/1/17.
 * Move all the zeroes to the end of the array with minimum swaps
 Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
 * Expected Output Format of your program:
 *
 MinSwamp.java
 Original Array
 1,9,8,4,0,0,2,7,0,6,0,
 swap - 1 - Indexes:4 and 9
 swap - 2 - Indexes:5 and 7
 Swapped Array
 1,9,8,4,6,7,2,0,0,0,0
 DONE
 DONE
 */
public class MinSwap {

    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    //print array utility
    private static void printArray(int a[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }
    }
    private static int minSwaps(int a[]){
        //WRITE YOUR CODE HERE... 
    	//int[] newarray = {};
    	/* Minswap with the output 1,9,8,4,6,7,2,0,0,0,0 (i.e) the numbers in the output 
    	 * is not in the order of input
    	 
    	 int len = a.length;
   
    	int swapcount =0 ;
    	int temp;
    	int index = len;
    	for(int i = 0; i <= len-1 ; i++){ 
    		//System.out.println("i="+i);
			
    		if(a[i] == 0 )
    		{ //finding first zero value
    			for(int j = index -1; j>=0 && j > i ; j--){
    			//	System.out.println("j="+j);
        			
    				if( a[j] != 0){  		// finding first non-zero value			
    				index = j; // store the non -zero index
    			temp = a[j];
    			a[j] = a[i];
    			a[i] = temp;
    			//System.out.println("a[i]="+a[i]);
    			//System.out.println("a[j]="+a[j]);
    			
    			
    			swapcount ++;
    			//System.out.println("if");
    			
    			break;
    			
    				}
    			
    				}
    			}
    			
    		}
    	
    	return swapcount; */
    	 int len = a.length;
    	   
     	int swapcount =0 ;
     	int temp;
     	int index = len;
     	for(int i = 0; i <= len-1 ; i++){ 
     		//System.out.println("i="+i);
 			
     		if(a[i] == 0 )
     		{ //finding first zero value
     			
     			for(int j = i +1; j <= len-1 ; j++){
     				if (a[j] !=0){
     				
     					temp = a[j];
     					a[j] = a[i];
     					a[i] = temp;
     					//System.out.println("a[i]="+a[i]);
     	    			//System.out.println("a[j]="+a[j]);
     	    			swapcount++;
     	    			break;
     				}
     				
     				
     				
     			}
     			
     				
     			}
     				
     			}
     	return swapcount;
    	
    }
    
    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        int[] a1 = {1,2,0,3,0,4,5};
        myassert(3 == minSwaps(a1));
        System.out.println("Pass 1");
        int[] a2 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        myassert(3 == minSwaps(a2));
        System.out.println("Pass 2" );
    }

    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("MinSwap.java");
        testBench();
        System.out.println("DONE");
    }
}
