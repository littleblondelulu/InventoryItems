package com.theironyard.charlotte;

/**
 * Created by lindseyringwald on 8/8/16.
 */
public class Inventory {
    public static Inventory currentItem;
    public String name;
    public int quantity;
    public String category;

    public Inventory(String name,int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s\n", this.quantity, this.name, this.category);
    }

    public static Inventory createItem(String name, int quantity, String category) {
        if(category.equalsIgnoreCase("fruit")){
            return new Fruit(name, quantity);
        }
        else if(category.equalsIgnoreCase("vegetables")){
            return new Vegetables(name, quantity);
        }
        else if(category.equalsIgnoreCase("starch")){
            return new Starch(name, quantity);
        }
        else if(category.equalsIgnoreCase("wine")){
            return new Wine(name, quantity);
        }
        else if(category.equalsIgnoreCase("meat")){
            return new Meat(name, quantity);
        }
        return createItem(name, quantity, category);
    }

}


