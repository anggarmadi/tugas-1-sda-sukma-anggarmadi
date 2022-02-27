package com.tugas_sda;
import java.util.ArrayList;

public class soal5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("m");
        nama.add("a");
        nama.add("d");
        nama.add("i");

        nama.remove(0);
        System.out.println(nama);

        nama.remove(2);
        System.out.println(nama);

        nama.remove(3);
        System.out.println(nama);

           
    }
}
