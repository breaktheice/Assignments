/**
 * Created by IceBreakers on 2/5/17.
 * Build Browser stack() - browser back which was discussed in Saran class
 *
 * Implement your OWN DYNAMICALLY GROWING STACK using SIMPLE ARRAY and the following basic stack operations
 *      DONT USE ANY JAVA COLLECTIONS LIKE STACK
 *
 *         push()       - pushes the element in this case its a url (String)
 *         pop()        - pops the element from the stack
 *         search()     - searches the element in the stack
 *         peek()       - peeks the element without pop
 *         printStack() - prints the Stack preserving all its values
 *         size()       - returns the length of the stack
 *         isEmpty()    - return true if stack is not empty else false
 *
 */
import java.util.*;
public class BrowserStack {

    ArrayList<String> myStack = null;
    int top;
    int STACK_SIZE = 16; //INITIAL STACK SIZE, GROW IF ITS NEEDED
    boolean isUrlFound = false;

    //Constructor to initialize your stack
    BrowserStack(){
        this.myStack = new ArrayList<String>(STACK_SIZE);
        this.top = -1;
    }


    public static void myassert(boolean  x) {
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        if (!x) {
            throw new IllegalArgumentException("Assert fail") ;
        }
    }
    //push() - pushes the element in this case its a url (String)
    private  void push(String url){
        //WRITE YOUR CODE HERE
    	
    	top ++;
    	myStack.add(top, url);
    	    	
    		
    }
    //pop()- pops the element from the stack
    private String pop(){
        //WRITE YOUR CODE HERE
    	if (!isEmpty()){
		 String popUrl = myStack.remove(top);
		 top--;
		 // System.out.println("pop" +popUrl);
		 	return popUrl;
    	}
    	else
    		return("Stack is empty");
    }

   private void printStack(){
        //WRITE YOUR CODE HERE
	   if (!isEmpty()){
	    String popValue=pop();
	     System.out.println("element=" + popValue);
	     if(isEmpty())
	     {  
	    	 push(popValue); //break the recursive when the stack is empty
	    	 return;
	     }
	     printStack(); // using recursive method to print the stack
	     
	     push(popValue);
	     
	   }      

    }
    private  String peek(){
        //WRITE YOUR CODE HERE
    	 System.out.println("peekelement=" +myStack.get(top));
         return( myStack.get(top));
         

    }
   private  int size(){
        //WRITE YOUR CODE HERE
         return(top+1);

    }
    private  boolean isEmpty(){
        //WRITE YOUR CODE HERE
		if(top !=-1)
			return false;
		else 
			return true;
		
		
    }
  /* private void findBrowser(String url) {  
    										// Searching the element in the stack using recursive method
	   
	   String popValue = pop();
	   if (url.equals(popValue) && !isEmpty()){
		   push(popValue);						// if the search value is found or stack is empty break the recursive loop
		   isUrlFound = true;
		   return;
	   }
	   else if(isEmpty()){
		   push(popValue);
		   isUrlFound = false;
		   return;
	   }
		   findBrowser(url);  //
		   push(popValue);
   }*/
    
   private  boolean search(String url){
      
	   //WRITE YOUR CODE HERE
	/*   findBrowser(url);     // Searching the element in the stack using recursive method
	   return isUrlFound;*/


	   String[] newStackArr = new String[top+1]; // initializing temporary array to store the popped value
	   String urlPop="";
	   int j=0;
	   boolean searchFound=false;
	 while(top!=-1){
		   
		    urlPop = pop();
		    newStackArr[j]=urlPop;
		    j++;
		   if(url.equals(urlPop)){
			   searchFound = true;
			   break;
		   }
		  		   
	   }
	 for( int i =j-1; i>=0 ;i--){      //push the popped value from temporary array to stack
		// System.out.println("newStackArr="+newStackArr[i]); 
			push(newStackArr[i]);
		
	 }
	return searchFound; 
	
	   
	   
	   
    }
    private static void testBench(BrowserStack browserStack){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        browserStack.push("g.co");
        browserStack.push("y.be");
        browserStack.push("f.bk");
        browserStack.push("y.ho");
        browserStack.printStack();
        myassert(browserStack.search("y.be"));
        myassert(!browserStack.search("y.be1"));
        browserStack.printStack();
        myassert(browserStack.size() == 4);
        browserStack.pop();
        myassert(browserStack.pop().equals("f.bk"));
        browserStack.peek();
        browserStack.isEmpty();
       browserStack.pop();browserStack.pop();
       browserStack.printStack();
        myassert(browserStack.size() == 0);
    }
    public static void main(String args[]){
        //CANNOT CHANGE CODE BELOW. MUST USE AS IS
        System.out.println("BrowserStack.java");
        BrowserStack testBrowser = new BrowserStack();
        testBench(testBrowser);
        System.out.println("DONE");
    }
}
