import java.util.Scanner;

class UserInput {

    void evenodd(int no) {
        if (no % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    void square(int no) {
        System.out.println("The square is: " + (no * no));
    }

    void add(int a, int b) {
        System.out.println("The addition is: " + (a + b));
    }

    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("The division is: " + ((double) a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    void multiply(int a, int b) {
        System.out.println("The multiplication is: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInput obj = new UserInput();

        while (true) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Calculate Square");
            System.out.println("3. Addition");
            System.out.println("4. Division");
            System.out.println("5. Multiplication");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to check even or odd: ");
                    int num1 = sc.nextInt();
                    obj.evenodd(num1);
                    break;

                case 2:
                    System.out.print("Enter a number to calculate its square: ");
                    int num2 = sc.nextInt();
                    obj.square(num2);
                    break;

                case 3:
                    System.out.print("Enter two numbers to add:\nFirst number: ");
                    int add1 = sc.nextInt();
                    System.out.print("Second number: ");
                    int add2 = sc.nextInt();
                    obj.add(add1, add2);
                    break;

                case 4:
                    System.out.print("Enter two numbers to divide:\nNumerator: ");
                    int div1 = sc.nextInt();
                    System.out.print("Denominator: ");
                    int div2 = sc.nextInt();
                    obj.divide(div1, div2);
                    break;

                case 5:
                    System.out.print("Enter two numbers to multiply:\nFirst number: ");
                    int mul1 = sc.nextInt();
                    System.out.print("Second number: ");
                    int mul2 = sc.nextInt();
                    obj.multiply(mul1, mul2);
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
