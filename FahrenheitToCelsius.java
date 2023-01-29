import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args) {
        float temperatue;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperatue in Fahrenheit :");
        temperatue = sc.nextInt();
        temperatue = ((temperatue -32)*5)/9;

        System.out.println("Temperatue in Celsius :"+temperatue);
    }
}