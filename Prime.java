package ztgs;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {10, 15, 7, 20, 25, 3};
	        bubbleSortByPrimeDifference(arr);

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	}

		    public static boolean isPrime(int n) {
		        if (n <= 1) return false;
		        if (n == 2) return true;
		        if (n % 2 == 0) return false;
		        for (int i = 3; i <= Math.sqrt(n); i += 2) {
		            if (n % i == 0) return false;
		        }
		        return true;
		    }

		    public static int nearestPrime(int n) {
		        if (n <= 2) return 2;
		        int lowerPrime = n, upperPrime = n;

		        while (lowerPrime > 2 && !isPrime(lowerPrime)) {
		            lowerPrime--;
		        }

		        while (!isPrime(upperPrime)) {
		            upperPrime++;
		        }

		        if (Math.abs(n - lowerPrime) <= Math.abs(n - upperPrime)) {
		            return lowerPrime;
		        } else {
		            return upperPrime;
		        }
		    }

		    public static int primeDifference(int n) {
		        return Math.abs(n - nearestPrime(n));
		    }

		    public static void bubbleSortByPrimeDifference(int[] arr) {
		        int n = arr.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (primeDifference(arr[j]) > primeDifference(arr[j + 1])) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
		    }

	
		

	

}
