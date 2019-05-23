//Kyle Phillips
public class BST_Driver_Monmouth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST<String>listBST=new BST<String>();
		listBST.add("Dennis");
		listBST.add("Nick");
		listBST.add("Jeff");
		listBST.add("Brianna");
		listBST.add("Trisha");
		listBST.add("Matt");
		listBST.add("Dan");
		listBST.add("Jess");
		listBST.add("Todd");
		listBST.add("Mike");
		listBST.add("Kyle");
		listBST.add("Martin");
		listBST.add("Lee");
		listBST.add("Colin");
		listBST.add("Raul");
		listBST.add("Sabina");
		listBST.add("Ailan");
		listBST.add("Dennis");
		listBST.LevelOrderTraversal();
		System.out.println("\nInOrder Traversal");
		listBST.InorderTraversal();
		System.out.println("\nPreOrder Traversal");
		listBST.PreorderTraversal();
		System.out.println("\nPostOrder Traversal");
		listBST.PostorderTraversal();
		
	}

}
