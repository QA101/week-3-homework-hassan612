
public class Arrays {
 public static void main(String[] args) {
	 
	int[] a = {2, 5, 8, 14, 7, 24};
	 int max = a[0];
	 int min = a[0];


	 for (int i = 1; i < a.length; i++) {
		  
		 if(a[i] > max)
		 		 max = a[i];
				 
	 }
	 			System.out.println("max =" + max); 
			
		
	for (int i = 0; i < a.length; i++) {
		if(a[i] < min)
		
		min = a[i];
	}
	System.out.println("minum =" + min);
	
 }
}
	
	 	 
	 
 


