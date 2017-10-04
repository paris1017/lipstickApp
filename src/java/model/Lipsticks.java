/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author guohuinan
 */
public class Lipsticks {
    private int itemID;
    private String productName;
    private String brand;
    private String color;
    private int price;
    
    
    
    public Lipsticks() {
        this.itemID = 0;
        this.productName = "";
        this.brand = "";
        this.color = "";
        this.price = 0;
    }
   
    
    public Lipsticks(int itemID, String productName, String brand, String color, int price) {
        this.itemID = itemID;
        this.productName = productName;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lipsticks{" + "itemID=" + itemID + ", productName=" + productName + ", brand=" + brand + ", color=" + color + ", price=" + price + '}';
    }
   
    
    
}
