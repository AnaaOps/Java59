import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x, y, z = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        try {
            x = sc.nextInt();
            System.out.print("Enter second number: ");
            y = sc.nextInt();
            z = x / y;
            System.out.println("Division result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        finally {
            System.out.println("Final result: " + z);
            sc.close();
        }
    }
}
