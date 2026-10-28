import java.util.Scanner;

public class practice8 {
    public static void main(String A[])
    {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        a = scanner.nextInt();

        System.out.println("Enter Second number : ");
        b = scanner.nextInt();


        if(b != 0)
        {
            double result = (double) a/ (double) b;
            System.out.println("Division : "+result);

        }
        else
        {
            System.out.println("Invalid input");
        }

        scanner.close();


    }

}
