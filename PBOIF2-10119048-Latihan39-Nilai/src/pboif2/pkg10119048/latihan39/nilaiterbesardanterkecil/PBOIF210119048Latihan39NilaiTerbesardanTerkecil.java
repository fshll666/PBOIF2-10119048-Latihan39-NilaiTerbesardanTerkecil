/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        Petugas petugas = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil " +
                "Nilai Mahasiswa=====");
        
        //input petugas
        System.out.print("Masukan Nama Petugas : ");
        petugas.setNama(scanner.next());
        
        //input banyak mahasiswa
        System.out.print("Masukan Banyak Nilai Mahasiswa : ");
        nilaiMhs.setJmlMahasiswa(scanner.nextInt());
        
        //input nilai per-mahasiswa
        for(int i = 0; i < nilaiMhs.getJmlMahasiswa(); i++){
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " = ");
            nilaiMhs.setNilai(scanner.nextInt());
        }
        
        nilaiMhs.tampilNilai();
        System.out.println("\nPetugas : " + petugas.getNama());
        
    }
    
}
