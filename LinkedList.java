package IceBreakers;

public class LinkedList {

    public class Node {
        Node next;
        int data;
        Node(int data) {
        	this.data = data;
        }
    }
    Node head;
    Node last;

    //print
    public void printList(){
        //WRITE YOUR CODE HERE
    	Node tmp=head;
    	while(tmp!=null){
    		System.out.println(tmp.data);
    		tmp = tmp.next;
    	}
    }

    //add
    public void addNode(int data){
        //WRITE YOUR CODE HERE
    	Node n = new Node(data);
    	if(head==null){
    		head = n;
    		last = n;
    	} else {
    		last.next = n;
    		last = n;
    	}
    }

    //reverse
	Node after;
	Node prev = null;
    public void reverseList(Node currNode){
    	if(currNode.next ==null) {
    		currNode.next = prev;
    		head = currNode;
    		return;
    	}
    	after=currNode.next;
    	currNode.next = prev;
    	prev = currNode;
    	currNode = after;
        reverseList(currNode);
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