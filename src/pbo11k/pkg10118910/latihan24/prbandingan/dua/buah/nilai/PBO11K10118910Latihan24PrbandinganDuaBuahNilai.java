/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan24.prbandingan.dua.buah.nilai;

import java.util.*;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh 
 * Kelas:IF11K 
 * NIM  :10118910
 *
 * Description : Program Perbandingankdya dubuah nilai 
 *
 */
public class PBO11K10118910Latihan24PrbandinganDuaBuahNilai {

    
    public static Scanner scan = new Scanner(System.in);
    public static void perbandingan(int a,int b){
        if( a > b)
            System.out.println( a + " Lebih besar dari " + b);
        else if( a < b )
            System.out.println( a + " Lebih kecil dari " + b);
        else
            System.out.println( a + " Sama dengan " + b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        char ulangi;
        int bil1,bil2;
        
        System.out.println("========== Program Perbandingan Nilai ==========");
        do {            
            System.out.print("\nMasukan nilai pertama\t: ");
            bil1 = scan.nextInt();
            System.out.print("Masukan nilai kedua\t: ");
            bil2 = scan.nextInt();
            perbandingan(bil1, bil2);
            System.out.print("\nUlangi Aktifitas?(y/t)\t: ");
            ulangi = scan.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');
    }
    
}
