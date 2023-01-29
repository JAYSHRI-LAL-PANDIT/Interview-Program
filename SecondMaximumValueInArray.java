public class SecondMaximumValueInArray {
    public static int ischeck(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max)
            {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String []args)
    {
        int []arr= new int []{1,2,3,4,5};
        System.out.println("Second Maximum Number is :"+ischeck(arr));
    }
}
