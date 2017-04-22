import java.util.Stack;


public class StringEvaluate {

	public static boolean evaluate(String input){
		
		if (input == null || input == ""){
			return true;
		}
		else if(input.length() == 1){
			return false;
		}
		
		Stack<Character> myStack = new Stack<>();
		char c , check;
		
		for(int i = 0 ; i < input.length() ; i++){
			
			c = input.charAt(i);
			
			if(c == '(' || c == '{' || c == '['){
				myStack.push(c);
			}
			
			if(c == ')' || c == '}' || c == ']'){
				
				if( myStack.isEmpty() ){
					return false;
				}
				check = myStack.pop();
				
				if( !(check == '(' && c == ')' || check == '{' && c == '}' || check == '[' && c == ']') ){
					return false;
				}
			}
		}
		if( !myStack.isEmpty() ){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(evaluate("{[[[[.,]]]]}"));
	}
	
}
