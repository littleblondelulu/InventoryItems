package com.theironyard.charlotte;

/**
 * Created by lindseyringwald on 8/8/16.
 */
public class Vegetables extends com.theironyard.charlotte.Inventory{
    public Vegetables(String name, int quantity) {
        super(name, quantity);
        this.category = "vegetables";
    }
}
