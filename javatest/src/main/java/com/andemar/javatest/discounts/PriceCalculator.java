package com.andemar.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<Double>();

    private double discount;

    public double getTotal() {

        double total = 0.0;

        for(double price: prices) {
            total += price;
        }

        total = total - (total * (discount/100) );

        return total;
    }

    public void addPrice(Double add) {
        prices.add(add);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
