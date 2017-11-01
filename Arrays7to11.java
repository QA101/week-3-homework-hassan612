

public class Arrays7to11 {
	public static void main(String[] args) {
		//Write a program which takes as input 1D- array and prints even numbers in the
		//array.
		int a[] = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even: " + a[i]);

			}

		}
		//Write a program which takes as input 1D- array and prints odd numbers in the
		//array.
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {

				System.out.println("Odd: " + a[i]);
			}
		}
		//Write a program which takes as input 1D- array and prints positive numbers in
		//the array.
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {

				System.out.println("Positive: " + a[i]);
			}
		}
		//Write a program which takes as input 1D- array and prints negative numbers
		//in the array.

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {

				System.out.println("Negative: " + a[i]);
			}

		}
		System.out.println();
		System.out.println();
//Write a program which takes as input 1D- array which contains first 25
//numbers and prints prime numbers in the array.
		System.out.println("First 25 prime numbers");
		
		int primeNumbers = 0;
		for (int i = 2; i < Integer.MAX_VALUE; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(i);
				primeNumbers++;
				if (primeNumbers == 25) {
					break;
				}

			}

		}
	}
}