//Kyle Phillips
public class BST<Type extends Comparable<Type>> {
	private TreeNode<Type> root;
	public BST()
	{
		root=null;
		
	}
	public BST(Type obj)
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

	}
	

	
	private void addNode(TreeNode<Type> current, TreeNode<Type> newNode )
	{	

		//current = root;
	
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
			
			
			}//end add
	
	
	
	
	public void InorderTraversal()
	{	if (root != null)
			InOrderTraversalHelper(root);
		else
			System.out.println("List is empty");
	}
	private void InOrderTraversalHelper(TreeNode<Type> current)
	{
			
			if(current!=null)
			{	
				InOrderTraversalHelper(current.getLeft());
				System.out.print(current.getValue()+" ");
				InOrderTraversalHelper(current.getRight());
			}
			
	}
	public void LevelOrderTraversal()
	{	//Done Iteratively
		Queue<TreeNode<Type>> queue=new Queue();
		TreeNode<Type>current;
		current=root;
		if (current==null)
			System.out.println("Tree Empty");
		else
		{ 	System.out.println("Level Order Traversal - Iteratviely");
			queue.enqueue(current);	//initialize to root
			while(!queue.isEmpty())
			{	current=queue.dequeue();
				System.out.print(current.getValue()+" ");
				if(current.getLeft()!=null)
					queue.enqueue(current.getLeft());
				if(current.getRight()!=null)
					queue.enqueue(current.getRight());
				
			}
			System.out.println();
			
		
		}
		
	}
	public void PostorderTraversal()
	{	if (root != null)
			PostOrderTraversalHelper(root);
		else
			System.out.println("List is empty");
	}
	private void PostOrderTraversalHelper(TreeNode<Type> current)
	{
			
			if(current!=null)
			{	
				PostOrderTraversalHelper(current.getLeft());
				PostOrderTraversalHelper(current.getRight());
				System.out.print(current.getValue()+" ");
			}
			
	}
	public void PreorderTraversal()
	{	if (root != null)
			PreOrderTraversalHelper(root);
		else
			System.out.println("List is empty");
	}
	private void PreOrderTraversalHelper(TreeNode<Type> current)
	{
			
			if(current!=null)
			{	System.out.print(current.getValue()+" ");
				PreOrderTraversalHelper(current.getLeft());
				PreOrderTraversalHelper(current.getRight());
				
			}
			
	}
	public boolean findNode(Type obj)
	{	//Add Code Here
		
		if (root ==null) {
			return false;}
		
		else { 
		TreeNode<Type> newNode = new TreeNode <Type>(obj);
		return findNodeHelper(root, newNode);
	
		}
		

	
	}
		private boolean findNodeHelper(TreeNode<Type>current,TreeNode<Type>newNode)
		{	
			
			
		if (current == null) {
			return false;}
		else if (newNode.getValue().equals(current.getValue())) {
			
			return true;}
		
		else if(newNode.getValue().compareTo(current.getValue()) <= 0) {
			
			
			return findNodeHelper(current.getLeft(), newNode);
			
		}
		
		else {
			
			
			return findNodeHelper(current.getRight(), newNode);
		}
		
		
		}
	//	//is current null
		//if (current == null) {
		//	return false;}
		//is current == newNode
		//if (current == newNode) {
		//	return true;}
		//move left
	//	if(newNode <= current ) {
			
		//move right
		//else {
		
		
	//	}

//findparentchild(Type obj)
		
		//if (root == null) SOP the tree is empty
		//else create new node obj
		//find parentchildhelper(root,root,newnode)
		
		
//findparentchildhelper(parent,child,newnode)
		//if child = null sop not in tree
		//else if child == new node
		//sop parent and child
		//else 
		//parent == child
		//if newNode < child
		//findparentchildhelper(parent,child.getleft(), new node
		
		//else findparentchildhelper(parent, child.getright(), newnode)
		
				
	//}
	public void deleteNode(Type obj)
	{	
		if(root!=null)
		{
			TreeNode<Type> parent=root;
			TreeNode<Type> child=root;
			TreeNode<Type> nodeDeleted=new TreeNode<Type>(obj);
			deleteNodeHelper1(parent,child,nodeDeleted);
		}
	}
	private void deleteNodeHelper1(TreeNode<Type>parent,TreeNode<Type>child,TreeNode<Type>nodeDeleted)
	{	//find the node to be deleted and its parent
		//ADD CODE HERE















			

	}//end deleteNodeHelper1
	
	private void deleteNodeHelper2(TreeNode<Type>parent,TreeNode<Type>child)
	{	TreeNode<Type>predecessor=child;
		TreeNode<Type>successor=child;
		//ADD CODE HERE

		//pred=succ=child.getLeft()
		//while (succ.getright() != null)
		//pred = succ;
		//succ = succ.getright()


















			
	}//end deleteNodeHelper2
	
	
}
