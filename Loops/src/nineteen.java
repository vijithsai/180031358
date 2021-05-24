import java.util.*;
public class nten {
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);        
	        int N=sc.nextInt();
	        for (int num = 0; num < N; num++)
	        {    
	           
	            if (num % 3 == 0 && num % 5 == 0)
	                System.out.print(num + " ");
	        }
	    }
}