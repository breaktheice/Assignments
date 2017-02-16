import java.util.*;
/**
 * Created by IceBreakers on 2/11/17.
 * Class 3, Easy-1 Problem PrimeNumbers.java
 * 1. Return all 4-digit prime numbers in an ArrayList
 * 2. Print the 2nd largest 6-digit prime number
 */
public class PrimeNumbers {

    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    private static int secondMaxSixDigitPrime(){
        //WRITE YOUR CODE HERE
    	int i = 1000000;    	
    	int check = 0;
    	while(i>1){
    		if(isPrime(i)){
    			check++;
    		}
    		if(check==2){
    			return i;
    		}
    		i--;
    		
    	}
			return i;
		
    }

    private static boolean isPrime(int primeNum){
    	boolean isPrime = false;
    	int count=0;
    	if(primeNum%2!=0){	

			for(int j = 3;j<=primeNum;){
				if(primeNum%j==0){
				count++;
			}
				j= j+2;
				if(count>1){
					isPrime = false;
					break;
				}
				else
					isPrime = true;
		}
		}
    	return isPrime;
    }
    private static List<Integer> fourDigitPrimes(){
        //WRITE YOUR CODE HERE
    	List<Integer> primeNum = new ArrayList<>();
    	int i = 1000;
    	while(i<10000){
	    	if(isPrime(i)){
    			primeNum.add(i);
    		}
    		i++;	
    	}
    	System.out.println(primeNum.size());
    	return primeNum;
    	
    }

    private static void testBench(){
        myassert(secondMaxSixDigitPrime() == 999979);
        System.out.println(secondMaxSixDigitPrime());
        List<Integer> output = fourDigitPrimes();
        myassert(output.size()==1061);
    }
    public static void main(String args[]){
        System.out.println("PrimeNumbers.java");
        testBench();
        System.out.println("DONE");

    }
}
