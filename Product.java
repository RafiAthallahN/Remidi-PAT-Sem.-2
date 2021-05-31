/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author W10
 */
public class Product {

    public String Merk, Type, Category, Color;
    public int Size;
    public double Price;

    public Product(String Merk, String Type, String Category, String Color, int Size, double Price) {
        this.Merk = Merk;
        this.Type = Type;
        this.Category = Category;
        this.Color = Color;
        this.Size = Size;
        this.Price = Price;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void info() {
        System.out.println("Merk = " + this.Merk);
        System.out.println("Type = " + this.Type);
        System.out.println("Category = " + this.Category);
        System.out.println("Color = " + this.Color);
        System.out.println("Size = " + this.Size);
        System.out.println("Price = " + this.Price);
    }
}
