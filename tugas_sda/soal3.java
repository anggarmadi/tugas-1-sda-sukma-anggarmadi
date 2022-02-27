package com.tugas_sda;
import java.util.Arrays;
public class soal3 {
    public static void main(String[] args) {
        String nama[] = {"m","a","d","i"};

         //get
         int indeks = nama.length;
         System.out.println("\nget():");
         System.out.println("First element of the Array: "+Arrays.asList(nama).get(0));
         System.out.println("Third element of the Array: "+Arrays.asList(nama).get(2));
         if(indeks>=7){
             System.out.println("Seventh element of the Array: "+Arrays.asList(nama).get(6));
         }
         if(indeks==-3){
             System.out.println("-3 element of the Array: "+Arrays.asList(nama).get(-3));
         }
    }
    
}
