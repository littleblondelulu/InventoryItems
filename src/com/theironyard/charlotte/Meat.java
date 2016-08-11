package com.theironyard.charlotte;

/**
 * Created by lindseyringwald on 8/8/16.
 */
public class Meat extends com.theironyard.charlotte.Inventory {
    public Meat(String name, int quantity) {
        super(name, quantity);
        this.category = "meat";
    }
}
