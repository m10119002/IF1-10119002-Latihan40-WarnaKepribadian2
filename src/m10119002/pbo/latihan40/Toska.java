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
 * Deskripsi Program : Class untuk objek hijau
 * 
 * 
 */
public class Toska extends TipeWarna {
    public Toska() {
        ANSI_CODE = "\u001B[36m";
        ANSI_CODE_BACKGROUND = "\u001B[46m";
        namaWarna = "TOSKA";
        namaWarna_F = ANSI_RESET.concat(ANSI_CODE).
                concat(namaWarna).concat(ANSI_RESET);
    }
}
