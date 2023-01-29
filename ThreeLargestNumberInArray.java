
public class ThreeLargestNumberInArray {
    public static void checkThreeLargestElement(int[] arr, int arr_size){
        int i,first,second,third;
        if(arr_size<3){
            System.out.println("Invalid Input.");
            return;
        }
        third=second=first=Integer.MIN_VALUE;
        for(i=0; i<arr_size; i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println("Three Largest Elements are : "+first+" "+second+" "+third);
    }
    public static void main(String[] args) {
        int[] arr={2,5,3,8,1};
        int n=arr.length;
        checkThreeLargestElement(arr, n);
    }
}
