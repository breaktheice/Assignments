/*
 * Write a logic to count of number of numbers in the given input string
 * Input is String
 * Output will print the number of occurences for each number
 * 
 * Ex. 933262154439441526816992388562667004907159682643816
 * Output will be 
 *  0 occurs 3 times
    1 occurs 5 times
    2 occurs 6 times
    3 occurs 5 times
    4 occurs 6 times
    5 occurs 4 times
    6 occurs 9 times
    7 occurs 2 times
    8 occurs 5 times
    9 occurs 6 times
 * 
 * Also print the output as bar graph with x axis as numbers
 * and y axis with "#"  as of number of occurences
 *  
 *  
 *               # 
 *               #
 *               #
 *       #   #   #     # 
 *     # # # #   #   # #
 *     # # # # # #   # #
 *   # # # # # # #   # #
 *   # # # # # # # # # #
 *   # # # # # # # # # #
 *   0 1 2 3 4 5 6 7 8 9 
 *   
 *   ex.2 
 *   
 *   Input: 2146859296389521599993229915608941463961565182
 *   
 *   Ouput: 
 *   '\]
 *  0 occurs 1 times 
    1 occurs 6 times 
    2 occurs 6 times
    3 occurs 3 times
    4 occurs 3 times
    5 occurs 6 times
    6 occurs 6 times
    7 occurs 0 times
    8 occurs 4 times
    9 occurs 11 times

                       
                       #
                       #
 *                     #
 *                     # 
 *                     # 
 *     # #     # #     # 
 *     # #     # #     #
 *     # #     # #   # #
 *     # # # # # #   # #
 *     # # # # # #   # #
 *   # # # # # # #   # #
 *   0 1 2 3 4 5 6 7 8 9 

 *
 */

public class NumbersCount {
	int[] count = new int[10];


    public NumbersCount() {
        super();
    }

    public static void main(String[] args) {
        NumbersCount numbersCount = new NumbersCount();
        numbersCount.testBench();
    }
    
    public void printGraph(int[] count){
    	int column=0;
    	int rows = count.length;
    	for(int i=0;i<count.length;i++){
    		if(count[i]>column){
    			column = count[i];
    		}
    		
    	}
	    for(int j =column; j>0;j--){

    	for(int i = 0; i<rows; i++){
    	        if(count[i]==j){
    	        	System.out.print("#" + " ");
    	        	count[i]=count[i]-1;
    	        }
    	        else
    	        	System.out.print(" " + " ");
    	    }
    	    System.out.print("\n");
    	}
    	for(int i = 0; i<rows; i++){
    		System.out.print(i + " ");
    	}

    	
    }
    
    public int[] numberCount(String input){
    	int index = input.length()-1;
    	String newInput;

    	if(index<0){
    		
    		return count;
    	}
    	
    	if(input.charAt(index)=='0'){
    		count[0] += 1;
    	}
    	else if(input.charAt(index)=='1'){
    		count[1] += 1;

    	}
    	else if(input.charAt(index)=='2'){
    		count[2] += 1;

    	}
    	else if(input.charAt(index)=='3'){
    		count[3] += 1;

    	}
    	else if(input.charAt(index)=='4'){
    		count[4] += 1;

    	}
    	else if(input.charAt(index)=='5'){
    		count[5] += 1;

    	}
    	else if(input.charAt(index)=='6'){
    		count[6] += 1;

    	}
    	else if(input.charAt(index)=='7'){
    		count[7] += 1;

    	}
    	else if(input.charAt(index)=='8'){
    		count[8] += 1;

    	}
    	else if(input.charAt(index)=='9'){
    		count[9] += 1;

    	}
    	
    	
    	newInput = input.substring(0, index);
    	numberCount(newInput);
    	return count;
    }
    
    public void testBench(){
    	int[] counter = numberCount("2146859296389521599993229915608941463961565182");
    	for(int i=0;i<10;i++){
    		System.out.println(i +" " + "Occurs" + " " + counter[i] +" " + "times");
    		
    	}
    	
    	System.out.println("\n");
    	printGraph(counter);
    	System.out.println("\n");

    	count = new int[10];
    	int[] newcount = numberCount("933262154439441526816992388562667004907159682643816");
    	for(int i=0;i<10;i++){
    		System.out.println( i +" " + "Occurs" + " " + newcount[i] +" " + "times");
    		
    	}
    	
    	System.out.println("\n");

    	printGraph(newcount);

    }
}
