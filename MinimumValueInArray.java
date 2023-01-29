public class MinimumValueInArray {
    public static int isMinimum(int []arr)
    {
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                 min=arr[i];
            }
        }
        return min;
    }
    public static void main(String []args)
    {
        int arr[]={1,2,4,4,1};
        System.out.println("Minimum value in array is :"+isMinimum(arr));
    }
}
