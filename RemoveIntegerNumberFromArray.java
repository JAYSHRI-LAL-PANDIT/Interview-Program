public class RemoveIntegerNumberFromArray {
    public static int[] isRemove(int []arr)
    {
        int countOdd=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                countOdd++;
            }
        }
        int []result= new int[countOdd];
        int idx=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                result[idx]=arr[i];
                idx++;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5}; 
        int []result=RemoveIntegerNumberFromArray.isRemove(arr);
        for(int i=0; i<result.length; i++)
        {
            System.out.println(result[i]+" ");
        }
    }
    
}
