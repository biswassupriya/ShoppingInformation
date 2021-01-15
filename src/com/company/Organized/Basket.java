package com.company.Organized;

public class Basket {
    String productName;
    String productDescription;
    int productCost;

    public Basket(String name , String description , int cost) {
        productName = name;
        productDescription = description;
        productCost = cost;
    }
    public String toString() {
        return  " ProductName: "+  this.productName + "\n" + "ProductDescription: "+
                this. productDescription + "\n" + "ProductCost: " +this. productCost ;
    }
}
