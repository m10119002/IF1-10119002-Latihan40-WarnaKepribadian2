/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan40;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program warna kepribadian
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static final Biru BIRU = new Biru();
    public static final Merah MERAH = new Merah();
    public static final Kuning KUNING = new Kuning();
    public static final Ungu UNGU = new Ungu();
    public static final Hijau HIJAU =  new Hijau();
    public static final Toska TOSKA = new Toska();
    public static TipeWarna pilihanKamu;
    public static String warnaFavorit, namaKamu;
    
    public static void masukkanNamaKamu() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("NAMA KAMU : ");
        input = scanner.nextLine();
        if(input.equals("")) {
            System.err.println("ERROR: Nama tidak boleh kosong!");
            namaKamu = null;
        }
        else namaKamu = input;
    }
    
    public static void masukkanWarnaFavorit() {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("PILIH WARNA FAVORITMU : ");
        input = scanner.nextLine();
        input = input.toUpperCase();
        switch(input) {
            case "MERAH":
                pilihanKamu = new Merah();
                warnaFavorit = input;
                break;
            case "HIJAU":
                pilihanKamu = new Hijau();
                warnaFavorit = input;
                break;
            case "KUNING":
                pilihanKamu = new Kuning();
                warnaFavorit = input;
                break;
            case "BIRU":
                pilihanKamu = new Biru();
                warnaFavorit = input;
                break;
            case "UNGU":
                pilihanKamu = new Ungu();
                warnaFavorit = input;
                break;
            default:
                pilihanKamu = new Unidentified();
                warnaFavorit = input;
                break;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(MERAH.warnai("YUK ").
                concat(HIJAU.warnai("CEK ")).
                concat(KUNING.warnai("KEPRIBADIANMU ")).
                concat(TOSKA.warnai("DARI ")).
                concat(UNGU.warnai("WARNA ")).
                concat(BIRU.warnai("FAVORITMU")));
        System.out.println("");
        MERAH.printBoxWarna();
        HIJAU.printBoxWarna();
        KUNING.printBoxWarna();
        BIRU.printBoxWarna();
        UNGU.printBoxWarna();
        System.out.println("");
        masukkanWarnaFavorit();
        while(warnaFavorit==null) {
            masukkanWarnaFavorit();
        }
        masukkanNamaKamu();
        while(namaKamu==null) {
            masukkanNamaKamu();
        }
        System.out.println("");
        pilihanKamu.kepribadian(namaKamu);
    }
}
