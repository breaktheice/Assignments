/**
 * Created by IceBreakers on Class 5 HW 1- Medium
 * basic operations on linked list
 * reverse a linked list using recursion
 * */
public class LinkedList {

    public class Node {
        //WRITE YOUR CODE HERE
    	int data;
        //WRITE YOUR CLASS DEFINITION HERE
    	Node next;
        //WRITE YOUR CONSTRUCTORS HERE
    	public  Node(int data){
        	this.data = data;
        }
    }
    Node head;
    
    

    //print
    public void printList(){
        //WRITE YOUR CODE HERE
    	Node curr = head;
    	while(curr!=null){
    		System.out.println(curr.data);
    		curr = curr.next;
    	}
    }

    //add
    public void addNode(int data){
        //WRITE YOUR CODE HERE
    	Node curr = head;
    	Node newNode = new Node(data);
    	if(head == null){
    		head = newNode;
    	}
    	else{
    		while(curr.next!=null){
    			curr = curr.next;
    		}
    		curr.next = newNode;
    	}
    }

    //reverse
    public void reverseList(Node currNode){
        //WRITE YOUR CODE HERE
        //base case
    	if(currNode.next==null){
    		head = currNode;
    		return;
    	}
        reverseList(currNode.next);
        currNode.next.next= currNode;
        currNode.next=null;
        //RECURSION
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
        reverseList.addNode(7);
           

        reverseList.printList();
        System.out.println("");
        System.out.println("middle element is " + findMiddleElement(reverseList.head));
        System.out.println("");
        reverseList.reverseList(reverseList.head);
        reverseList.printList();
    }
    public static void main(String[] args){
        testBench();
    }
    
    public static int findMiddleElement(Node currNode){
    	Node fastPtr = currNode;
    	Node slowPtr = currNode;
    	
    	while( fastPtr!=null && fastPtr.next != null){
    			fastPtr = fastPtr.next.next;
    		slowPtr = slowPtr.next;
    	}
    	return slowPtr.data;
    }
}

