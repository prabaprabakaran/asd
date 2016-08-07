import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m;
		System.out.println("Enter size of array");
		m=s.nextInt();
		int[] arr=new int[m];
		System.out.println("Enter elements");
		for(int i=0;i<m;i++)
		{
			arr[i]=s.nextInt();
		}
		int sum=0;
		int sum1=0;
		int a=0;
		int b=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=Math.abs(arr[i]+arr[j]);
				if(i==0 && j==1)
				{
					sum1=sum;
					a=arr[i];
					b=arr[j];
					
				}
				if(sum<sum1)
				{
					sum1=sum;
					a=arr[i];
					b=arr[j];
				}
				
				
			}
			
		}
		System.out.println("the two elements whose sum is nearest to zero : "+a+" "+b);
	}

}
