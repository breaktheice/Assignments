
public class NumberValid {

	
	public static boolean isNumberValid(String input){
		
		if(input == null){
			return false;
		}
		char c = input.charAt(0);
		if(input.length() == 1 && !(c >= 48 && c <= 57)){
			return false;
		}
		
		int dotcount = 0;
		char d;
		if( c == '+' || c == '-' || c == '.' || (c >= 48 && c <= 57)){
			
			if(c == '.'){
				dotcount += 1;
			}
			
			for(int i = 1 ; i < input.length() ; i++){
				 d = input.charAt(i);
				if( d == '.' ){
					dotcount++;
			}
				if(d == '+' || d == '-' || dotcount > 1 || (d < 48 && d > 57)){
					return false;
				}
		}
		}
		else{
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isNumberValid("+1.23"));
		System.out.println(isNumberValid("1-23"));
		System.out.println(isNumberValid("ab27"));
		System.out.println(isNumberValid("0.000"));

	}
	
}
