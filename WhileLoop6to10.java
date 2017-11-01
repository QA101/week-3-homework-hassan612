import java.util.Scanner;

public class WhileLoop6to10 {

	public static void main(String[] args) {
		// Write a java program to print sum of first 5 numbers
	Scanner s = new Scanner(System.in);
		int i = 1, count = 5, sum = 0;

		while (i <= count) {
			sum += i;
			i++;
		}

		System.out.println(sum);

		System.out.println();
		System.out.println();
		// to find sum of a number and take input from the user

		int num, sum1 = 0, k = 0;
		System.out.println("Enter the numbers: ");

		while (k < 5) {
			num = s.nextInt();
			sum1 += num;
			k++;
		}
		System.out.println("Sum is: " + sum1);

		System.out.println();
		System.out.println();
		// find product of a number and take input from the user.

		int num1, num2, prod = 1, x = 1;
		System.out.println("Enter the numbers of product: ");
		num1 = s.nextInt();
		System.out.println("Enter the numbers: ");

		while (x <= num1) {
			num2 = s.nextInt();
			prod *= num2;
			x++;
		}
		System.out.println(prod);

		System.out.println();
		System.out.println();

		// find reverse a number and take input from the user.

		int input = 0, rev = 0;

		System.out.println("Enter the number: ");
		input = s.nextInt();
		while (input != 0) {
			rev = rev * 10 + input % 10;
			input = input / 10;
		}
		System.out.println(rev);

		System.out.println();
		System.out.println();
		//find sum of first 5 even numbers
		
		int sum3 = 0, y = 2;
		while (y <= 10) {
			
			if(y % 2 == 0) {
				sum3 = sum3 + y;	
				
			}
			y++;			
		}
		System.out.println("Sum of first 5 even numbers is: " + sum3); 
	}

}
