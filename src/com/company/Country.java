package com.company;

public class Country<T extends Number> implements KG<T> {
    private String name;
    T quantity;

    public Country(String name, T quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getQuantity() {
        return quantity;
    }

    public void setQuantity(T quantity) {
        this.quantity = quantity;
    }

    @Override
    public void Color(T t) {
        System.out.println("Name of Planet:" +name+ "  residents: "+t+"");

    }
}
