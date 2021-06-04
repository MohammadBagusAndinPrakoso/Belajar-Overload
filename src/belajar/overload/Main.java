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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataDiri data = new DataDiri();
        data.dataNama("Bagus");
        data.dataKelas("XR2");
        data.dataAbsen(15);
        
        Makan makan = new Makan();
        makan.makanan("Tempe Kacang", "Tahu Penyet");
        makan.makanan("Ayam Goreng", "Bebek Bakar","Nasi Goreng");
    }
    
}
