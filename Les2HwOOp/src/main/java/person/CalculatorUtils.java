package person;

public class CalculatorUtils {
    public static double calculateAverage(int first, int second) {
        double ave = (first + second) / 2;
        return ave;
    }

    public static double calculateAverage(int first, int second, int third) {
        double ave =  (first + second + third) / 3;
        return ave;
    }
}
