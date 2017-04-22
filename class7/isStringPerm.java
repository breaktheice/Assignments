
public class StringPermutation {

	public StringPermutation() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isStringPerm(String string1, String string2){
		
		int[] charCountString = new int[30];
	if(string1 != null && string2 != null){
		if(string1.length() == string2.length()){
		
			for(int i = 0; i < string1.length();i++){
				
				int asciival1 = (int) string1.charAt(i);
				int asciival2 = (int) string2.charAt(i);
				if(asciival1 >= 65 && asciival1  <= 90) {
					charCountString[asciival1 - 65]++;
				}
				else if(asciival1 >=97 && asciival1 <= 122){
					charCountString[asciival1 - 97]++;
					
				}
				 if(asciival2 >=97 && asciival2 <= 122){
					charCountString[asciival2 - 97]--;
				}
				else if(asciival2 >= 65 && asciival2  <= 90) {
					charCountString[asciival2 - 65]--;
				}
						
			}
			for(int i = 0; i < charCountString.length;i++){
				
				if(charCountString[i] != 0)
					return false;
			}
			return true;
		}
		else
			return false;
	}
	else
		return false;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean output1 = isStringPerm(null,null);
		System.out.println("input is null");
		boolean output2 = isStringPerm("cat","tAC");
		System.out.println("cat,tAC is "+output2);
		boolean output3 = isStringPerm("ball","lab");
		System.out.println("ball, lab is "+output3);

	}

}
