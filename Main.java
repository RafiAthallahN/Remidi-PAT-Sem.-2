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
public class Main {

    public static void main(String[] args) {
        Kasir kasir = new Kasir("Jaya Baru", "Abi");
        kasir.info();
        System.out.println(" ");
        System.out.println("Masukkan Informasi Barang");
        Product produk = new Product("Puma", "Male shoes", "Sports", "Red", 32, 300000);
        produk.info();
       System.out.println(" ");
        produk.Price = 300000;
        Product pro = new Product("Skechers", "Male Shoes", "Running", "White", 31, 700000);
        pro.info();
        pro.Price = 700000;
                
        System.out.println(" ");
        System.out.print("------------------------");
        System.out.println(" ");
        Kasir kas = new Kasir("Jaya Baru", "Abi");
        kas.info();
        System.out.println(" ");
        Product prod = new Product("Puma", "Male shoes", "Sports", "Red", 32, 300000);
        prod.info();
        System.out.println(" ");
        Product pr = new Product("Skechers", "Male Shoes", "Running", "White", 31, 700000);
        pr.info();
        System.out.println(" ");
        System.out.println("Jumlah Barang Dibeli = 2");
        System.out.println("Harga = Rp "+ (produk.Price + pro.Price));
        System.out.println("Diskon = Rp 50.000 (Pembelian 2 produk)");
        System.out.println("Total Harga = " + ((produk.Price + pro.Price) - 50000));
        System.out.println("Tanggal Pembelian = 31 Mei 2021");
    }
}
