package bankberaksi;

import java.util.Scanner;

public class BankBeraksi {

    public static void main(String[] args) {
        
    int ambil = 0,simpan = 0;
    Scanner pilih = new Scanner(System.in);
    Bank bk = new Bank(1000000);
    System.out.println("Selamat Datang di Bank Saya");
    
    for (int i = 1; i >= 1 ; i++) {
        System.out.println("\n");
        System.out.println("Menu ATM");
        System.out.println("1. Cek Saldo 2. Simpan Uang 3. Ambil Uang");
        System.out.print("Pilih Menu ATM : ");
        
            int menu = pilih.nextInt();
            if (menu == 1) {
                bk.simpanAwal();
            } 
            else if (menu == 2){
                System.out.print("Masukan Uang disimpan Rp. ");
                bk.simpanUang(simpan);
            } 
            else if (menu == 3){
                System.out.print("Masukan Uang diambil RP. ");
                bk.ambilUang(ambil);
            } 
            else if (menu > 3 ){
                System.out.print("Menu Tidak Ada ");
                System.out.print("Ulangi Pilih Menu ATM : ");
            } else
                break;
        }
    }
}
