

/**
 * Created by IceBreakers on 2/4/17.
 * Reverse a sentence
 * Url Parser
 * Input:
 */
public class StringUtil {
	

    private static String[] URLParser(String url){
        //WRITE YOUR CODE HERE..
        //parse the url and get all the get parameters and return an array of Strings
        //Input: google.com/api?param1=value1&param2=value2
        //Output: array of strings [] = { {param1:value1}, {param2:value2} }
    	int ind = url.indexOf('?');
    	String param = url.substring(ind+1);
    	String[] paramList = param.split("&");
    	int n = paramList.length;
    	String[] newparamList = new String[n];
    	for(int i=0;i<n;i++){
    		newparamList[i] = "{";
    		newparamList[i] = newparamList[i].concat(paramList[i]);
    		newparamList[i] = newparamList[i].concat("}");
    		newparamList[i] = newparamList[i].replace('=', ':');
    	}
    	return newparamList;
    }
    private static String reverseWords(String sentence){
        //WRITE YOUR CODE HERE..
    	if(sentence==null || sentence==""){
    		return sentence;
    	}
    	String output = "";
    	String[] strArr = sentence.split(" ");
    	int n = strArr.length - 1;
    	for(int i=n;i>=0;i--){
    		output = output.concat(strArr[i]);
    		if(i!=0){
    		output = output.concat(" ");	
    		}
    	}
    	return output;
    }

    private static String reverseString(String sentence){
        //WRITE YOUR CODE HERE..
    	if(sentence==null || sentence==""){
    		return sentence;
    	}
    	String output = "";
    	String[] strArr = sentence.split(" ");
    	int n = strArr.length - 1;
    	for(int i=0; i<=n;i++){
    		output = output.concat(reverse(strArr[i]));
    		if(i!=n){
        		output = output.concat(" ");	
        		}
    	}
    	return output;
    }
    /*
     * This method reverses the given String.
     */
    private static String reverse(String strArr){
    	char[] charArr = strArr.toCharArray();
    	char temp;
    	int i=0;
    	int j = charArr.length-1;
    	while(i<j){
    		temp = charArr[i];
    		charArr[i] = charArr[j];
    		charArr[j] = temp;
    		i++; j--;
    	}
    	return String.valueOf(charArr);
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

