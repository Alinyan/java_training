/**
 * Created by Alina.Zaytseva
 * Date: 28-May-20
 */
public class Calculator {
    private ICalculator icalc;

    public Calculator(ICalculator icalc) {
        this.icalc = icalc;
    }

    public double add(double d1, double d2) {
        return icalc.add(d1, d2);
    }

    public double subtract(double d1, double d2) {
        return icalc.subtract(d1, d2);
    }

    public double multiply(double d1, double d2) {
        return icalc.multiply(d1, d2);
    }

    public double divide(double d1, double d2) {
        return icalc.divide(d1, d2);
    }
}