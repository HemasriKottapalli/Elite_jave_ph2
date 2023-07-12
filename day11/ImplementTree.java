package com.day11;
class BinaryTree{
	Node root;
	class Node{
		int data;
		Node left,right;
		//node constructor
		public Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
		
	}
	//binarytree constructor
	public BinaryTree(int d)
	{
		root=new Node(d);
	}
	public void insertLeft(Node r, int val)
	{
		Node newNode = new Node(val);
		r.left=newNode;
	}
	public void insertRight(Node r, int val)
	{
		Node newNode = new Node(val);
		r.right=newNode;
	}
	public static void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void inOrder(Node root)
	{
		if(root!=null)
		{
			preOrder(root.left);
			System.out.print(root.data+" ");
			preOrder(root.right);
		}
	}
	public static void postOrder(Node root)
	{
		if(root!=null)
		{
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
public class ImplementTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(10);
		tree.insertLeft(tree.root,5);
		tree.insertRight(tree.root,8);
		tree.insertRight(tree.root.left,3);
		tree.insertRight(tree.root.right,2);
		tree.insertRight(tree.root.left,1);
		System.out.println("Pre Order : ");
		BinaryTree.preOrder(tree.root);
		System.out.println();
		System.out.println("In Order: ");
		BinaryTree.inOrder(tree.root);
		System.out.println();
		System.out.println("Post Order : ");
		BinaryTree.postOrder(tree.root);
	}

}