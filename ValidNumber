package IceBreakers;

//Given a string, check if its a valid number or not.
//Test cases:  100, 1.4, -123, abc,null, - , .124, 1.12, 12.12.12.12, 1-1

/*
 Input: -
Invalid
Input: .124
Valid
Input: 1.12
Valid
Input: 12.12.12.12
Invalid
Input: -123
Valid
Input: -abc
Invalid
Input: 1-1
Invalid
Input: 100.000
Valid
Input: 
Invalid
Input: null
Invalid
 */

public class ValidNumber {
	String str;
	ValidNumber(String str) {
		System.out.println("Input: "+str);
		this.str = str;
	}
	
	public void validate() {
		if(isValid()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
	
	public boolean isValid() {
		if(str == null || str.isEmpty()) {
			return false;
		}
		if(str.matches("^-?\\.\\d+$")) {
			return true;
		} else if(str.matches("^-?\\d+\\.?\\d+$")) {
		    return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidNumber v1 = new ValidNumber("-");
		v1.validate();
		ValidNumber v2 = new ValidNumber(".124");
		v2.validate();
		ValidNumber v3 = new ValidNumber("1.12");
		v3.validate();
		ValidNumber v4 = new ValidNumber("12.12.12.12");
		v4.validate();
		ValidNumber v5 = new ValidNumber("-123");
		v5.validate();
		ValidNumber v6 = new ValidNumber("-abc");
		v6.validate();
		ValidNumber v7 = new ValidNumber("1-1");
		v7.validate();
		ValidNumber v8 = new ValidNumber("100.000");
		v8.validate();
		ValidNumber v9 = new ValidNumber("");
		v9.validate();
		ValidNumber v10 = new ValidNumber(null);
		v10.validate();
	}

}
