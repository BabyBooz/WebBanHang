/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Cart {

    public List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public Cart(List<Item> items) {
        this.items = items;
    }

    //id product, remove, add, check exist
    public Item getItembyId(int id) {
        for (Item item : items) {
            if (item.getProduct().getId() == id) {
                return item;
            }
        }

        return null;
    }

    public int getQuantityById(int id) {
        return getItembyId(id).getQuantity();
    }

    //add to cart //new product t
    public void addItem(Item t) {
        //exist in cart
        if (getItembyId(t.getProduct().getId()) != null) {
            Item i = getItembyId(t.getProduct().getId());
            if(i.getQuantity()<5){
              i.setQuantity(i.getQuantity() + t.getQuantity()); //num = - 1 or = 1  
            }else{
                i.setQuantity(i.getQuantity() + t.getQuantity()-1); //num = - 1 or = 1  
            }
        } else {
            items.add(t);
        }
    }

    // remove product from cart 
    public void removeItem(int id) {
        if (getItembyId(id) != null) {
            items.remove(getItembyId(id));
        }
    }

    public double getTotalMoney() {
        double t = 0;
        for (Item item : items) {
            t += item.getQuantity() * item.getPrice();
        }
        return t;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
