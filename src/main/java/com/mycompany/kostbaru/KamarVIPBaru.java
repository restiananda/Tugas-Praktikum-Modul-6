/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kostbaru;

/**
 *
 * @author resti
 */

public class KamarVIPBaru extends DataKamar {

    private boolean fasilitasPremium;

    public KamarVIPBaru(int nomor, String penghuni, double harga, boolean fasilitasPremium) {
        super(nomor, penghuni, harga);
        this.fasilitasPremium = fasilitasPremium;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis: VIP");
        System.out.println("Fasilitas Premium: " 
                + (fasilitasPremium ? "Ada" : "Tidak Ada"));
    }
}
