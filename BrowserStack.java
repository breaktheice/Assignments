import java.util.Arrays;


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
 *o--
 */
public class BrowserStack {

    String[] myStack;
    int top;
    int STACK_SIZE = 2; //INITIAL STACK SIZE, GROW IF ITS NEEDED

    //Constructor to initialize your stack
    BrowserStack(){
        this.myStack = new String[STACK_SIZE];
        this.top = -1;
    }
    private void createNewStack(){
    	String[] newStack = new String[STACK_SIZE * 2];
    	newStack = Arrays.copyOf(myStack, newStack.length);
    	STACK_SIZE = STACK_SIZE *2;
    	myStack = newStack;
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
    	if(isFull()){
    		createNewStack();
    	}
    	top = top + 1;
    	myStack[top] = url;
    }
    //pop()- pops the element from the stack
    private String pop(){
        //WRITE YOUR CODE HERE
    	String popped;
    	if(top<0){
    		popped = "Stack is empty";
    	}
    	else{
    	popped = myStack[top];
    	myStack[top] = null;
    	}
    	top--;
    	return popped;
    } 

    private void printStack(){
        //WRITE YOUR CODE HERE
    	if(isEmpty()){
    		System.out.println("Stack is empty");
    	}
    	int temptop = -1;
    	String[] tempStack = new String[myStack.length];
    	while(top>=0){
    		peek();
    		temptop++;
    		tempStack[temptop] = pop();
    	}
    	// Moving the elements to mystack from tempstack
    	while(temptop>=0){
    		push(tempStack[temptop]);
    		temptop--;
    	}    	
    	
    } 
    private  String peek(){
        //WRITE YOUR CODE HERE
         String peeked;
    	peeked = myStack[top];
    	System.out.println(peeked);
    	return peeked;


    }
    private  int size(){
        //WRITE YOUR CODE HERE
        return top+1;

    }
    private  boolean isEmpty(){
        //WRITE YOUR CODE HERE
    	if(top==-1){
    		return true;
    	}
    	return false;
    }
    private  boolean isFull(){
        //WRITE YOUR CODE HERE
    	if(top==(STACK_SIZE-1)){
    		return true;
    	}
    	return false;
    }
    private  boolean search(String url){
        //WRITE YOUR CODE HERE
    	int temptop = -1;
    	boolean ispresent =false;
    	String[] tempStack = new String[myStack.length];
    	while(top>=0){
    		if(myStack[top].equalsIgnoreCase(url)){
    			ispresent =  true;
    			break;
    		}
    		else{
    			temptop++;
    			tempStack[temptop] = pop();
    			}
    	}
    	// Moving the elements to mystack from tempstack
    	while(temptop>=0){
    		push(tempStack[temptop]);
    		temptop--;
    	}
        return ispresent;
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
