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
public class Kasir  {

    protected String namatoko;
    protected String namakaryawan;

    public Kasir(String namatoko, String namakaryawan) {

        this.namatoko = namatoko;
        this.namakaryawan = namakaryawan;
    }

    public void info() {
        
        System.out.println("Nama Toko = " + this.namatoko);
        System.out.println("Nama Karyawan = " + this.namakaryawan);
    }
}
