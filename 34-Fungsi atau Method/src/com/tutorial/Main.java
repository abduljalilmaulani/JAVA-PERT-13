/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 * @author Abdul Jalil Maulani
 * NAMA                 : Abdul Jalil Maulani
 * KELAS                : TI -1B
 * NIM                  : A2.1900002
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // y = (x + 2) * x

        int y,x;
        x = 5;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

    }

    public static int hitung(int input){
        int hasil;

//        hasil = (input + 2) * input;
        hasil = input * input;

        return hasil;
    }
    
}
