
public class MyBinaryTree {
	
	//Attributes
	
	private int numInTree;
	private StudentInfo root;
	
	//Constructors
	public MyBinaryTree () {
		root = null;
		numInTree = 0;
	}
	
	//Methods
	
	void addToTree (StudentInfo targetNode, StudentInfo itemToAdd) {
		if (numInTree == 0) { //If there is no root then itemToAdd becomes root
			root = itemToAdd;
		}
		
		else { //Set the root as the node we will start with as we traverse the tree
			 targetNode = root;
		}
		
		StudentInfo parentNode;
		
		while (true) {
			parentNode = targetNode;
			
			if (studentNumber < targetNode.studentNumber) {
				targetNode = targetNode.setLeft()
			}
		}
	}
	
	void inOrder (StudentInfo targetNode) {
		
	}
	
	void preOrder (StudentInfo targetNode) {
		
	}
	
	void postOrder (StudentInfo targetNode) {
		
	}
	
	
}
