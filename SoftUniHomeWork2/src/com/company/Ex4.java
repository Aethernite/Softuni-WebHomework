package com.company;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Product> map = new LinkedHashMap<String,Product>();

        while(true){
            String[] input = scanner.nextLine().split("\\s+");
            if(input[0].toLowerCase().equals("buy")){
                break;
            }
            if(!map.containsKey(input[0])){
                Product prod = new Product(input[0], Double.parseDouble(input[1]), Integer.parseInt(input[2]));
                map.put(input[0], prod);
            }
            else if(map.containsKey(input[0])){
                Product value = map.get(input[0]);
                value.setQuantity(value.getQuantity() + Integer.parseInt(input[2]));
                value.setPrice(Double.parseDouble(input[1]));
                map.put(input[0],value);
            }
        }

        map.forEach((k,v) -> System.out.println(v.getName() + " -> " + String.format("%.2f",v.getPrice()*v.getQuantity())));
    }
}

class Product{
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
