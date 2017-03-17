public class MiddleElement {

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
	    		while (temp.getNext()!=null ) {
	    			
	    			temp =temp.getNext();
	    			   			    			
	    		}
	    		temp.setNext(node);
	    		   		
	    	}   	
	   	
	    	
	    	
	    }
	    public int findMiddleElement(Node head){
	    	Node temp1 = head;
	    	Node temp2 = head;
	    	while(temp1 !=null && temp1.getNext()!=null && temp1.getNext().getNext()!=null){
	    		 temp1 = temp1.getNext().getNext();
	    		 temp2 = temp2.getNext();
	    	 }
	    	 return(temp2.getData());
	    	 
	    	/*    while(temp!=null){
	    	    	
	    	    		temp =temp.getNext();
	    	    		count++;
	    	       	}
	    	    if(count % 2 == 0)
	    	    	middleElement = count / 2 ;
	    	    else
	    	    	middleElement = (count / 2 ) + 1;  
	    	    
	    	    
	    	    System.out.println("middleElement="+middleElement);*/
	    	 
	     	
	    	
	    }

	    //test
	    public static void testBench(){
	    	MiddleElement newList = new MiddleElement();
	       newList.addNode(1);
	       newList.addNode(2);
	       newList.addNode(3);
	       newList.addNode(4);
	       newList.addNode(5);
	       newList.addNode(6);

	       newList.printList();

	       System.out.println("Middle element is " + newList.findMiddleElement(newList.head));
	       
		   newList.addNode(7);
	       newList.addNode(8);
	       newList.addNode(9);
		   newList.printList();
		       
		       
		   System.out.println("Middle element is " + newList.findMiddleElement(newList.head));

	    }
	    public static void main(String[] args){
	       testBench();
	    	
	    }

}
