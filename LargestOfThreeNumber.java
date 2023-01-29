import java.util.Scanner;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three numbers :");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y && x>z)
           System.out.println("Largest number is :"+x);
        else if(y>x && y>z)
           System.out.println("Largest number is :"+y);
        else if(z>x && z>y)
           System.out.println("Largest number is :"+z);
        else 
            System.out.println("Entered number is not distinct.");        
    }
}
