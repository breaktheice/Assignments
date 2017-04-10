
import java.util.*;

public class BinaryTree {

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}
	
	public class Node {
		
		public int data;
		public Node left , right;
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
		
	}
	Node root;
	Boolean isDataFound;
	int minimum;
	
	// Creating Binary Tree
	
	public void createBinaryTree(BinaryTree bTree){
		
	BinaryTree.Node node1 = bTree.new Node(1);
	BinaryTree.Node node2 = bTree.new Node(2);
	BinaryTree.Node node3 = bTree.new Node(3);
	BinaryTree.Node node4 = bTree.new Node(4);
	BinaryTree.Node node5 = bTree.new Node(5);
	BinaryTree.Node node6 = bTree.new Node(6);
	BinaryTree.Node node7 = bTree.new Node(7);
	BinaryTree.Node node8 = bTree.new Node(8);
	BinaryTree.Node node9 = bTree.new Node(9);
	BinaryTree.Node node10 = bTree.new Node(10);
	BinaryTree.Node node11 = bTree.new Node(11);
	BinaryTree.Node node12 = bTree.new Node(12);
	BinaryTree.Node node13 = bTree.new Node(13);
	BinaryTree.Node node14 = bTree.new Node(14);
	
	bTree.root= node1;
	
	node1.left=node2;
	node1.right=node3;
	node2.left=node4;
	node2.right=node5;
	node3.left=node6;
	node3.right=node7;
	node4.left=node8;
	node4.right=node9;
	node5.left=node10;
	node5.right=node11;
	node6.left=node12;
	node7.left=node13;
	node7.right=node14;

}
	//Deleting BTree
	
	public void deleteBTree(Node root){
		if (root ==null)
			return;
		if(root.left == null && root.right==null)
			return;
		deleteBTree(root.left);
		deleteBTree(root.right);
		
	//	System.out.println("Deleting " + root.data);
		root.left=null;
		root.right=null;
		root = null;
		this.root=null;
	}
	
	// InOrder Traversal
	
	public void inOrderTraversal(Node root){

		if(root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(" " + root.data);
		inOrderTraversal(root.right);
	}
	
	// PreOrder Traversal
	
public void preOrderTraversal(Node root){

		if(root == null)
			return;
		System.out.print(" " + root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
// PostOrder Traversal

public void postOrderTraversal(Node root){
	if(root == null)
		return;
	postOrderTraversal(root.left);
	postOrderTraversal(root.right);
	System.out.print(" " + root.data);
}

// Level Order Traversal

public void levelOrderTraversal(Node root){
	
	
	if (root == null)
		 return;
	Queue<Object> levelOrderTraversalQueue = new LinkedList<Object>();
	Node node = null;
	String str;
	levelOrderTraversalQueue.add(root);
	levelOrderTraversalQueue.add("#");
	
	while(!levelOrderTraversalQueue.isEmpty()){
		
		Object temp=levelOrderTraversalQueue.remove();
		
		if(temp instanceof Node){
		 node = (Node)temp;
		 System.out.print(" "+node.data);
		 if(node.left!=null)
			 levelOrderTraversalQueue.add(node.left);
		if(node.right!=null)
			levelOrderTraversalQueue.add(node.right);
		}
		else if(temp instanceof String){
			 str = (String)temp;
			 if(levelOrderTraversalQueue.peek()!=null)
			 	levelOrderTraversalQueue.add("#");
			 System.out.println();
		}
		
		
				
	}
	
	/*
	 //This is print level order, but in the same line
	 Queue<Node> traversalQueue = new LinkedList<Node>();
	traversalQueue.add(root);
	
	while(!traversalQueue.isEmpty()){
		
		Node temp=traversalQueue.remove();
		System.out.println(temp.data);
		if(temp.left!=null)
			traversalQueue.add(temp.left);
		if(temp.right!=null)
			traversalQueue.add(temp.right);
				
	}*/
	
	 
}
 
// ZigZag Traversal

public void ZigZagTraversal(Node root){
		
	Stack<Object> zigzagTraversalStack1 = new Stack<Object>();
	Stack<Object> zigzagTraversalStack2 = new Stack<Object>();
	Node node = null;
	String str;
	Object temp;
	boolean leftRight = true;
	zigzagTraversalStack1.push(root);
	//zigzagTraversalStack.push("#");
	while(!zigzagTraversalStack1.isEmpty() || !zigzagTraversalStack2.isEmpty()){
	while(!zigzagTraversalStack1.isEmpty()){
		temp=zigzagTraversalStack1.pop();
		if(temp instanceof Node){
			 node = (Node)temp;
			 System.out.print(" " + node.data);
			 if(node.right!=null)
					zigzagTraversalStack2.push(node.right);
			 if(node.left!=null)
				 zigzagTraversalStack2.push(node.left);
				
			 }
		}
	System.out.println();
		
		
	
	while(!zigzagTraversalStack2.isEmpty()){
		
		temp=zigzagTraversalStack2.pop();
		
		if(temp instanceof Node){
		 node = (Node)temp;
		 System.out.print(" " + node.data);
		 if(node.left!=null)
			 zigzagTraversalStack1.push(node.left);
			if(node.right!=null)
				zigzagTraversalStack1.push(node.right);
		 }
		
		
		}
	System.out.println();

	}
		
				
	
	
}
//search for BinaryTree

public boolean searchNode(int data){
	isDataFound = false;
	searchNodeRec(root,data);
	return isDataFound;
}

public void searchNodeRec(Node root, int data){
	if(root == null)
		return;
	searchNodeRec(root.left , data);
	searchNodeRec(root.right , data);
	if(root.data == data){
		isDataFound = true;
		return;
	}

}
 //Find Minimum Element BinaryTree

public int findMinimumElementBTree(Node root){
	minimum = root.data;
	findMinimumElementBTreeRec(root);
	return minimum;
}


public void findMinimumElementBTreeRec(Node root){
	
	if(root == null)
		return ;
	
	
	findMinimumElementBTreeRec(root.left);
	findMinimumElementBTreeRec(root.right);
	if(root.data < minimum)
		minimum = root.data;
		return ;
	
}

//Height of the Tree

public int heightOfTree(Node root){
	int height = 0;
	if (root == null)
		 return height;

	Queue<Object> levelOrderTraversalQueue = new LinkedList<Object>();
	Node node = null;
	String str;
	levelOrderTraversalQueue.add(root);
	levelOrderTraversalQueue.add("#");
	
	while(!levelOrderTraversalQueue.isEmpty()){
		
		Object temp=levelOrderTraversalQueue.remove();
		
		if(temp instanceof Node){
		 node = (Node)temp;
		 if(node.left!=null)
			 levelOrderTraversalQueue.add(node.left);
			if(node.right!=null)
				levelOrderTraversalQueue.add(node.right);
		}
		else if(temp instanceof String){
			 str = (String)temp;
			 if(levelOrderTraversalQueue.peek()!=null)
				 levelOrderTraversalQueue.add("#");
			 height++;
		}
	}
		
	return height;	
				
	}

//************************************ BINARY SEARCH TREE ****************************************//

// Creating Binary Search Tree

public void createBinarySearchTree(BinaryTree bsTree){
	bsTree.addNodeBSTree(50);
	bsTree.addNodeBSTree(30);
	bsTree.addNodeBSTree(25);
	bsTree.addNodeBSTree(75);
	bsTree.addNodeBSTree(82);
	bsTree.addNodeBSTree(28);
	bsTree.addNodeBSTree(64);
	bsTree.addNodeBSTree(70);
	bsTree.addNodeBSTree(4);
	bsTree.addNodeBSTree(43);
	bsTree.addNodeBSTree(74);
	bsTree.addNodeBSTree(35);
	
}
public void addNodeBSTree(int data){
	root = addNodeBSTRecursive(root, data);
			
}
public Node addNodeBSTRecursive(Node root, int data){
	if (root == null) {
	root = new Node(data);
	return root;
	}

	if (data < root.data)
		root.left = addNodeBSTRecursive(root.left, data);
	else if (data > root.data)
		root.right = addNodeBSTRecursive(root.right, data);
	return root;
}
// search for BinarySearchTree

public boolean searchBSTNode(int data){
	isDataFound = false;
	searchBSTNodeRec(root,data);
	return isDataFound;
}

public void searchBSTNodeRec(Node root, int data){
	if(root == null)
		return;
	if (data < root.data)
		searchBSTNodeRec(root.left , data);
	else if(data > root.data)
		searchBSTNodeRec(root.right , data);
	else{
		isDataFound = true;
		return;
	}
}
	
	//Find Minimum Element BinarySearchTree

	public int findMinimumElementBSTree(Node root){
	
		if(root == null)
			return 0;
		while(root.left != null)
			root = root.left ;
		
		return root.data;
			
			//findMinimumElementBSTree(root.left);	
	
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bTree = new BinaryTree();
		System.out.println(" ************ Binary Tree *************");
		System.out.println();
		bTree.createBinaryTree(bTree);
		System.out.println("InOrder Traversal");
		bTree.inOrderTraversal(bTree.root);
		System.out.println();
		System.out.println("PreOrder Traversal");
		bTree.preOrderTraversal(bTree.root);
		System.out.println();
		System.out.println("PostOrder Traversal");
		bTree.postOrderTraversal(bTree.root);
		System.out.println();
		System.out.println("Height of Tree = " + bTree.heightOfTree(bTree.root));
		System.out.println();
		System.out.println("LevelOrder Traversal");
		bTree.levelOrderTraversal(bTree.root);
		System.out.println();
		System.out.println();
		System.out.println("ZigZag Order Traversal");
		bTree.ZigZagTraversal(bTree.root);
		System.out.println();
		boolean isFound = bTree.searchNode(14);
		System.out.println("Element 14 found in Binary Tree = "+isFound);
		int minElement = bTree.findMinimumElementBTree(bTree.root);
		System.out.println();
		System.out.println("Minimum Element in Binary Tree= "+minElement);
		System.out.println();
		System.out.println("Delete BTree");
		bTree.deleteBTree(bTree.root);
		
		
		
		//******************************BINARY SEARCH TREE ********************************//
		
		BinaryTree bsTree = new BinaryTree();
		bsTree.createBinarySearchTree(bsTree);
		System.out.println();
		System.out.println(" ************ Binary Search Tree *************");
		System.out.println();
		System.out.println("InOrder Traversal");
		bsTree.inOrderTraversal(bsTree.root);
		System.out.println();
		System.out.println("PreOrder Traversal");
		bsTree.preOrderTraversal(bsTree.root);
		System.out.println();
		System.out.println("PostOrder Traversal");
		bsTree.postOrderTraversal(bsTree.root);
		System.out.println();
		System.out.println("LevelOrder Traversal");
		bsTree.levelOrderTraversal(bsTree.root);
		System.out.println();
		System.out.println();
		System.out.println("ZigZagOrder Traversal");
		bsTree.ZigZagTraversal(bsTree.root);
		System.out.println();
		System.out.println();
		System.out.println("Height of Tree = " + bsTree.heightOfTree(bsTree.root));
		System.out.println();
		isFound = bsTree.searchBSTNode(35);
		System.out.println("Element 35 found in Binary Search Tree = "+isFound);
		System.out.println();
		minElement = bsTree.findMinimumElementBSTree(bsTree.root);
		System.out.println("Minimum Element in Binary Search Tree= "+minElement);

	}

}
