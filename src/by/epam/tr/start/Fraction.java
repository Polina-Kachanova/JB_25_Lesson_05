package by.epam.tr.start;

public class Fraction {

    private double dividend;
    private double divider;

    public Fraction() {}

    public Fraction(double dividend, double divider) {
        this.dividend = dividend;
        this.divider = divider;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double getDivider() {
        return divider;
    }

    public void setDivider(double divider) {
        this.divider = divider;
    }
}
