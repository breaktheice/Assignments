import java.util.ArrayList;
import java.util.List;


/**
 * Created by Icebreakers on 3/5/17.
 * Implement a method to perform basic string compression using the counts
 of repeated characters.
 For example, the string aabcccccaaab would become a2blc5a3.
 If the "compressed" string would not become smaller than the original
 string, your method should return the original string.
 *
 */
public class StringCompressor {

    private static String compressedString(String s){
    	if(s==null){
    		return null;
    	}
    	else if(s.length()<=1){
    		return s;
    	}
    	StringBuilder output = new StringBuilder();
    	int count=1;
    	int len =s.length()-1;
    	for(int i=0;i<len;i++){
    		if(s.charAt(i)==s.charAt(i+1)){
    			count++;
    		}
    		else{
    			output.append(String.valueOf(s.charAt(i)));
    			output.append(String.valueOf(count));
    			count=1;
    		}
    		
    		if(i+1 == len){
				output.append(String.valueOf(s.charAt(i+1)));
    			output.append(String.valueOf(count));
			}
    	}
    	if(output.length() > s.length()){
    		return s;
    	}
    	return output.toString();
    }

    public static void testBench(){
        //null case
    	System.out.println(compressedString(null));
        
    	// 1 character string
    	System.out.println(compressedString("a"));
        
    	// string with multiple characters case
    	System.out.println(compressedString("aaabbbbbbbcde"));
        
    	// compressed string > original string case
    	System.out.println(compressedString("abc"));

    }
    public static void main(String args[]){
        testBench();
    }

}
