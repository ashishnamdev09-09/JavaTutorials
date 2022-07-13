package basics;
import java.util.*;

public class demo {
	
		static int[] minmax(int arr[]) {
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		int result[] = new int[2];
		result[0]=max;
		result[1]=min;
		return  result;
	}
	
	
	public static void main(String[] args)
	{
		int arr[][]= {{1,2,3,4,5},
				{54,13,1314,14,9},
				{124,1313,515,134,765},
				{9,8,7,6,1}};
		int max=0,min=0;
				
	for(int i=0;i<arr.length;i++) {
		int temp[]=minmax(arr[i]);
			min+=temp[1];
			max+=temp[0];
	}
	System.out.println("Max "+max);
	System.out.println("Min "+min);
		
			
			
		
		
		
		
		
	}

}
