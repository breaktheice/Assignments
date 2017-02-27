package IceBreakers;
import java.util.*;
public class NumbersCount {
	String str;
    public NumbersCount(String str) {
        this.str= str;
    }
    
    public void findCount() {
    	int key;
    	Map<Integer, Integer> mapcount = new TreeMap<Integer, Integer>();
    	for(int i=0;i<str.length();i++) {
    		key = Character.getNumericValue(str.charAt(i));
    		if(mapcount.containsKey(key)) {
    			mapcount.put(key, mapcount.get(key) +1);
    		} else {
    			mapcount.put(key, 1);
    		}
    	}
    	
    	int[] arr = new int[mapcount.size()];
    	int c=0;
    	int max = Integer.MIN_VALUE;
    	for(Map.Entry entry : mapcount.entrySet()) {
    		System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
    		arr[c++] = (int)entry.getKey();
    		max = Integer.max(max, (int)entry.getValue());
    	}
    	System.out.println();

    	int val;
    	char[][] res= new char[100][100];
    	int x=0, y=0,i,j;
    	for(j=0, x=0;j<max;j++,x++) {
    		for(i=0, y=0;i<arr.length;i++,y++) {
    			val = (int)mapcount.get(arr[i]);
    			if(val > 0) {
    				res[x][y] = '#';
    				//System.out.print("# ");
    				mapcount.put(arr[i], val-1);
    			} else {
    				res[x][y] = ' ';
    				//System.out.print("  ");
    			}
    		}
    		//System.out.println();
    	}
    	
    	for(i=x-1;i>=0;i--) {
    		for(j=0;j<y;j++) {
    			System.out.print(res[i][j] + " ");
    		}
    		System.out.println();
    	}
    	for(i=0;i<arr.length;i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }
    
    public void drawGraph() {
    	
    }

    public static void main(String[] args) {
        NumbersCount numbersCount = new NumbersCount("933262154439441526816992388562667004907159682643816");
    	//NumbersCount numbersCount = new NumbersCount("2146859296389521599993229915608941463961565182");
    	//NumbersCount numbersCount = new NumbersCount("2342523423432141324");
        
        numbersCount.findCount();
        numbersCount.drawGraph();
    }
}
