/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan23.nilaimaxdanmin;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Menghitung nilai Max dan Min mahasiswa
 */
public class IF110118042Latihan23NilaiMaXdanMin {

    public static void main(String[] args) {
String nama;
        int jumlahMhs;
        int[] nilaiMhs = new int[10];
        int terbesar = 0;
        int terkecil = 100;
        
        //input 
        System.out.println("==========PROGRAM NILAI TERBESAR DAN TERKECIL MAHASISWA==========");
        System.out.print("Masukkan nama petugas : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        Scanner tempJmlh = new Scanner(System.in);
        jumlahMhs =  tempJmlh.nextInt();
        
        //proses
        for (int i = 1;i <= jumlahMhs;i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + i + " : ");
            Scanner tempNilai = new Scanner(System.in);
            nilaiMhs[i] = tempNilai.nextInt();
            if(nilaiMhs[i] > terbesar ){
                 terbesar = nilaiMhs[i];
            } 
           if(nilaiMhs[i] < terkecil){
               terkecil = nilaiMhs[i];
           }
                  
        }
          System.out.println();
        //output
        System.out.println("======HASIL NILAI MAHASISWA======");
        for (int i = 1;i <= jumlahMhs;i++){
            System.out.println("Nilai Mahasiswa Ke - " + i + " = " + nilaiMhs[i]);
            
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah\t: " + terbesar);
        System.out.println("Nilai Terkecil adalah   : "  + terkecil);
        System.out.println();
        System.out.println("Petugas : " + nama);
        
        
                
    }
    
}