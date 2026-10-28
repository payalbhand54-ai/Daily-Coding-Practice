import java.util.Scanner;

class practice7
{
    public static void main(String A[])
    {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        a = scanner.nextInt();

        System.out.println("Enter second number :");
        b = scanner.nextInt();

        double divide = a/b;

        System.out.println("Division : "+divide);

        scanner.close();


    }
}