/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

/**
 *
 * @author JCMB
 */
public class Product implements IProduct{
    private int id;
    private String name;
    private double price;

    public Product(int id,String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }    
}