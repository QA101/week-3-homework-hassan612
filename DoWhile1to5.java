
public class DoWhile1to5 {
	public static void main(String[] args){
		
		 //program to print first 10 numbers
		int i = 1;
		do{
			System.out.println(i);
			i++;	
			
		}
		while(i <= 10);			
			
		System.out.println();
		System.out.println();	
		//print first 5 Even numbers.
		int j = 2;
		do{
			System.out.println(j);
			j = j+2;
		}
		while(j <= 10);
		
		System.out.println();
		System.out.println();	
		//print first 5 odd numbers
		int k = 1;
		do{
			System.out.println(k);
			k = k+2;
		}
		while(k <= 10);
		
		System.out.println();
		System.out.println();	
		//first 10 square numbers.
		//first 10 cube numbers.
		int number = 1;
		int square = 1;
		int cube = 1;
		int count = 0;

		System.out.println("Number\tSquare\tCube");

		do {		
			square = number * number;
			cube = number * square;
			System.out.println(number + "\t" + square + "\t" + cube);
			count++;
			number++;
		}
			while (number <= 10);
		
		System.out.println();
		System.out.println();	
		
	}

}
