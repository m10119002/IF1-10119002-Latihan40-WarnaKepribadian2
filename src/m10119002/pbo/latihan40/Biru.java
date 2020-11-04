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
 * Deskripsi Program : Class untuk objek biru
 * 
 * 
 */
public class Biru extends TipeWarna {
    public Biru() {
        ANSI_CODE = "\u001B[34m";
        ANSI_CODE_BACKGROUND = "\u001B[44m";
        namaWarna = "BIRU";
        namaWarna_F = ANSI_RESET.concat(ANSI_CODE).
                concat(namaWarna).concat(ANSI_RESET);
        stripWarna = "        BIRU            ";
    }
    
    @Override
    public void kepribadian(String nama) {
        System.out.println("===HASIL TEST KEPRIBADIAN ".
                concat(nama).concat("==="));
        System.out.println("Warna Favoritmu adalah ".concat(namaWarna_F));
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya "
                + "yang cenderung mencari jalan damai.");
    }
}
