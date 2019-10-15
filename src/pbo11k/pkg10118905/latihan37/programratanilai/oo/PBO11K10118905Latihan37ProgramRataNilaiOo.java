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
 * Deskripsi: Program rata rata nilai
 */
public class PBO11K10118905Latihan37ProgramRataNilaiOo {
   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       RataRataNilai rrn = new RataRataNilai();
       int n;
        System.out.println("Masukkan banyak mahasiswa\t: ");
        n = input.nextInt();
        rrn.hitungRataRataNilai(n);
    }
    
}
