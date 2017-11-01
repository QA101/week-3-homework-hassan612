
//Write a program which takes as input 1D- array and reverse an array.


public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 5, 89, 34, 72, 1, 66 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println();
		// Write a program which takes as input two 1D- array and find the sum of two
		// array and store results in new array.
		int b[] = { 2, 4, 3, 7, 19, 32 };
		int c[] = { 6, 2, 43, 89, 12, 66 };
		int d[] = new int[c.length];
		int e[] = new int[c.length];

		for (int i = 0; i < c.length; i++) {
			d[i] = b[i] + c[i];
			System.out.println(d[i]);

		}

		System.out.println();
		System.out.println();
		for (int i = 0; i < c.length; i++) {

			// Write a program which takes as input two 1D- array and find the difference of
			// +two array and store results in new array.
			e[i] = b[i] - c[i];
			System.out.println(e[i]);
		}
	}

}
