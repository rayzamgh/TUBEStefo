package com.engicorp.oop.product;

public abstract class Product{
    protected int price;
    protected String name;

    public Product(int _price, String _name){
        price = _price;
        name = _name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int _price){
        price = _price;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String _name){
        name = _name;
    }
    
}