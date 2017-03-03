
/**
 * Created by IceBreakers on 2/20/17.
 * Given a non-negative int n, return the sum of its digits recursively (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

 * sumDigits(126) → 9
 * sumDigits(49) → 13
 * sumDigits(12) → 3
 */
public class SumOfDigits {

    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    public static int sumDigits(int n){
        //WRITE YOUR CODE HERE
    	int total =0;
    	if(n==0){
    	   return total;
    	}
        //base case
    	else{
    		
    	total= n%10 + sumDigits(n/10);
    	}
        //recursion case
    	System.out.println(total);
    	return total;
    	
    }

    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        int a1 = 126;
        myassert(9 == sumDigits(a1));
        System.out.println("Pass 1");
        a1 = 2;
        myassert(2 == sumDigits(a1));
        System.out.println("Pass 2" );
        a1 = 99;
        myassert(18 == sumDigits(a1));
        System.out.println("Pass 3" );
    }

    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("SumOfDigits.java");
        testBench();
        System.out.println("DONE");
    }
}
