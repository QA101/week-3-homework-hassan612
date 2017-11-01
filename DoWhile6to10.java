import java.util.Scanner;

public class DoWhile6to10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// print sum of first 5 numbers
		int sum = 0, i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 5);
		System.out.println(sum);

		System.out.println();
		System.out.println();
		// sum of a number and take input from the user
		double x, sum2 = 0;
		System.out.println("Enter numbers you like to add and input -1 when done:");

		do {
			x = s.nextDouble();
			sum2 += x;

		} while (x != -1);
		System.out.println("Sum is " + sum2);

		System.out.println();
		System.out.println();
		// product of a number and take input from the user

		float num1, num2, prod = 1, y = 1;
		System.out.println("Enter the numbers of product: ");
		num1 = s.nextFloat();
		System.out.println("Enter the numbers: ");
		do {
			num2 = s.nextFloat();
			prod *= num2;
			y++;
		} while (y <= num1);
		System.out.println(prod);
		
		System.out.println();
		System.out.println();
		//reverse a number and take input from the user
		
		int input = 0, rev = 0;

		System.out.println("Enter the number: ");
		input = s.nextInt();
		 do{
			rev = rev * 10 + input % 10;
			input = input / 10;
		}while (input != 0);
		System.out.println(rev);
		
		System.out.println();
		System.out.println();
		//sum of first 5 even numbers
		
		int sum3 = 0, j = 2; 
		do {
			sum3 = sum3 + j;	
			j= j+2;		
			}while (j <= 10);
			
		System.out.println("Sum of first 5 even numbers is: " + sum3); 

	}

}
