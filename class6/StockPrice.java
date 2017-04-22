/**
 * Created by IceBreakers on 3/4/17.
 *
 Say you have an array for which the i element is the price of a given stock on day i.
 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 design an algorithm to find the
 maximum profit.
 Example 1:
 ----------
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5
 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 ----------
 Input: [7, 6, 4, 3, 1]
 Output: 0
 In this case, no transaction is done, i.e. max profit = 0.
 */

public class StockPrice {

    private static int maxProfit(int[] prices){
    
    	if (prices == null){
    		return 0;
       	}
    	
    	int max = 0;
    	for(int i = 0; i < prices.length; i++){
    		for(int j= i+1; j < prices.length; j++){
    			 
    			int diff = prices[j] - prices[i];
    			if(diff >max)
    				max = diff;
    		}
    	}
    
    		return max;
    	
    	 

    }

    public static void testBench(){
        //null case
    	System.out.println("Array is null =" +maxProfit(null));
    	
    	//empty array
    	int[] prices = { };
       	System.out.println("Array is empty =" +maxProfit(prices));
    	
        // 1 element case
       	int[] prices1 = {2};
       	if(maxProfit(prices1) == 0)
       	System.out.println("No transaction done");
    	
        // multiple elements case
    	int[] prices2 = {7, 1, 5, 3, 6, 4 };
       	System.out.println("Maximun Profit =" +maxProfit(prices2));
       	
       	int[] prices3 = {7, 6, 4, 3, 1};
       	if(maxProfit(prices3) == 0)
       	System.out.println("No transaction done");
    	
    	
    }
    public static void main(String args[]){
        testBench();
    }
}
