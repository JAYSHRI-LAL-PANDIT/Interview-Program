import java.util.Scanner;
public class GetInputFromUser {
    public static void main(String[] args) {
        int a;
        float f;
        String s;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a string :");
        s=sc.nextLine();
        System.out.println("Your entered string is :"+s);
        
        System.out.print("Enter a integer number :");
        a=sc.nextInt();
        System.out.println("Your Entered Integer Number is :"+a);
        
        System.out.print("Enter a float number :");
        f=sc.nextFloat();
        System.out.println("Your Entered float number is : "+f);
        
        
    }
}
