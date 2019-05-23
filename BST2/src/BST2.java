//Kyle Phillips
public class BST2<Type extends Comparable<Type>> {
	private TreeNode<Type> root;
	public int nodeHeight = 0;
	public int maxHeight = 0;
	public int NodeCounter = 0;
	public BST2()
	{
		root=null;
		
	}
	public BST2(Type obj)
	{
		root=new TreeNode<Type>(obj);
	}
	
	
	public void add(Type obj)
	{
	
		TreeNode<Type> node = new TreeNode<Type>(obj);
		
		
		if (root == null) {
			root = node;
			}
		
		else { 
			addNode(root, node);
			}

	}//ends add obj
	

	
	private void addNode(TreeNode<Type> current, TreeNode<Type> newNode )
	{	
	
			if (newNode.getValue().compareTo(current.getValue()) < 0) {
				
			if(current.getLeft() == null) {
				current.setLeft(newNode);
				
			}
			
			else {
				addNode(current.getLeft(), newNode);
			}
		}
		
		else {
			//if (newNode.getValue().compareTo(current.getValue()) > 0) {
			if(current.getRight() == null) {
				current.setRight(newNode);
			}
			
			else {
				addNode(current.getRight(), newNode);
			}
		}
			
			
			}//ends add
	
	public void LevelOrderTraversal()
	{	//Done Iteratively
		Queue<TreeNode<Type>> queue=new Queue();
		TreeNode<Type>current;
		current=root;
		if (current==null)
			System.out.println("Tree Empty");
		else
		{ 	
			queue.enqueue(current);	//initialize to root
			while(!queue.isEmpty())
			{	current=queue.dequeue();
				System.out.print(current.getValue()+" ");
				if(current.getLeft()!=null)
					queue.enqueue(current.getLeft());
				if(current.getRight()!=null)
					queue.enqueue(current.getRight());
				
			}
			
			
		
		}
		
	}//ends LevelOrderTraversal
	
	//Get the height of the BST
	public int getHeight() {
		
			if(root != null) {
			return getHeightHelper(root);
			
		}
		else {
			
			return 0;
		}
		
}
	//Helps Recursively. 
	public int getHeightHelper(TreeNode<Type> current) {
		
			if (current != null) {
			
			if(current.getLeft() != null) {
				nodeHeight++;
				if(nodeHeight < maxHeight) {
					maxHeight = nodeHeight;
				}
				
				getHeightHelper(current.getLeft());
				nodeHeight--;
			}
			
			if(current.getRight() != null) {
				nodeHeight++;
				
				if(nodeHeight > maxHeight) {
					maxHeight = nodeHeight;
				}
				
				getHeightHelper(current.getRight());
				nodeHeight--;
			}
			
			
		}
		return maxHeight + 1;
	}

	//Gets the Internal Path Length
	public int getInternalPathLength() {
		
		if(root != null) {
		return getInternalPathLengthHelper(root);
		
	}
	else {
		
		return 0;
	}
		
	}
	
	
	public int getInternalPathLengthHelper(TreeNode<Type> current) {

		if(current.getLeft() != null) {
			nodeHeight++;
			NodeCounter = NodeCounter + nodeHeight;
			current = current.getLeft();
			
			getInternalPathLengthHelper(current);
			
		}
		
		
		if(current.getRight() != null) {
			nodeHeight++;
			NodeCounter = NodeCounter + nodeHeight;
			current = current.getRight();
			getInternalPathLengthHelper(current);
		}
		
		return NodeCounter + 1;
		
	}	
	//Gets the External PathLength
	public int getExternalPathLength() {
		
		
		if(root != null) {
			return getExternalPathLengthHelper(root);
			
		}
		else {
			
			return 0;
		}
		
	}
	
	public int getExternalPathLengthHelper(TreeNode<Type> current) {
		
		
		if(current.getLeft() != null) {
			
			current = current.getLeft();
			getExternalPathLengthHelper(current);
			nodeHeight++;
		}
		
		else if(current.getRight() != null) {
			
			
			current = current.getRight();
			getExternalPathLengthHelper(current);
			nodeHeight++;
			
		}
		
		else {
			
			NodeCounter = NodeCounter + nodeHeight;
			
		}
		return NodeCounter;
		
		
		
	}
	}
	
	
		
		

//Our Test Word is: DATASTRUCTURES
//
//The Height of the Tree is: 5
//The internal path length of the tree is: 16
//The external path length of the tree is: 20

		
		
		

		


