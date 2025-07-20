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
        try{
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+add(FirstNumber,SecondNumber));
        return 0;
        }catch (Exception e){
            System.out.println("Not a number try again");
            InputReader.nextLine(); // clear invalid input
            return 0;
        }


    }
    public static double sub(double num1, double num2) {
        // Logic for addition
        return num1 - num2;
    }
    private static double Subtraction(Scanner InputReader){

           try{
               System.out.println("Enter the First number:");
               double FirstNumber = InputReader.nextDouble();
               System.out.println("Enter the second number:");
               double SecondNumber = InputReader.nextDouble();
               System.out.println("Result:" + " " + sub(FirstNumber, SecondNumber));
               return 0;
           }catch (Exception e){
               System.out.println("Not a number try again");
               InputReader.nextLine(); // clear invalid input
               return 0;
           }
    }
    public static double mul(double num1, double num2) {
        // Logic for addition
        return num1 * num2;
    }
    private static double Multiplication(Scanner InputReader){
        try{
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+mul(FirstNumber,SecondNumber));
        return 0;
        }catch (Exception e){
            System.out.println("Not a number try again");
            InputReader.nextLine(); // clear invalid input
            return 0;
        }

    }
    public static double div(double num1, double num2) {
        // Logic for addition
        return num1 / num2;
    }
    private static double Division(Scanner InputReader){
        try{
        System.out.println("Enter the First number:");
        double FirstNumber = InputReader.nextDouble();
        System.out.println("Enter the second number:");
        double SecondNumber = InputReader.nextDouble();
        System.out.println("Result:"+" "+div(FirstNumber,SecondNumber));
        return 0;
        }catch (Exception e){
            System.out.println("Not a number try again"+ e.getMessage());
            InputReader.nextLine(); // clear invalid input
            return 0;
        }
    }
    public static double SquareRoot(double num){
        return Math.sqrt(num);
    }
    private static double calculateSquareRoot(Scanner InputReader){
        System.out.println("Enter number:");
        double num = InputReader.nextDouble();
        if (num<0){
            System.out.println("Invalid input. Please enter positive value.");
        }else{
            System.out.println("Result:"+" "+SquareRoot(num));
        }
        return 0;
    }
    public static double power(double base, double exponent){
        return Math.pow(base, exponent);
    }
    private static void calculatePower(Scanner InputReader) {
        System.out.print("Enter the base number: ");
        double base = InputReader.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = InputReader.nextDouble();
        double result = power(base, exponent);
        System.out.println("Result: " + result);

    }
    public static double sin(double radians) {
        return Math.sin(radians);
    }

    private static void calculateSine(Scanner InputReader) {
        System.out.print("Enter angle in degrees: ");
        double degrees = InputReader.nextDouble();
        double radians = Math.toRadians(degrees);
        double result = sin(radians);
        System.out.println("Result: " + result);
    }

    public static double cos(double radians) {
        return Math.cos(radians);
    }

    private static void calculateCosine(Scanner InputReader) {
        System.out.print("Enter angle in degrees: ");
        double degrees = InputReader.nextDouble();
        double radians = Math.toRadians(degrees);
        double result = cos(radians);
        System.out.println("Result: " + result);
    }

    public static double tangent(double radians) {
        return Math.tan(radians);
    }

    private static void calculateTangent(Scanner InputReader) {
        System.out.print("Enter angle in degrees: ");
        double degrees = InputReader.nextDouble();
        if (degrees % 180 == 90) {
            System.out.println("Tangent is undefined at " + degrees + " degrees.");
            return;
        }
        double radians = Math.toRadians(degrees);
        double result = tangent(radians);
        System.out.println("Result: " + result);
    }
    public static double NaturalLogarithm(double num) {
        return Math.log(num);
    }

    private static void calculateNaturalLogarithm(Scanner InputReader) {
        System.out.println("Enter number:");
        double num = InputReader.nextDouble();
        if (num<0){
            System.out.println("Invalid input. Please enter positive value.");
        }else{
            System.out.println("Result:"+" "+NaturalLogarithm(num));
        }

    }
    public static double LogarithmBase10(double num) {
        return Math.log10(num);
    }

    private static void calculateLogarithmBase10(Scanner InputReader) {
        System.out.println("Enter number:");
        double num = InputReader.nextDouble();
        if (num<0){
            System.out.println("Invalid input. Please enter positive value.");
        }else{
            System.out.println("Result:"+" "+LogarithmBase10(num));
        }

    }
    public static double AbsoluteValue(double num) {
        return Math.abs(num);
    }

    private static void calculateAbsoluteValue(Scanner InputReader) {
        System.out.println("Enter number:");
        double num = InputReader.nextDouble();
        System.out.println("Result:"+" "+AbsoluteValue(num));


    }










}
