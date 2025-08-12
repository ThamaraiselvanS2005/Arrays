class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i < n){
            int correctIndex = arr[i];
            if(arr[i] < n && arr[i] != arr[correctIndex])
            {
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int ind = 0; ind < arr.length;ind++)
        {
            if(arr[ind] != ind +1){
                return ind +1;
            }
        }
        return arr.length;
    }

    public void swap(int[] arr,int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
