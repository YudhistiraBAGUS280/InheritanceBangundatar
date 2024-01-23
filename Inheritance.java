/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompan.inheritance;
import java.util.Scanner;
public class Inheritance  {
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        Bangundatar BangunDatar= new Bangundatar();

        persegi Persegi= new persegi();
         Persegi.sisi=2;
         
         
         lingkaran Lingkaran = new lingkaran();
         Lingkaran.r=22;
        
         persegipanjang Persegipanjang= new persegipanjang();
       Persegipanjang.panjang=8;
       Persegipanjang.lebar =4;
        
       segitiga Segitiga= new segitiga();
       Segitiga.alas=12;
       Segitiga.tinggi= 8;
       
       BangunDatar.luas();
       BangunDatar. keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
      Lingkaran.luas();
      Lingkaran.keliling();
      
      Persegipanjang.luas();
      Persegipanjang.keliling();
      
      Segitiga.luas();
      Segitiga.keliling();
      
      
       
       
       
       
       
    }
}






 