import java.util.Scanner;

public class two {
	public static void main(String args[]) {
		int n,a[],min,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
				max=a[i];
		}
		min=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<=min)
				min=a[i];
		}
		System.out.println("Max element in the given array is "+max);
		System.out.println("Min element in the given array is "+min);
		sc.close();
	}
	

}