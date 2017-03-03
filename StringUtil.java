/**
 * Created by IceBreakers on 2/4/17.
 * Reverse a sentence
 * Url Parser
 * Input:
 */
public class StringUtil {

	private static String[] strSplitArr = null;
	private static String strReverse ="";
   private static String[] URLParser(String url){
        //WRITE YOUR CODE HERE..
	    //parse the url and get all the get parameters and return an array of Strings
        //Input: google.com/api?param1=value1&param2=value2
        //Output: array of strings [] = { {param1:value1}, {param2:value2} }
	   int index = url.indexOf("?");
	   String s= url.substring(index+1);
	   strSplitArr = s.split("&"); 
	   for(int i=0 ; i< strSplitArr.length ; i++){
		   strSplitArr[i] ="{" +  strSplitArr[i].replaceAll("=",":")+"}";
		  // System.out.println("param=" + strSplitArr[i] );
	   }
	   return strSplitArr;
	   

	   
    }
    private static String reverseWords(String sentence){
        //WRITE YOUR CODE HERE..
    	if(sentence != null){
    	strSplitArr = sentence.split(" "); //splitting the string 
    	//System.out.println("strSplitLenght=" + strSplitArr.length);
    	for (int i= strSplitArr.length-1; i >= 0; i--){
    		if(i>0){
    		strReverse += strSplitArr[i] + " ";
    		}
    		else
    		{
    			strReverse += strSplitArr[i];
    		}
    		
    	}
    	
    	//System.out.println("strReverse=" + strReverse);
    	return strReverse;
    	}
    	else{
    		return null;
    	}
    }

  private static String reverseString(String sentence){
        //WRITE YOUR CODE HERE..
	  if(sentence !=null){
		  String strReverse = "";
		  strSplitArr = sentence.split(" ");
		  //System.out.println("strSplitLenght=" + strSplitArr.length);
		  for (int i = 0 ;i < strSplitArr.length; i++){
			  	for ( int j =strSplitArr[i].length()-1 ; j>=0 ; j-- ){
  			 
			  			strReverse  +=  strSplitArr[i].charAt(j);
  			
			  	}
			  	if(i < strSplitArr.length -1){
			  		strReverse += " ";
			  	}
		  }
  	//System.out.println("strReverse=" + strReverse);
    	return strReverse;
	  }
	  else{
		  return null;
	  }
    }
    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        String input = "God is great";
        String output = null;
       System.out.println("Input 1: " + input);
        output = reverseWords(input);
        System.out.println("Output 1: " + output);
        myassert(output.equals("great is God"));

        System.out.println("Input 2: " + input);
        output = reverseString(input);
        System.out.println("Output 2: " + output);
        myassert(output.equals("doG si taerg"));

        input = null;
        System.out.println("Input 3: " + input);      
        output = reverseWords(input);
        System.out.println("Output 3: " + output);
        myassert(input == output);

        String url = "https://google.com.ua/oauth/authorize?client_id=SS&response_type=code&scope=N_FULL&access_type=offline&redirect_uri=http://localhost/Callback";
        String getParams[] = URLParser(url);
        myassert(getParams.length == 5);
        myassert(getParams[0].equals("{client_id:SS}"));

    }
    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("ReverseSentence.java");
        testBench();
        System.out.println("DONE");
    }
}
