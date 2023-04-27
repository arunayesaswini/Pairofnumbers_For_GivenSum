package com.practice.lab3_2;

import java.util.Scanner;
import java.util.ArrayList;
public class MainDriver {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		ArrayList<Integer> list=new ArrayList<Integer>();
		PairSum pair_sum;
		Node root = null;
		Node nn = null;
		int value;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Pls enter number of nodes");
			int size = sc.nextInt();
			int i;
			for (i = 1; i <= size; i++) {
				System.out.println("Enter Data for the node");
				value = sc.nextInt();
				nn = new Node(value);
				if (root == null)
					root = nn;
				else
					bst.insertNode(root, nn);
			}

			bst.inOrder(root);
			System.out.println("numbers in binary search tree");
			list=bst.getList();
			System.out.println(list);
			
			pair_sum=new PairSum();
			pair_sum.display();
			
			
			System.out.println("Enter Sum to Search");
			int sum = sc.nextInt();
			pair_sum = new PairSum(sum);
			pair_sum.findPair();	
			

		}
	}

}
