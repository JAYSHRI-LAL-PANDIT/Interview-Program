
import java.util.Scanner;

public class SwapTwoNumberWithoutThired {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swap :\na ="+a+"\nb ="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap :\na ="+a+"\nb ="+b);
    }
}
