import java.util.Scanner;

//Write a program which takes as input 2D- array and finds maximum number , it's
//index value
//Write a program which takes as input 2D- array and finds minimum number, it's
//index value.
public class Arrays2D {
	public static void main(String[] args) {

		int a[][] = { { 9, 3, 13, 5, 54 }, { 91, 5, 7, 22, 38 } };
		int max = a[0][0];
		int min = a[0][0];
		int maxRow = 0;
		int maxColumn = 0;
		int minRow = 0;
		int minColumn = 0;

		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {

				if (a[i][k] > max) {
					max = a[i][k];
					maxRow = i;
					maxColumn = k;
				}

				if (a[i][k] < min) {
					min = a[i][k];
					minRow = i;
					minColumn = k;
				}
			}
		}

		System.out.println("max = " + max);
		System.out.println("max index = " + maxRow + "," + maxColumn);
		System.out.println("min = " + min);
		System.out.println("max index = " + minRow + "," + minColumn);
	}
}
