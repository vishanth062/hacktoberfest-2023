SAP
1)
/*Given an array of integers, sort the first half of the array in ascending order and second half in descending order.

Examples: 

Input : arr[] = {5, 2, 4, 7, 9, 3, 1, 6, 8}
Output : arr[] = {2 4 5 7 9 8 6 3 1  }

Input : arr[] =  {1,100,2,3,50,2,1000}
Output : arr[] = {1 100 2 3 1000 50 2  }

solution :*/


import java.util.*;
public class Main
{
    public static void sortt(int a[],int n){
       int mid=n/2;
       
       Arrays.sort(a,0,mid-1);
       Arrays.sort(a,mid+1,n);
       int f=0;
       for(int i=mid+1;i<(mid+1+n)/2;i++,f++){
          int temp=a[i];
          a[i]=a[n-1-f];
          a[n-1-f]=temp;
            
       }
       
    }
	public static void main(String[] args) {
	    int []a= {5, 2, 4, 7, 9, 3, 1, 6, 8};
	    sortt(a,a.length);
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
		
	}
}































