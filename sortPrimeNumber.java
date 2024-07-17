package ztgs;

import java.util.ArrayList;
import java.util.List;

public class sortPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,12,13,23,35};
		List<Integer>prime=new ArrayList<>();
		List<Integer>number=new ArrayList<>();
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(methodPrime(arr[i])) {
				System.out.println("Number :"+arr[i]);
				number.add(arr[i]);
			}
			else {
				System.out.println("prime :"+arr[i]);

				prime.add(arr[i]);

			}
		}
		
		print(number,prime);

	}

	private static int[] print(List<Integer> number, List<Integer> prime) {
		// TODO Auto-generated method stub
		int arr[]=new int[prime.size()+number.size()];
		int k=0;
		for(int i=0;i<prime.size()+number.size();i++)
		{
			if(i<prime.size()) {
				arr[i]=prime.get(i);
				System.out.println(arr[i]+"   ");
			}
			else {
				arr[i]=number.get(k++);
				System.out.println(arr[i]+"   ");

			}
		}
		return arr;
		
	}

	private static boolean methodPrime(int j) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 2; i <= 100; i++) {
			{
				if(j>=i &&j%i==0)
					count++;
				else if(j<i)
					break;
				
			}
			if(count==2)
				return true;
		}
		return false;
	}
	
	

}
