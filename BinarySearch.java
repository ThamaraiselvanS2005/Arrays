package Arrays;

import java.util.*;
class Oper{
    public int search(int a[],int key)
    {
        int l = 0;
        int h = a.length-1;
        int mid = 0;
        while(l<=h){
            mid  = (l+h)/2;
            if(key == a[mid])
            {
                return mid;
            }
            else if (key < a[mid])
            {
                h = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        return -1;
    }
}


public class BinarySearch {
    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int key = 7;
        Arrays.sort(a);
        Oper obj = new Oper();
        int result = obj.search(a,key);
        System.out.println("elment founde at index"+result);

    }
}
