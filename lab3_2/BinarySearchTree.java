package com.practice.lab3_2;


import java.util.ArrayList;

public class BinarySearchTree 
{
	 ArrayList<Integer> numbers=new ArrayList<Integer>();
			
	//inserting elements or values into Binary Search Tree
	
	public void insertNode(Node root,Node newNode)
	{
		if(newNode.data<root.data)
		{
			if(root.left==null)
				root.left=newNode;
			else
				insertNode(root.left,newNode);
		}
		else
		{
			if(root.right==null)
				root.right=newNode;
			else
				insertNode(root.right,newNode);
		}
	}
	
	// searching the pair to satisfy the given sum
	
	public void inOrder(Node root)
	{
			
		if(root!=null)
		{
			inOrder(root.left);
			numbers.add(root.data);
			inOrder(root.right);		
		}
		else
			return;
		
	}
	public void display()
	{
		System.out.println(numbers);
	}
	public ArrayList<Integer> getList()
	{
		return numbers;
	}
	
	
}
