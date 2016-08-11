package com.theironyard.charlotte;

import java.util.Locale;

/**
 * Created by lindseyringwald on 8/8/16.
 */
public class Fruit extends com.theironyard.charlotte.Inventory{
    public Fruit(String name, int quantity) {
        super(name, quantity);
        this.category = "fruit";
    }

}
