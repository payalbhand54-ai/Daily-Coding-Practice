import java.util.Scanner;

public class practice5 {

    public static void main(String A[])
    {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        a = scanner.nextInt();
        
        System.out.println("Enter second number :");
        b = scanner.nextInt();

        int Substraction = a-b;

        System.out.println("Substraction :"+Substraction);

        scanner.close();

    }

    
}
