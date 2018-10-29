package fr.iut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCarpaccio {

    @Test
    public void testProductConstructor() {
        final Product p = new Product("Produit 1", 5.0d);
        assertEquals("Produit 1", p.getLabel());
        assertTrue(5.0d == p.getHTPrice());
    }

    @Test
    public void testCartConstructor() {
        final Product p = new Product("Produit 1", 5.0d);
        final Cart c = new Cart();
        c.addProduct(p, 2);

        assertEquals(1, c.countProducts());
    }

    @Test
    public void testGetTotalHTPrice() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(31, c.getTotalHTPrice(), 0);
    }

    @Test
    public void testGetTotalTTCPriceDE() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(36.89, c.getTotalTTCPrice(Taxes.DE), 0);
    }

    @Test
    public void testGetTotalTTCPriceDK() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(38.75, c.getTotalTTCPrice(Taxes.DK), 0);
    }

    @Test
    public void testGetTotalTTCPriceHR() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(38.75, c.getTotalTTCPrice(Taxes.HR), 0);
    }

    @Test
    public void testGetTotalTTCPriceIS() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(38.905, c.getTotalTTCPrice(Taxes.IS), 0);
    }

    @Test
    public void testGetTotalTTCPriceCH() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(33.48, c.getTotalTTCPrice(Taxes.CH), 0);
    }

    @Test
    public void testGetTotalTTCPriceFR() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(37.076, c.getTotalTTCPrice(Taxes.FR), 0);
    }

    @Test
    public void testTTCPriceWith0Discount() {
        final Cart c = new Cart();
        final Product p1 = new Product("Produit 1", 5.0d);
        final Product p2 = new Product("Produit 2", 7.0d);

        c.addProduct(p1, 2);
        c.addProduct(p2, 3);

        assertEquals(37.076, c.getTotalTTCPriceWithDiscount(Taxes.FR), 0);
    }

    @Test
    public void testTTCPriceWith3Discount() {
        final Cart c = new Cart();
        final Product p = new Product("Produit 1", 1000.0d);
        c.addProduct(p, 1);

        assertEquals(1154.3, c.getTotalTTCPriceWithDiscount(Taxes.DE), 0);
    }

    @Test
    public void testTTCPriceWith5Discount() {
        final Cart c = new Cart();
        final Product p = new Product("Produit 1", 5000.0d);
        c.addProduct(p, 1);

        assertEquals(5652.5, c.getTotalTTCPriceWithDiscount(Taxes.DE), 0);
    }

    @Test
    public void testTTCPriceWith7Discount() {
        final Cart c = new Cart();
        final Product p = new Product("Produit 1", 7500.0d);
        c.addProduct(p, 1);

        assertEquals(8300.25, c.getTotalTTCPriceWithDiscount(Taxes.DE), 0);
    }

    @Test
    public void testTTCPriceWith10Discount() {
        final Cart c = new Cart();
        final Product p = new Product("Produit 1", 20000.0d);
        c.addProduct(p, 1);

        assertEquals(21420, c.getTotalTTCPriceWithDiscount(Taxes.DE), 0);
    }

    @Test
    public void testTTCPriceWith15Discount() {
        final Cart c = new Cart();
        final Product p = new Product("Produit 1", 100000);
        c.addProduct(p, 1);

        assertEquals(101150, c.getTotalTTCPriceWithDiscount(Taxes.DE), 0);
    }
}
