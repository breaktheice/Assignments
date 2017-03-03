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
    	int count=0;
    	int numFound =0;
    	
    	for(int n=999999 ; n >=100001 ; n-=2){
    		boolean flag = false ;
     		for(int m =2; m <= n / 2 ; m++){
     			if(n % m ==0   ){
    				flag =true;
       				break;    			
    			}
        		    	
    		}
     		
     		if (!flag){
     		
     			count++;
     			if(count==2){
     					numFound=n;
     					break;
     			}
     			//System.out.println(n);
     		}
    	}
    	return  numFound;
}


    private static List<Integer> fourDigitPrimes(){
    	
          //WRITE YOUR CODE HERE
    	ArrayList<Integer> primeList = new ArrayList<Integer>();
    	
    	for(int n=1000 ; n <=9999 ; n+=1){
    		boolean primeFound = false ;
     		for(int m =2; m <= n / 2 ; m++){
     			if(n % m ==0   ){
    				primeFound =true;
       				break;    			
    			}
        		    	
    		}
     		
     		if (!primeFound)
				primeList.add(n);	
    	}
    	return primeList;
    }

    private static void testBench(){
        myassert(secondMaxSixDigitPrime() == 999979);
       System.out.println(secondMaxSixDigitPrime());
        List<Integer> output = fourDigitPrimes();
     // System.out.println("output"+output.size());
      myassert(output.size()==1061);
    }
    public static void main(String args[]){
        System.out.println("PrimeNumbers.java");
        testBench();
        System.out.println("DONE");

    }
}
