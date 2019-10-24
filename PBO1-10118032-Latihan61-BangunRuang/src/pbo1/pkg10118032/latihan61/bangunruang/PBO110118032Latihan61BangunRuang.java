/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan61.bangunruang;



/**
 *
 * @author Guntur Maulana I
 * NAMA  : Guntur Maulana Ibrahim
 * KELAS : IF 1
 * NIM   : 10118032
 * Deskripsi Program : Menghitung volume bangun ruang.
 */
public class PBO110118032Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Hasil : V = "+Math.ceil(bola.hitungVolume()));
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil V = "+Math.ceil(tabung.hitungVolume()));
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil : V = "+Math.ceil(kerucut.hitungVolume()));
    }
    
}
