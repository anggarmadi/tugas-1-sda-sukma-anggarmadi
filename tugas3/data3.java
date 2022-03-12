package tugas3;

import java.util.LinkedList;
import java.util.Scanner;

public class data3 {
    public static void main(String[] args) {

        int i = 0;
    
        LinkedList <String> nama = new LinkedList<>();
        LinkedList <String> no_bp = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();


        Scanner jumlah = new Scanner(System.in);
        Scanner data = new Scanner(System.in);

        System.out.println("Selamat datang di Program Data Mahasiswa");
        System.out.println("Silahkan masukan jumlah mahasiswa yang akan diinputkan");
        System.out.print("Jumlah mahasiswa: ");
        int input = jumlah.nextInt();
        while(i<input){
            System.out.print("Masukan nama: ");
            String nama1 = data.nextLine();
            nama.add(nama1);
            System.out.print("Masukan NIM: ");
            String nim = data.nextLine();
            no_bp.add(nim);
            System.out.print("Masukan Alamat: ");
            String lokasi = data.nextLine();
            alamat.add(lokasi);
            i++;
        }
        System.out.println("Data telah tersimpan");
        System.out.println("Apa selanjutnya?");
        System.out.println("1. Cari Data berdasarkan urutan");
        System.out.println("2. Selesai");
        int pilih = jumlah.nextInt();
        if(pilih==1){
            System.out.print("Masukan urutan: ");
            int cari = jumlah.nextInt();
            if(cari<=input){
                System.out.println("Nama: "+nama.get(cari-1));
                System.out.println("NIM: "+no_bp.get(cari-1));
                System.out.println("Alamat: "+alamat.get(cari-1));
            }else{
                System.out.println("Nilai tidak sesuai");
            }
        }
        
        




    }
    
}
