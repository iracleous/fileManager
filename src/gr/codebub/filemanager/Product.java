package gr.codebub.filemanager;

import gr.codebub.filemanager.exception.TooHighPriceException;

public class Product {

    private String name;
    private double price;
    private int inventoryQuantity;

    public Product() {
    }

    public Product(String name, double price, int inventoryQuantity) {
        this.name = name;
        this.price = price;
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", inventoryQuantity=" + inventoryQuantity +
                '}';
    }


    /**
     * R.3.4
     * IncreasePriceWhenLowAvailability
     * @author D.P.Iracleous
     * @date 2021-07-06
     *
      */

    public void IncreasePriceWhenLowAvailability(double priceIncease, int inventoryQuantityLimit)
    throws TooHighPriceException
    {
        if (inventoryQuantity <inventoryQuantityLimit ){
            if (priceIncease+price> 100) throw new TooHighPriceException("The price is too high ");
            price += priceIncease;
        }

    }


}
