public class ResizeArray {
    public static int[] resize(int []arr, int capacity)
    {
         int temp[]=new int [capacity];
         for(int i=0; i<arr.length; i++)
         {
            temp[i]=arr[i];
         }
         return temp;
    }
    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5};
        int result[]=ResizeArray.resize(arr, 8);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
