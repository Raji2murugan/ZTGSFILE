package ztgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortAscending {
	public static void main(String[] args) {
		// int arr[]= {13,2,4,15,12,10,5};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		List<Integer> oddPositions = new ArrayList<>();
		List<Integer> evenPositions = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				evenPositions.add(arr[i]);
			} else {
				oddPositions.add(arr[i]);
			}
		}

		Collections.sort(oddPositions);
		Collections.sort(evenPositions);

		int oddIndex = 0, evenIndex = evenPositions.size() - 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = evenPositions.get(evenIndex--);
			} else {
				arr[i] = oddPositions.get(oddIndex++);
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
