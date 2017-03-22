package IceBreakers;
import java.util.*;

/*
 * // Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
// Test cases: your testbench() should have (], ([]), ((, )), ()), ((12
 */

/*
Input: ()[]{}
Valid
Input: ([{}{}])]
Invalid
Input: [[[({}{()})]]]
Valid
Input: ([[[({}{()})]]]
Invalid
Input: )[[[({}{()})]]]
Invalid
Input: [[[({}}{()})]]]
Invalid
Input: {{[[]{}()]}(([]{}))}
Valid
Input: 
Invalid
Input: {abcd[]}
Invalid

 */

public class MatchBrackets {
	String str;
	MatchBrackets(String str){
		System.out.println("Input: " + str);
		this.str = str;
	}
	
	public void solve() {
		if(validate()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
	
	public boolean validate() {
		if(str == null || str.isEmpty()) {
			return false;
		} else if(!str.matches("[\\(\\{\\[\\)\\}\\]]+")){
			return false;
		}
		Stack<Character> st = new Stack<Character>();
		Character  ch;
		for(int i=0;i<str.length();i++){
			ch = str.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else if(st.size() > 0) {		
			    if(ch == ')' && st.peek() != '(') {
					return false;
				} else if(ch == ']' && st.peek() != '[') {
					return false;
				} else if(ch == '}' && st.peek() != '{') {
					return false;
				} else {
					st.pop();
				}
			} else {
				return false;
			}
		}
		if(st.size() > 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatchBrackets m1 = new MatchBrackets("()[]{}");
		m1.solve();

		MatchBrackets m2 = new MatchBrackets("([{}{}])]");
		m2.solve();
		
		MatchBrackets m3 = new MatchBrackets("[[[({}{()})]]]");
		m3.solve();
		
		MatchBrackets m4 = new MatchBrackets("([[[({}{()})]]]");
		m4.solve();
		
		MatchBrackets m5 = new MatchBrackets(")[[[({}{()})]]]");
		m5.solve();
		
		MatchBrackets m6 = new MatchBrackets("[[[({}}{()})]]]");
		m6.solve();
		
		MatchBrackets m7 = new MatchBrackets("{{[[]{}()]}(([]{}))}");
		m7.solve();
		
		MatchBrackets m8 = new MatchBrackets("");
		m8.solve();
		
		MatchBrackets m9 = new MatchBrackets("{abcd[]}");
		m9.solve();
	}
}
