import java.util.Scanner;

class CalcWSwitch {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

class CalculatorA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcWSwitch calc = new CalcWSwitch();

        System.out.println("MENU");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");

        System.out.println("Enter your choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number: ");
                int x = sc.nextInt();

                System.out.println("Enter the Second Number: ");
                int y = sc.nextInt();
                System.out.println("Addition of Numbers: " + calc.add(x, y));
                break;
            case 2:
                System.out.println("Enter the number: ");
                x = sc.nextInt();

                System.out.println("Enter the Second Number: ");
                y = sc.nextInt();
                System.out.println("Addition of Numbers: " + calc.subtract(x, y));
                break;
            default:
                System.out.println("Exiting.....");

        }
    }
}
