/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematikaberaksi;
import java.util.Scanner;
/**
 *
 * @author UmumPRT
 */
public class Matematika {
Scanner masukan = new Scanner(System.in);
    
    public void pertambahan(int a, int b){
        a = masukan.nextInt();
        b = masukan.nextInt();
        int hasil = a + b;
        System.out.println("Hasil = " + hasil);
    }
    public void pengurangan (int a, int b){
        a = masukan.nextInt();
        b = masukan.nextInt();
        int hasil = a - b;
        System.out.println("Hasil = " + hasil);
    }
    public void perkalian (int a, int b){
        a = masukan.nextInt();
        b = masukan.nextInt();
        int hasil = a * b;
        System.out.println("Hasil = " + hasil);
    }
    public void pembagian (int a, int b){
        a = masukan.nextInt();
        b = masukan.nextInt();
        int hasil = a / b;
        System.out.println("Hasil = " + hasil);
    }
}
