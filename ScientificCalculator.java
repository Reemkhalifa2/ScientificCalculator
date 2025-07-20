import java.util.Scanner;
public class  ScientificCalculator {
    public static void main(String[] args){
        Scanner InputReader = new Scanner(System.in);
        int choice;
        DisplayMenu();
        System.out.println("Choose an operation: ");
        boolean continueCalculation = true;

        while (continueCalculation){
            choice = InputReader.nextInt();
            if (choice == 0) {
                break; // this exits the while loop
            }
            switch (choice){
                case 1:
                    Addition(InputReader);break;
                case 2:
                    Subtraction(InputReader);break;
                case 3:
                    Multiplication(InputReader);break;
                case 4:
                    Division(InputReader);break;
                default:
                    System.out.println("Invalid choice. Please choose from the menu.");
                    break;
            }

        }
        InputReader.close();

    }
    public static void DisplayMenu(){
        System.out.println("1) Addition");
        System.out.println("2) subtraction");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("0) Exit");
    }
    public static double add(double num1, double num2) {
        // Logic for addition
        return num1 + num2;
    }
    private static double Addition(Scanner InputReader){
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+add(FirstNumber,SecondNumber));
        return 0;

    }
    public static double sub(double num1, double num2) {
        // Logic for addition
        return num1 - num2;
    }
    private static double Subtraction(Scanner InputReader){
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+sub(FirstNumber,SecondNumber));
        return 0;

    }
    public static double mul(double num1, double num2) {
        // Logic for addition
        return num1 * num2;
    }
    private static double Multiplication(Scanner InputReader){
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+mul(FirstNumber,SecondNumber));
        return 0;

    }
    public static double div(double num1, double num2) {
        // Logic for addition
        return num1 / num2;
    }
    private static double Division(Scanner InputReader){
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+div(FirstNumber,SecondNumber));
        return 0;
    }






}
