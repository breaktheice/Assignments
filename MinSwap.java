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
    	int i = 0;
    	int temp = 0;
    	int j = a.length - 1;
    	int count = 0;
    		
    		while(i<j){
    			 if(a[i]==0){
    				if(a[j]!=0){
    				temp = a[i];
    				a[i] = a[j];
    				a[j] = temp;
    				count = count+1;
    				i++;
    				}
    				j--; 	

    			}
    			else i++;
    			}
    	return count;
    }
    
    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        int[] a1 = {1,2,0,3,0,4,5};
        myassert(2 == minSwaps(a1));
        System.out.println("Pass 1");
        int[] a2 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        myassert(2 == minSwaps(a2));
        System.out.println("Pass 2" );
    }

    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("MinSwap.java");
        testBench();
        System.out.println("DONE");
    }
}
