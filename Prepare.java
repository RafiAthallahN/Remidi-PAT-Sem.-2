/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Prepare extends Stock {

    public Prepare(String Merk, String Type, String Category, String Color, int Size, double Price) {
        super(Merk, Type, Category, Color, Size, Price);
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    Scanner scan = new Scanner(System.in);

    @Override
    public void setMerk(String Merk) {
        this.Merk = scan.nextLine();
    }

    @Override
    public void setType(String Type) {
        this.Type = scan.nextLine();
    }

    @Override
    public void setCategory(String Category) {
        this.Category = scan.nextLine();
    }

    @Override
    public void setColor(String Color) {
        this.Color = scan.nextLine();
    }

    @Override
    public void setSize(int Size) {
        this.Size = scan.nextInt();
    }

    @Override
    public void setPrice(double Price) {
        this.Price = scan.nextDouble();
    }

    
}
