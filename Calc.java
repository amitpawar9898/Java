import java.util.Scanner;

public class Calc {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

class CalcA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();

        int choice;  // declare outside loop

        do {
            System.out.println("MENU");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    int x = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    int y = sc.nextInt();
                    System.out.println("Result: " + calc.add(x, y));
                    break;

                case 2:
                    System.out.print("Enter the first number: ");
                    x = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    y = sc.nextInt();
                    System.out.println("Result: " + calc.subtract(x, y));
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}
