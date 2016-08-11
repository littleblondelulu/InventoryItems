package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                ArrayList<Inventory> items = new ArrayList<>();

                String option = "";
                do {
                    for(int i = 0; i < items.size();i++) {
                        Inventory item = items.get(i);
                        System.out.printf("%d. %s\n", i, item);
                    }


                    System.out.println("What would you like to do today? [1. Create a new item / 2. Remove an item / 3. Update item qty]");
                    option = scanner.nextLine();

                    if (option.equals("1")) {
                        System.out.println("1. Create a new item.");
                        String name = scanner.nextLine();

                        System.out.println("Enter the quantity of the item");
                        String text = scanner.nextLine();
                        Integer.valueOf(text);
                        int quantity = Integer.parseInt(text);

                        System.out.println("Which category does the item belong to?");
                        String category = scanner.nextLine();
                        Inventory.createItem(name, quantity, category);

                        items.add(Inventory.createItem(name, quantity, category));

                        System.out.println("You now have "+ quantity + " " + name + " " +category + "(s)");


                    }
                    else if(option.equals("2")){
                        System.out.println("2. Remove an item by its index number. Please see list of items");
                        //read in a number that indicates the item

                        int idx = Integer.valueOf(scanner.nextLine());
                        items.remove(idx - 1);

                        System.out.println("Your item has been removed");

                    }
                    else if(option.equals("3")) {
                        System.out.println("3.Enter the index of the item you would like to update.");
                        int idx = Integer.valueOf(scanner.nextLine());

                        //gives item in array list spec in prev
                        Inventory item = items.get(idx - 1);
                        System.out.println("3.Enter the updated quantity of the item.");

                        int quantityUpdate = Integer.valueOf(scanner.nextLine());
                        item.setQuantity(quantityUpdate);



                        System.out.println("Your quantity has been updated to " + quantityUpdate);
                    }

                } while (!option.equalsIgnoreCase("4"));

            }
        }





