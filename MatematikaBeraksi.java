/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikaberaksi;

/**
 *
 * @author UmumPRT
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematika m = new Matematika();
        System.out.println("Masukkan Angka Yang Ingin diBagi(/) = ");
        m.pembagian(0 ,0);
        System.out.println("Masukkan Angka Yang Ingin diKali(x) = ");
        m.perkalian(0, 0);
        System.out.println("Masukkan Angka Yang Ingin diTambah(+) = ");
        m.pertambahan(0,0);
        System.out.println("Masukkan Angka Yang Ingin diKurangi(-) ");
        m.pengurangan(0,100);
    }
    
}
