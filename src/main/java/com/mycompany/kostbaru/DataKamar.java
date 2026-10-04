/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

/**
 *
 * @author resti
 */
public class DataKamar {
    
    private int nomor;
    private String penghuni;
    private double harga;
    private static int jumlahKamar = 0;
    
    public DataKamar(int nomor, String penghuni, double harga) {
        this.nomor = nomor;
        this.penghuni = penghuni;
        this.harga = harga;
        jumlahKamar++;
    }
    
    public DataKamar(int nomor, String penghuni) {
        this.nomor = nomor;
        this.penghuni = penghuni;
        this.harga = 500000;
    }
    
    public int getNomor() {
        return nomor;
    }
    
    public String getPenghuni() {
        return penghuni;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public static int getJumlahKamar() {
        return jumlahKamar;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Kamar: " + nomor);
        System.out.println("Penghuni: " + penghuni);
        System.out.println("Harga: " + harga);
    }
    
    public void tampilkanInfo(String tambahan) {
        tampilkanInfo();
        System.out.println(tambahan);
    }
}