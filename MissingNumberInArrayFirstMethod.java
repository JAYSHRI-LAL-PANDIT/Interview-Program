public class MissingNumberInArrayFirstMethod {
    public static int isMissing(int arr[])
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
            sum=sum-arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]=new int[]{2,4,3,5,6,1};
        System.out.println("Mising number in Array is :"+isMissing(arr));
    }
}
