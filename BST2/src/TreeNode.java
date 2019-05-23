//Kyle Phillips
public class TreeNode<Type> {
	private Type value;
	private TreeNode<Type>left;
	private TreeNode<Type>right;
	public TreeNode(Type initValue,TreeNode<Type>initLeft,TreeNode<Type>initRight)
	{	
		value=initValue;
		left=initLeft;
		right=initRight;
	}
	public TreeNode(Type initValue)
	{
		value=initValue;
		left=null;
		right=null;
	}

	public Type getValue()
	{
		return value;
	}
	public TreeNode<Type> getLeft()
	{
		return left;
	}
	public TreeNode<Type> getRight()
	{
		return right;
	}
	public void setLeft(TreeNode<Type> theNewLeft)
	{
		left=theNewLeft;
	}
	public void setRight(TreeNode<Type> theNewRight)
	{
		right=theNewRight;
	}
	public void setValue(Type theNewValue)
	{
		value=theNewValue;
	}
}
