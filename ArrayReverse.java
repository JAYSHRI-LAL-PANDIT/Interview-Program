public class ArrayReverse {
    public static int[] reverseArray(int []arr, int first, int end)
    {
        int temp;
        while(first<=end)
        {
            temp=arr[first];
            arr[first]=arr[end];
            arr[end]=temp;
            first++;
            end--;
        }
        return arr;
    }
    public static void main(String args[])
    {
        int arr[]=new int []{1,2,3,4,5};
        int result[]=reverseArray(arr, 0, arr.length-1);
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]+" ");
        }
    }
}
