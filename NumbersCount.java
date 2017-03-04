package IceBreakers;
import java.util.*;
public class NumbersCountRec {
	String str;
    public NumbersCountRec(String str) {
        this.str= str;
    }
    public NumbersCountRec(){
    	this.str = "";
    }
    
    
    public void findCount() {
    	
    	if(str.isEmpty() || (! str.matches("\\d+"))) {
    		System.out.println("Invalid Input");
    		return;
    	}

    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int arr[] = new int[10];
    	int num;
    	for(int i=0;i<str.length();i++) {
    		num = Character.getNumericValue(str.charAt(i));
    		if(map.containsKey(num)) {
    			map.put(num,  map.get(num)+1);
    		} else {
    			map.put(num, 1);
    		}
			arr[num] = map.get(num);
    	}
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    	
    	drawChart(arr, 0);
    	
    }
    
    void drawChart(int[] arr, int flag) {

    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] != 0) {
    			System.out.print("# ");
    			arr[i]--;
    			flag = 1;
    		} else {
    			System.out.print("  ");
    		}
    	}
    	System.out.println();
    	if(flag == 0) return;
    	drawChart(arr, 0);
    }
    public static void main(String[] args) {
        NumbersCountRec numbersCount = new NumbersCountRec("933262154439441526816992388562667004907159682643816");
    	//NumbersCountRec numbersCount = new NumbersCountRec("2146859296389521599993229915608941463961565182");
    	//NumbersCountRec numbersCount = new NumbersCountRec("2342523423432141324");
    	NumbersCountRec numbersCount1 = new NumbersCountRec("");
    	
    	NumbersCountRec numbersCount2 = new NumbersCountRec("abc");
    	NumbersCountRec numbersCount3 = new NumbersCountRec();
    	
        numbersCount.findCount();
        numbersCount1.findCount();
        numbersCount2.findCount();
        numbersCount3.findCount();
    }
}
