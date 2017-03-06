package IceBreakers;

public class StringCompression {
	String str;
	StringCompression(String str) {
		System.out.println("Input :" + str);
		this.str = str;
	}
	StringCompression(){
		
	}
	
	void compress() {
		if(str == null || str.isEmpty()) return;
		String res = "";
		res += str.charAt(0);
	    char prev = str.charAt(0);
	    int cnt = 1;
	    char curr;
		for(int i=1;i<str.length();i++) {
			curr= str.charAt(i);
			if(curr == prev) {
				cnt++;
				prev = curr;
			} else {
				res += cnt;
				res += str.charAt(i);
				cnt = 1;
				prev = curr;
			}
		}
		res += cnt;
		if(res.length() > str.length()) {
			System.out.println("Output :" + str);
		} else {
			System.out.println("Output :" + res);
		}		
	}

	public static void main(String[] args) {
		StringCompression comp1 = new StringCompression();
		comp1.compress();
		StringCompression comp2 = new StringCompression("");
		comp2.compress();
		StringCompression comp5 = new StringCompression("a");
		comp5.compress();
		StringCompression comp3 = new StringCompression("aabcccccaaa");
		comp3.compress();
		StringCompression comp4 = new StringCompression("abcdedf");
		comp4.compress();
	}
}
