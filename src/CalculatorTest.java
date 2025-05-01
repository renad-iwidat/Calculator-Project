public class CalculatorTest {

    public static void main(String[] args) {
        // Test numbers
        double a = 20;
        double b = 5;

        // =====================
        // OOP Calculator
        // =====================
        System.out.println("=== OOP Calculator ===");

        // Create an instance of the OOP Calculator
        OOPCalculator oopCalc = new OOPCalculator();

        System.out.println("Add: " + oopCalc.add(a, b));
        System.out.println("Subtract: " + oopCalc.subtract(a, b));
        System.out.println("Multiply: " + oopCalc.multiply(a, b));
        System.out.println("Divide: " + oopCalc.divide(a, b));
        System.out.println("Mod: " + oopCalc.mod(a, b));

        // =====================
        // Functional Calculator (Lambda)
        // =====================
        System.out.println("\n=== Functional Calculator (Lambda) ===");

        // Define lambda expressions for basic operations
        Calculator add = (x, y) -> x + y;
        Calculator subtract = (x, y) -> x - y;
        Calculator multiply = (x, y) -> x * y;
        Calculator divide = (x, y) -> y != 0 ? x / y : Double.NaN;
        Calculator mod = (x, y) -> y != 0 ? x % y : Double.NaN;

        System.out.println("Add: " + add.calculate(a, b));
        System.out.println("Subtract: " + subtract.calculate(a, b));
        System.out.println("Multiply: " + multiply.calculate(a, b));
        System.out.println("Divide: " + divide.calculate(a, b));
        System.out.println("Mod: " + mod.calculate(a, b));
    }
}
