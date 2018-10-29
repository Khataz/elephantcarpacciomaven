package fr.iut;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private final Map<Product, Integer> products = new HashMap<Product, Integer>();

    //methods
    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    public double getTotalTTCPriceWithDiscount(Taxes tax) {
        double total = this.getTotalTTCPrice(tax);
        if(total < 1000)
            return total;
        else if(total >= 1000 && total < 5000)
            return (total-0.03*total);
        else if(total >= 5000 && total < 7000)
            return (total-0.05*total);
        else if(total >= 7000 && total < 10000)
            return (total-0.07*total);
        else if(total >= 10000 && total < 50000)
            return (total-0.1*total);
        else if(total >= 50000)
            return (total-0.15*total);
        return -1;
    }

    public int countProducts() {
        return products.size();
    }

    public double getTotalHTPrice() {

        double total = 0;

        for(Product p : products.keySet()) {
            total += p.getHTPrice() * products.get(p);
        }

        return total;
    }

    public double getTotalTTCPrice(Taxes tax) {
        return (this.getTotalHTPrice() + this.getTotalHTPrice()*tax.value());
    }
}
