package fr.iut;

public class Product {
    private final String label;
    private final double HTPrice;

    public Product(final String label, final double HTPrice) {
        this.label = label;
        this.HTPrice = HTPrice;
    }

    public String getLabel() {
        return this.label;
    }

    public double getHTPrice() {
        return this.HTPrice;
    }
}
