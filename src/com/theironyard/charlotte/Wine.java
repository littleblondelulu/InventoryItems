package com.theironyard.charlotte;

/**
 * Created by lindseyringwald on 8/8/16.
 */
public class Wine extends com.theironyard.charlotte.Inventory{
    public Wine(String name, int quantity) {
        super(name, quantity);
        this.category = "wine";
    }
}
