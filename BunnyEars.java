
/**
 We have bunnies standing in a line, numbered 1, 2, ...
The odd bunnies (1, 3, ..) have the normal 2 ears.
The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    bunnyEars2(0) → 0
    bunnyEars2(1) → 2
    bunnyEars2(2) → 5
 */
public class BunnyEars {

    public static int bunnyEars2(int bunnies) {
        // Base Case
    	int total = 0;
        if(bunnies == 0){
            return 0;
        }
        //WRITE YOUR CODE HERE
        else{
        	if(bunnies%2==0){
        		total = 3 + bunnyEars2(bunnies-1);
        	}
        	else
        		total = 2 + bunnyEars2(bunnies-1);
        }
        return total;
    }

    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }

    private static void testBench(){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        int a1 = 5;
        myassert(12 == bunnyEars2(a1));
        System.out.println("Pass 1");
        a1 = 10;
        myassert(25 == bunnyEars2(a1));
        System.out.println("Pass 2" );
        a1 = 100;
        myassert(250 == bunnyEars2(a1));
        System.out.println("Pass 3" );
    }

    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("BunnyEars.java");
        testBench();
        System.out.println("DONE");
    }

}
