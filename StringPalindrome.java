public class StringPalindrome {
    public static boolean isPalindrome(String str){
        char []arr=str.toCharArray();
        int start;
        int end=arr.length-1;
        for(start=0; start<=end; start++){
            if(arr[start]!=arr[end])
               return false;
            end--;   
        }
        return true;
    }
    public static void main(String[] args) {
        String str="madm";
        if(isPalindrome(str))
           System.out.println("String is palindrome number.");
        else
           System.out.println("String is not palindrome number.");   
    }
}
