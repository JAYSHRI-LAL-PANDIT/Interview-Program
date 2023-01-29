import java.util.Scanner;

public class AddTwoDMatrix {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        m=sc.nextInt();
        System.out.println("Enter column :");
        n=sc.nextInt();

        int matrix1[][]= new int [m][n];
        int matrix2[][]= new int[m][n];
        int sum[][] = new int[m][n];
        
        System.out.println("Enter first matrix elements :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
            
        }

        System.out.println("Enter Second matrix elements :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("Resultant matrix is :");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
