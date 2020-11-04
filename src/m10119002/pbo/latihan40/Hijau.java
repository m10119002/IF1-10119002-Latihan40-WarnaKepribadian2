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
public class Hijau extends TipeWarna {
    public Hijau() {
        ANSI_CODE = "\u001B[32m";
        ANSI_CODE_BACKGROUND = "\u001B[42m";
        namaWarna = "HIJAU";
        namaWarna_F = ANSI_RESET.concat(ANSI_CODE).
                concat(namaWarna).concat(ANSI_RESET);
        stripWarna = "        HIJAU           ";
    }
    
    @Override
    public void kepribadian(String nama) {
        System.out.println("===HASIL TEST KEPRIBADIAN ".
                concat(nama).concat("==="));
        System.out.println("Warna Favoritmu adalah ".concat(namaWarna_F));
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan "
                + "kepercayaan.");
    }
}
