/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan40;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek warna yang belum teridentifikasi
 * 
 * 
 */
public class Unidentified extends TipeWarna {
    @Override
    public void kepribadian(String nama) {
        System.out.println("===HASIL TEST KEPRIBADIAN ".
                concat(nama).concat("==="));
        System.out.println("Oops.. Belum teridentifikasi");
    }
}
