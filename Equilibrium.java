
public class Equilibrium {

	public Equilibrium() {
		// TODO Auto-generated constructor stub
	}

	public static int findEquilibrium(int[] numArray){
		int total = 0;
		int LHS =0;
		int RHS = 0;
		for(int i = 0; i < numArray.length; i++){
			 total = total + numArray[i];
		}
		RHS = total;
		for(int i = 0; i < numArray.length; i++){
			 RHS -= numArray[i];
			 if(LHS == RHS)
				 return i+1;
			 LHS = LHS + numArray[i];
				
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray1 = {2,4,3,0,5,9};
		System.out.println("Equilibrium index =" + findEquilibrium(numArray1));
		int[] numArray2 = {-7,1,5,2,-4,3,0};
		System.out.println("Equilibrium index =" + findEquilibrium(numArray2));
		int[] numArray3 = {2,4,3,7,5,9};
		System.out.println("Equilibrium index =" + findEquilibrium(numArray3));
		
		

	}

}
