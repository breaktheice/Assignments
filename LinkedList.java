/**
 * Created by IceBreakers on Class 5 HW 1- Medium
 * basic operations on linked list
 * reverse a linked list using recursion
 * */
public class LinkedList {

    public class Node {
        //WRITE YOUR CODE HERE
    	 //WRITE YOUR CLASS DEFINITION HERE
    	int data;
    	Node next;
    	public void setData(int data){
    		
    		this.data = data;
       	}
    	
   public int getData(){
	   return data;
   }
   
   public void setNext(Node next){
		
		this.next = next;
  	}
   public Node getNext(){
	   return next;
   }

        //WRITE YOUR CONSTRUCTORS HERE
    }
    Node head;
    Node temp;

    //print
    public void printList(){
        //WRITE YOUR CODE HERE
    temp=head;
    while(temp!=null){
    	
    		System.out.println(temp.getData());
    		temp =temp.getNext();
       	}
    	
    }

    //add
    
    public void addNode(int data){
        //WRITE YOUR CODE HERE
    	Node node = new Node();
    	node.setData(data);
    	if(head == null){
    		
    		head=node;
    		
    	}
      	else{
    		
    		temp= head;
    		//temp.setNext(node);
    		while (temp.getNext()!=null) {
    			
    			temp =temp.getNext();
    			   			    			
    		}
    		temp.setNext(node);
    		   		
    	}   	
   	
    	
    	
    }

    //reverse
    public void reverseList(Node currNode){
        //WRITE YOUR CODE HERE

        //base case
    	if(currNode.getNext() == null){
    		head= currNode;
    		return ;
    	}

        //RECURSION
    	Node secondNode = currNode.getNext();
        reverseList(secondNode);
        secondNode.setNext(currNode);
        currNode.setNext(null);
    }

    //test
    public static void testBench(){
       LinkedList reverseList = new LinkedList();
        reverseList.addNode(1);
        reverseList.addNode(2);
        reverseList.addNode(3);
        reverseList.addNode(4);
        reverseList.addNode(5);
        reverseList.addNode(6);


        reverseList.printList();
        System.out.println("");
        reverseList.reverseList(reverseList.head);
       
        reverseList.printList();
    }
    public static void main(String[] args){
       testBench();
    	
    }
}
