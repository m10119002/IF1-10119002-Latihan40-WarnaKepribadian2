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
 * Deskripsi Program : Class untuk objek merah
 * 
 * 
 */
public class Merah extends TipeWarna {
    public Merah() {
        ANSI_CODE = "\u001B[31m";
        ANSI_CODE_BACKGROUND = "\u001B[41m";
        namaWarna = "MERAH";
        namaWarna_F = ANSI_RESET.concat(ANSI_CODE).
                concat(namaWarna).concat(ANSI_RESET);
        stripWarna = "        MERAH           ";
    }
    
    @Override
    public void kepribadian(String nama) {
        System.out.println("===HASIL TEST KEPRIBADIAN ".
                concat(nama).concat("==="));
        System.out.println("Warna Favoritmu adalah ".concat(namaWarna_F));
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah "
                + "tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangantan dan cinta.");
    }
}
