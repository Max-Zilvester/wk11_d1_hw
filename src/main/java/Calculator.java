public class Calculator {
    private int sum;
    private int minus;
    private int multiply;
    private double divide;

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
