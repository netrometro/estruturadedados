package br.mendonca.trabalho04.tads;

import br.mendonca.trabalho04.ITAD;

import java.util.Random;
public class ThiagoBarrosTAD implements ITAD {
    private String chrysanthemum;
    private double price;
    private boolean isOnSale;
    public ThiagoBarrosTAD() {
        String[] chrysanthemums = {"anethifolium", "aphrodite", "arcticum", "argyrophyllum", "coronarium", "leucanthemum", "segetum"};
        Random random = new Random();

        chrysanthemum = chrysanthemums[random.nextInt(chrysanthemums.length)] + " " +
                chrysanthemums[random.nextInt(chrysanthemums.length)] + " " +
                chrysanthemums[random.nextInt(chrysanthemums.length)];

        price = random.nextInt(100) + random.nextInt(100)/100.0;
        isOnSale = random.nextBoolean();
    }
    @Override
    public String getString() {
        return chrysanthemum;
    }

    @Override
    public void setString(String name) {
        this.chrysanthemum = name;
    }

    @Override
    public double getDouble() {
        return price;
    }

    @Override
    public void setDouble(double value) {
        this.price = value;
    }

    @Override
    public boolean isBoolean() {
        return isOnSale;
    }

    @Override
    public void setBoolean(boolean bit) {
        this.isOnSale = bit;
    }

    @Override
    public String print() {
        return chrysanthemum;
    }

    @Override
    public String toString() {
        return  "Chrysanthemum: " + chrysanthemum + "\n" +
                "Price: " + price + "\n" +
                "Is on sale? " + isOnSale;
    }
}
