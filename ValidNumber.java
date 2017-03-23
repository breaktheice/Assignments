public ValidNumber() {
		// TODO Auto-generated constructor stub
	}

	public static boolean isValid(String inputString){
		
		if(inputString == null || inputString == "")
			return false;
		int countDot =0;
		Character c = inputString.charAt(0);
		if( c == '-' || c == '.' || c == '+' || (c >= 48 && c <= 57)){
			if( c == '.')
				countDot++;

			for (int i = 1; i < inputString.length(); i++){
			  c = inputString.charAt(i);
				if( (c >= 48 && c <= 57) || (c == '.' && countDot == 0) ) {
					if( c == '.')
						countDot++;
				}
				else
					return false;
				
			}
			return true;
		}
		else
			return false;
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean output = isValid(null);
		System.out.println("input is null");
		output = isValid("");
		System.out.println("String is empty");
		output = isValid("-12.4");
		System.out.println("-12.4 is "+output);
		output = isValid("+456");
		System.out.println("+456 is "+output);
		output = isValid("-12.4abc");
		System.out.println("-12.4abc is "+output);
		output = isValid("-12.499.00");
		System.out.println("-12.499.00 is "+output);
		output = isValid("-124-555");
		System.out.println("-124-555 is "+output);
		

	}

}
