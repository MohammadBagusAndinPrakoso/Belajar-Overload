/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.overload;

/**
 *
 * @author MOKLET1
 */
public class DataDiri {
    String nama, kelas;
    int absen;
    
    void dataNama(String nama){
        this.nama = nama;
        System.out.println("Nama : " +nama);    
    }
    
    void dataKelas(String kelas){
        this.kelas = kelas;
        System.out.println("kelas : " +kelas);    
    }
    
    void dataAbsen(int absen){
        this.absen = absen;
        System.out.println("No. Absen : " +absen);    
    }
}
