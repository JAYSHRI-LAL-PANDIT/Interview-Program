public class MissingNumberInArrayThirdMethod {
    public static int missingNumber(int[] arr, int N){
        int total=1;
        for(int i=2; i<=(N+1); i++){
            total+=i;
            total-=arr[i-2];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,4,3};
        System.out.println(missingNumber(arr, arr.length));
    }
}
