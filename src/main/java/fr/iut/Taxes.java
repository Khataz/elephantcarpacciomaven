package fr.iut;

public enum Taxes {
    DE(0.19d), DK(0.25d), HR(0.25d), IS(0.255), CH(0.08d), FR(0.196);

    private final double tax;

    private Taxes(double tax) {
        this.tax = tax;
    }

    public double value() {
        return this.tax;
    }
}