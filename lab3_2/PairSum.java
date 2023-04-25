package com.practice.lab3_2;

import java.util.ArrayList;

public class PairSum {
	BinarySearchTree bst = new BinarySearchTree();
	ArrayList<Integer> numberList=new ArrayList<Integer>();
	int sum;
	PairSum()
	{}
	
	PairSum(int sum) {
		this.sum = sum;
		numberList=bst.getList();
	}
		
	
	
	
	public void display()
	{
		System.out.println("numberList in PairSum:");
		
		System.out.println(numberList);
	}

	public void findPair() {
		int flag = 0;
		
		for(int i=0;i<numberList.size();i++) {
			int num1 = numberList.get(i);
			int num2 = sum - num1;
			if (numberList.contains(num2)) {
				System.out.println("Found the pair");
				System.out.println("pair: " + num1 + "," + num2);
				flag = 1;
				break;
			}
			i++;
		}
		if (flag == 0)
			System.out.println("Pair not found in the given numbers");
	}

}
