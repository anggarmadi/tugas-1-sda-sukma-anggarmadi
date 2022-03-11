package Tugas2;

import java.rmi.server.RemoteServer;
import java.util.LinkedList;

public class tugas {
    public static void main(String[] args) {
        LinkedList <String> nama = new LinkedList<>();
        nama.add("S");
        nama.add("U");
        nama.add("K");
        nama.add("M");
        nama.add("A");
        nama.add(" ");
        nama.add("A");
        nama.add("N");
        nama.add("G");
        nama.add("G");
        nama.add("A");
        nama.add("R");
        nama.add("M");
        nama.add("A");
        nama.add("D");
        nama.add("I");
        System.out.println("1.Isinya :"+nama);

        //menambahkan elemen
        nama.add(5,"R");
        nama.add(6,"Z");
        nama.add(7,"Y");
        System.out.println("2.Isinya :"+nama);

        //menimpa elemen
        nama.set(7, "T");
        nama.set(18, "Y");
        System.out.println("3.Isinya :"+nama);

        //menghapus elemen
        nama.remove(2);
        nama.remove(1);
        nama.remove(4);
        System.out.println("4.Isinya :"+nama);

        //pop dan push
        nama.push(".");
        nama.push("R");
        nama.push("D");
        nama.push("C");
        System.out.println("5.Isinya :"+nama);

        nama.pop();
        System.out.println("6.Isinya :"+nama);
    }
}
