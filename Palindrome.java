//1 method
package Java;

import java.util.*;

public class All {
	
	public static void main(String args[]){
		
		
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int rev[] = new int[n];
       
        
        for(int i = 0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        for(int j = 0;j<n;j++)
        {
        	rev[j] = arr[n-j-1];
        }
        if(Arrays.equals(arr, rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}


//2 method

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
       
        
        for(int i = 0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        int start = 0;
        int end = arr.length-1;
        boolean is = true;
        
        while(start < end)
        {
            if(arr[start] == arr[end])
            {
                start++;
                end--;
            }
            else
            {
                is = false;
                break;
            }
            
                
        }
        
        if(is)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
