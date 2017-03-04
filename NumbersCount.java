/*
Input String: 933262154439441526816992388562667004907159682643816

            #       
            #       
            #       
    #   #   #     # 
  # # # #   #   # # 
  # # # # # #   # # 
# # # # # # #   # # 
# # # # # # # # # # 
# # # # # # # # # # 
# # # # # # # # # # 
0 1 2 3 4 5 6 7 8 9 


Input String: 2146859296389521599993229915608941463961565182

                  # 
                  # 
                  # 
                  # 
                  # 
  # #     # #     # 
  # #     # #     # 
  # #     # #   # # 
  # # # # # #   # # 
  # # # # # #   # # 
# # # # # # #   # # 
# # # # # # # # # # 
0 1 2 3 4 5 6 7 8 9 


Input String: 2342523423432141324

    #               
    # # #           
    # # #           
    # # #           
  # # # #           
  # # # # #         
# # # # # # # # # # 
0 1 2 3 4 5 6 7 8 9 


Input String: 
Invalid Input


Input String: abc
Invalid Input


Input String: 
Invalid Input

*/


package IceBreakers;
import java.util.*;
public class NumbersCountRec {
	String str;
	int[] tmp = new int[10];
    public NumbersCountRec(String str) {
        this.str= str;
    }
    public NumbersCountRec(){
    	this.str = "";
    }
    
    
    public void findCount() {
    	System.out.println("\n\nInput String: " + str);
    	if(str.isEmpty() || (! str.matches("\\d+"))) {
    		System.out.println("Invalid Input");
    		return;
    	}

    	int arr[] = new int[10];	
    	int num;
    	int max = Integer.MIN_VALUE;
    	for(int i=0;i<str.length();i++) {
    		num = Character.getNumericValue(str.charAt(i));
    		arr[num]++;
    		max = Integer.max(arr[num], max);
    	}
    	System.out.println();

    	drawChart(arr, max);
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(i + " ");
    	}    	
    	System.out.println();
    }
    
    void drawChart(int[] arr, int max) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == max) {
    			System.out.print("# ");
    			arr[i]--;
    		} else {
    			System.out.print("  ");
    		}
    		
    	}
    	System.out.println();
    	if(max == 0) return;
    	drawChart(arr, max-1);
    	
    }
    
    public static void main(String[] args) {
        NumbersCountRec numbersCount1 = new NumbersCountRec("933262154439441526816992388562667004907159682643816");
        numbersCount1.findCount();
    	NumbersCountRec numbersCount2 = new NumbersCountRec("2146859296389521599993229915608941463961565182");
    	numbersCount2.findCount();
    	NumbersCountRec numbersCount3 = new NumbersCountRec("2342523423432141324");
    	numbersCount3.findCount();
    	NumbersCountRec numbersCount4 = new NumbersCountRec("");
    	numbersCount4.findCount();
    	NumbersCountRec numbersCount5 = new NumbersCountRec("abc");
    	numbersCount5.findCount();
    	NumbersCountRec numbersCount6 = new NumbersCountRec();
    	numbersCount6.findCount();
    }
}
