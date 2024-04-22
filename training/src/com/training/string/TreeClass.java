package com.training.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TreeClass {
	static Scanner sc= null;
	public static void main(String [] args) {
		sc = new Scanner(System.in);
		
		Node root=createTree();
		
		System.out.println();
		System.out.println("Inorder: ");
		inOrder(root);
		System.out.println();
		System.out.println();
		System.out.println("PreOrder: ");
		preOrder(root);
		System.out.println();
		System.out.println();
		System.out.println("PostOrder: ");
		postOrder(root);
		System.out.println();
		System.out.println();
		System.out.println("Height: "+ height(root));
		System.out.println();
		System.out.println("Size: "+ size(root));
		System.out.println();
		System.out.println("LevelOrder: ");
		levelOrder(root);
		System.out.println();
	}
	
	static Node createTree()
	{
		Node root=null;
		System.out.println("Enter data: ");
		int data= sc.nextInt();
		
		if(data==-1)return null;
		
		root= new Node(data);
		
		System.out.println("enter data for left of: "+ data);
		root.left=createTree();
		
		System.out.println("Enter data for right of: "+data);
		root.right=createTree();
		
		return root;
	}
	
	static void inOrder(Node root)
	{
		if(root==null)return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root)
	{
		if(root==null)return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root)
	{
		if(root==null)return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	static int height(Node root)
	{
		if(root==null) return 0;
		
		return Math.max(height(root.left), height(root.right))+1;
		
	}
	
	static int size(Node root)
	{
		if(root==null)return 0;
		
		return size(root.left)+size(root.right)+1;
	}
	
	 public static List<List<Integer>> levelOrder(Node root) 
	 {
		 List<List<Integer>> result= new ArrayList<>();
		 if(root==null) {return result;}
		 
		 Queue<Node> q = new LinkedList<>();
		 q.add(root);
		 
		 while(!q.isEmpty())
		 {
			 int size= q.size();
			 List<Integer> level= new ArrayList<>();
			 for(int i=0; i<size;i++) 
			 {
				 Node curr= q.poll();
				 level.add(curr.data);
				 if(curr.left!=null) q.add(curr.left);
				 if(curr.right!=null) q.add(curr.right);
			 }
			 result.add(level);
		 }
		 return result;
	 }
	 
	 public static void balancedAVL(Node root) 
	 {
		 if(root==null)return;
		 {
			 int h1=height(root.left);
			 int h2=height(root.right);
			 
			 int check=h1-h2;
			 boolean flag=true;
			 if(Math.abs(check)>2) 
			 {
				 flag=true;
			 }
			 else 
			 {
				 flag=false;
			 }
		 }
	 }
	 
	 //LL RR RL LR
	 
	 public static void leftRotation() {}
	 public static void rightRotation() {}
	 
}

class Node
{
	Node left, right;
	int data;
	
	public Node(int data)
	{
		this.data=data;
	}
}
