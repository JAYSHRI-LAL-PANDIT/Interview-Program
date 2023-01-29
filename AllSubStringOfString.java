import java.util.Scanner;
public class AllSubStringOfString {
    public static void main(String[] args) {
        String str,sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        str =sc.nextLine();
        int length=str.length();

        for(int i=0; i<length; i++)
        {
            for(int j=1; j<=length; j++)
            {
                sub = str.substring(i, i+j);
                System.out.println(sub);
            }
        }
    }
}
