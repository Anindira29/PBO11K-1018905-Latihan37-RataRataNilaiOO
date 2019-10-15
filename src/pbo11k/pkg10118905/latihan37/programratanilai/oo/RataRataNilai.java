/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan37.programratanilai.oo;
import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program rata-rata nilai
 */
public class RataRataNilai {
    private static Scanner input = new Scanner (System.in);
    private int jumlahMahasiswa;
    private int nilaiSatuan;
    private int totalNilai;
    private double avNilai;
    private void masukanNilai(int varJumlahMahasiswa){
        for(int i=1;i<=varJumlahMahasiswa;i++){
            System.out.println("Nilai Mahasiswa ke-"+i+" ");
            nilaiSatuan = input.nextInt();
            totalNilai = totalNilai + nilaiSatuan;
        }
        avNilai = (double) totalNilai / varJumlahMahasiswa;
        System.out.println("");
        System.out.println("Maka, rata-rata nilainya adalah "+ avNilai);
        System.out.println(("Developed by : anindira"));
    }    
    public void hitungRataRataNilai(int varJumlahMahasiswa){
            jumlahMahasiswa = varJumlahMahasiswa;
            masukanNilai(jumlahMahasiswa);
    }
}

