package com.practice.lab3_2;

import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearchTree {
	Scanner sc = new Scanner(System.in);
	public ArrayList<Integer> numbers = new ArrayList<Integer>();
	Node root = null;

	// create node
	public void insertBst(int value) {
		Node newNode = new Node(value);
		if (root == null)
			root = newNode;
		else
			insertNode(root, newNode);
	}

	// inserting elements or values into Binary Search Tree

	public void insertNode(Node root, Node newNode) {

		if (newNode.data < root.data) {
			if (root.left == null)
				root.left = newNode;
			else
				insertNode(root.left, newNode);
		} else if (newNode.data > root.data) {
			if (root.right == null)
				root.right = newNode;
			else
				insertNode(root.right, newNode);
		} else {
			System.out.println("Number already present....\n Enter new Number");
			int value = sc.nextInt();
			insertBst(value);
		}
	}

	// in order traversal and adding the elements to ArrayList
	public void inOrder(Node root) {

		if (root != null) {
			inOrder(root.left);
			numbers.add(root.data);
			inOrder(root.right);
		}

	}

	public ArrayList<Integer> getList() {
		inOrder(root);
		return numbers;
	}

}
