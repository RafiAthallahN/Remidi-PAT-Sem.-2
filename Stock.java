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
public class Stock extends Product {

    public Stock(String Merk, String Type, String Category, String Color, int Size, double Price) {
        super(Merk, Type, Category, Color, Size, Price);
    }

    @Override
    public void setMerk(String Merk) {
        this.Merk = "Puma";
        this.Merk = "910";
        this.Merk = "Vans";
        this.Merk = "Adidas";
        this.Merk = "Nike";
        this.Merk = "Reebok";
        this.Merk = "Converse";
        this.Merk = "Fila";
        this.Merk = "Skechers";
    }

    @Override
    public void setType(String Type) {
        this.Type = "Male shoes";
        this.Type = "Female shoes";
    }

    @Override
    public void setCategory(String Category) {
        this.Category = "Sport";
        this.Category = "Running";
        this.Category = "Chill";
        this.Category = "Office";
    }

    @Override
    public void setColor(String Color) {
        this.Color = "Black";
        this.Color = "White";
        this.Color = "Gold";
        this.Color = "Silver";
        this.Color = "Orange";
        this.Color = "Green";
        this.Color = "Yellow";
        this.Color = "Blue";
        this.Color = "Red";
    }

    @Override
    public void setPrice(double Price) {
        if ((Merk.equals("Puma") && Category.equals("Sport")) || (Merk.equals("Adidas") && Category.equals("Sport"))) {
            this.Price = 300000;
        } else if ((Merk.equals("Nike") && Category.equals("Sport")) || (Merk.equals("Reebok") && Category.equals("Sport"))) {
            this.Price = 400000;
        } else if (Merk.equals("Vans") && Category.equals("Chill") || (Merk.equals("Fila") && Category.equals("Chill")) || (Merk.equals("Converse") && Category.equals("Chill"))) {
            this.Price = 200000;
        } else if ((Merk.equals("910") && Category.equals("Running")) || (Merk.equals("Adidas") && Category.equals("Running"))) {
            this.Price = 500000;
        } else if ((Merk.equals("Nike") && Category.equals("Running")) || (Merk.equals("Skechers") && Category.equals("Running"))) {
            this.Price = 700000;
        } else if ((Merk.equals("Puma") && Category.equals("Running"))) {
            this.Price = 900000;
        } else if ((Merk.equals("Skechers") && Category.equals("Office"))) {
            this.Price = 600000;
        }
    }

    @Override
    public void setSize(int Size) {
        this.Size = 25;
        this.Size = 26;
        this.Size = 27;
        this.Size = 28;
        this.Size = 29;
        this.Size = 30;
        this.Size = 31;
        this.Size = 32;
        this.Size = 33;
        this.Size = 34;
    }
}
