import java.util.Stack;

public class EvaluateBracket {

	public EvaluateBracket() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean evaluate(String inputString){
		Stack<String> bracketStack = new Stack<String>();
		if(inputString == null)
			return false;
		if(inputString == "")
			return false;
		for(int i=0; i< inputString.length();i++){
			
			String s = Character.toString(inputString.charAt(i));
			if("{".equals(s) || "[".equals(s)|| "(".equals(s))
				
			bracketStack.push(s);
			
			else{ 
				  if(bracketStack.isEmpty())
					  return false;
					if( "}".equals(s) ){				
						if ( !"{" .equals(bracketStack.pop()))
								
							return false;
						
					}
					else if ("]".equals(s)){
						if (! "[" .equals(bracketStack.pop()))
							return false;
					}
					else if (")".equals(s)){
						if ( ! "(" .equals(bracketStack.pop()))
							return false;
					}
								 						
				}
		}
		if(!bracketStack.isEmpty())
			return false;
		else return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean output = evaluate(null);
		System.out.println("input is null");
		 output = evaluate("");
		System.out.println("String is empty");
		output = evaluate("{[()]}{}");
		System.out.println("{[()]}{} is "+output);
		output = evaluate("{}");
		System.out.println("{} is "+output);
		output = evaluate("{[(");
		System.out.println("{[( is "+output);
		output = evaluate("]}");
		System.out.println("]} is "+output);
		output = evaluate("[()]145");
		System.out.println("[()]145 is "+output);
		output = evaluate("{]");
		System.out.println("{] is "+output);


	}

}
