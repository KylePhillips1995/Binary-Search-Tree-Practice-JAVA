//Kyle Phillips
public class BST2_Driver_Monmouth {

	public static void main(String[] args) {
	

		String s = "DATASTRUCTURES";
		
		
		BST2<String>listBST2 = new BST2<String>();
		for (int i = 0; i < s.length(); i++) {
			
			listBST2.add("" + s.charAt(i));		
			
			
		}
		
		System.out.println("\nOur Test Word is: " + s);
		
		System.out.println("\nThe Height of the Tree is: " + listBST2.getHeight());
		System.out.println("The internal path length of the tree is: " + listBST2.getInternalPathLength());
		System.out.println("The external path length of the tree is: " + listBST2.getExternalPathLength());
	}	

	
}
