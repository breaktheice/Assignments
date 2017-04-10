
public class Fibonacci {

	
	public static int getFibonacciNum (int a, int b, int n){
		if(n == 1){
			return a;
		}
		if(n ==2){

			return b;
		}
		
		return getFibonacciNum(b , a+b , n-1);
		
	}
	
	public static int fibonacciNum(int n){
		if( n <= 0)
			return 0;
		int a = 0;
		int b = 1;
		return getFibonacciNum(a,b,n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fibonacciNum(5));
	}

}
