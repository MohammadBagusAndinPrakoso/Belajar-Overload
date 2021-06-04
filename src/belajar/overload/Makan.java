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
public class Makan {
    void makanan(String a, String b) {
        System.out.println(a + ", " +b);
    }
    
    void makanan(String a, String b, String c){
        System.out.println(a + ", " +b + ", " +c);
    }
}
