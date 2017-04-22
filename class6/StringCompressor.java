/**
 * Created by Icebreakers on 3/5/17.
 * Implement a method to perform basic string compression using the counts
 of repeated characters.
 For example, the string aabcccccaaa would become a2blc5a3.
 If the "compressed" string would not become smaller than the original
 string, your method should return the original string.
 *
 */
public class StringCompressor {

    private static String compressedString(String s){
    	
    	if(s == null)
    	
    		return null;
    	    	  	
		    	int count=0;
		    	char ch1, ch2;
		    	
		    	String compressedString = "";
		    	for(int  i=0; i< s.length(); i++){
		    		 ch1 = s.charAt(i);
		    		 if((i+1) < s.length() )
		    			 ch2 = s.charAt(i+1);
		    		 else
		    			 ch2= '\u0000';
		    		
		    		 if(ch1==ch2)
		    			 count++;
		    		 else{
		    			  
		    			  compressedString += Character.toString(ch1) + (count+1);
		    			  count=0;
		    			  
		    		 }
		    			 
		    	}
		    	if(compressedString.length() < s.length())
		    		return compressedString;
		    	else
		    		return s;
		    	
    	}

    

    public static void testBench(){
        //null case
    	System.out.println("null string="+compressedString(null));
    	
        // 1 character string	
    	System.out.println("a="+compressedString("a"));
    	
        // string with multiple characters case
    	System.out.println("aabcccccaaa="+compressedString("aabcccccaaa"));

        // compressed string > original string case
       	System.out.println("SSSABCS="+compressedString("SSSABCS"));
    	
    }
    public static void main(String args[]){
        testBench();
    }

}
