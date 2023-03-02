/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbo1;

/**
 *
 * @author RYZEN 5
 */
public class menghitung {
    //keliling lingkaran
    
        public static void main(String[] args){
        int diameter = 10;
        double keliling = 3.14 * diameter;
        System.out.println("keliling lingkaran :" + keliling + "\n");
    // luas segitiga siku siku  
    
        int alas = 6;
        int tinggisegitiga =  8;
        double Luas = alas * tinggisegitiga /2 ;
        System.out.println("luas segitiga siku siku :" + Luas + "\n");
    // volume tabung
    
        int diametertabung = 5;
        double rtabung = diametertabung/2;
        int tinggitabung =  10;
        double volume = 3.14 * rtabung * rtabung * tinggitabung ;
        System.out.println("volume tabung :" + volume + "\n");
    }
}
