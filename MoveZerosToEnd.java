public class MoveZerosToEnd {
    public static  int[] moveZero(int arr[]){
      int temp,j=0;
      for(int i=0; i<arr.length; i++){
        if(arr[i]!=0 && arr[j]==0)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        if(arr[j]!=0){
            j++;
        }
      } 
      return arr;
    }
    public static void main(String args[]){
        int arr[]={0,4,0,2,0,5,7};
        int result[]=moveZero(arr);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
