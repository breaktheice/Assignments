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

    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int arr[] = new int[10];
    	int num;
    	int max = Integer.MIN_VALUE;
    	for(int i=0;i<str.length();i++) {
    		num = Character.getNumericValue(str.charAt(i));
    		if(map.containsKey(num)) {
    			map.put(num,  map.get(num)+1);
    			if(map.get(num) > max) {
    				max = map.get(num);
    			}
    		} else {
    			map.put(num, 1);
    		}
    		
			arr[num] = map.get(num);
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
    	NumbersCountRec numbersCount2 = new NumbersCountRec("2146859296389521599993229915608941463961565182");
    	NumbersCountRec numbersCount3 = new NumbersCountRec("2342523423432141324");
    	NumbersCountRec numbersCount4 = new NumbersCountRec("");
    	NumbersCountRec numbersCount5 = new NumbersCountRec("abc");
    	NumbersCountRec numbersCount6 = new NumbersCountRec();
    	
        numbersCount1.findCount();
        numbersCount2.findCount();
        numbersCount3.findCount();
        numbersCount4.findCount();
        numbersCount5.findCount();
        numbersCount6.findCount();
        
    }
}
