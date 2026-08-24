import java.util.*;
class Exception_Hand {
    public static void main(String[] args) {

        int a = args.length;
        Scanner s = new Scanner(System.in);

        System.out.println("Value of a is : " + a);

        try {

            if (a == 0) {
                int b = 24;
                a = b / (b - b);
            }

            if (a == 1) {
                int A[] = {};
                A[16] = 20;
            }

            if (a == 2) {
                System.out.print("Enter Array size: ");
                int n = s.nextInt();

                int B[]= new int[n];
                B[17] = 15;
            }

        } catch (ArithmeticException e) {
            System.out.println("Do not use zero as a divisor. " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size exceeds. " + e);

        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative value. " + e);

        } finally {
            System.out.println("Exceptions Completed.");
        }
    }
}