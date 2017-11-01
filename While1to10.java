
public class While1to10 {
	public static void main(String[] args) {
		
		  // print first 10 number
		int count = 0; 
		int i = 1;
		while (count < 10) {
		  System.out.println(i); 
		  count++;
	 		 i++;
	}
		 System.out.println(); 
		 System.out.println(); 
		  
		  // print first 5 even number 
		  int count1 = 0; 
		 int j = 1; 
		 while (count1 < 5) {
		  if (j % 2 == 0) { 
		  System.out.println(j);
		  count1++;
			  } 
		 j++; 
		  }
		  System.out.println();
		  System.out.println();
		  
		  // print first 5 odd number
		  int count2 = 0; 
		 int k = 1;
		  while (count2 < 5) {
		  if (k % 2 != 0) { 
			  System.out.println(k);
			  count2++;
			  } 
		  k++; 
			  }    
		 
		System.out.println();
		System.out.println();
		// first 10 square numbers
		// first 10 cube numbers
		int number = 1;
		int square = 1;
		int cube = 1;
		int count3 = 0;

		System.out.println("Number\tSquare\tCube");

		while (number <= 10) {

			square = number * number;
			cube = number * square;
			System.out.println(number + "\t" + square + "\t" + cube);
			count3++;
			number++;
		}  
	}

}
