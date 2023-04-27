package com.practice.lab3_2;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {

		PairSum pair_sum = new PairSum();

		int value;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of nodes");
			int size = sc.nextInt();

			for (int i = 1; i <= size; i++) {
				System.out.println("Enter Data for the node");
				value = sc.nextInt();
				pair_sum.insert(value);
			}

			// finding pair for the given sum
			System.out.println("Enter Sum to Search");
			int sum = sc.nextInt();

			pair_sum.findPair(sum);

		}
	}

}
