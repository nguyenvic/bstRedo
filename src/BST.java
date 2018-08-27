//didnt finish. only used as refresher.
public class BST {
	private static class Node
	{
		private int data;
		Node leftChild;
		Node rightChild;
		
		Node(int data)
		{
			this.data = data;
			leftChild = null;
			rightChild = null;
		}
	}
	
	Node root;
	
	BST()
	{
		root = null;
	}
	
	public void insert(int data) //inserts new data into the BST
	{
		if (root == null)
		{
			root = new Node(data); //if tree is empty, value is the root
		}
		else
		{
			insertNode(root, data);
		}
	}
	
	public void insertNode(Node treeNode, int data)   //private helper function for insert. recursively inserts a value into the bst
	{
		if (data < treeNode.data)
		{
			if (treeNode.leftChild == null) //if left child is empty
			{
				treeNode.leftChild = new Node(data);
			}
			else
			{
				insertNode(treeNode.leftChild, data);
			}
		}
		else if (data > treeNode.data)
		{
			if (treeNode.rightChild == null)
			{
				treeNode.rightChild = new Node(data);
			}
			else
			{
				insertNode(treeNode.rightChild, data);
			}
		}
		
	}
	
	public void inOrderPrint()
	{
		inOrderPrint(root);
	}
	
	public void inOrderPrint(Node treeNode)
	{
		if (treeNode != null)
		{
			inOrderPrint(treeNode.leftChild);
			System.out.printf("%d ", treeNode.data);
			inOrderPrint(treeNode.rightChild);
		}
	}
}
