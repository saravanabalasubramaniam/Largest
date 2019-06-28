import java.io.*;
import java.util.*;
class Largest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int arr[]=new int[a];
		int count=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=input.nextInt();
		}
		int temp;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=	arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]);
		}
	}	
}
