/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author PC
 */
public class Product {

    private int id;
    private float price;
    private String name;
    private int quantity;
    private String brand, image;
    private int cateID, idSeller;

    public Product() {
    }

    public Product(int id, float price, String name, int quantity, String brand, String image, int cateID, int idSeller) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.brand = brand;
        this.image = image;
        this.cateID = cateID;
        this.idSeller = idSeller;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", name=" + name + ", quantity=" + quantity + ", brand=" + brand + ", image=" + image + ", cateID=" + cateID + ", idSeller=" + idSeller + '}';
    }

    
    
    
}
