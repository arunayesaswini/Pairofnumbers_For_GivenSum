package com.practice.lab3_2;

import java.util.ArrayList;

public class PairSum extends BinarySearchTree {

	BinarySearchTree bst = new BinarySearchTree();
	int sum;

	// inserting values to binary search tree
	public void insert(int value) {
		bst.insertBst(value);
	}

	public void findPair(int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Numbers entered are: ");
		list = bst.getList();
		System.out.println(list);

		int flag = 0;
		for (int i = 0; i < list.size(); i++) {
			int num1 = list.get(i);
			int num2 = sum - num1;
			if (list.contains(num2)) {
				System.out.println("Found the pair");
				System.out.println("pair: " + num1 + "," + num2);
				flag = 1;
				break;
			}

		}
		if (flag == 0)
			System.out.println("Pair not found in the given numbers");
	}

}
