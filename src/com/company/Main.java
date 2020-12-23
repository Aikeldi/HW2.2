package com.company;

public class Main {

    public static void main(String[] args) {
        Country<Number> Bishkek = new Country<>("Bishkek",100000);
        Country<Number> Kant = new Country<>("Kant",72000);
        Bishkek.Color(Bishkek.quantity);
        Kant.Color(Kant.quantity);
    }
}
