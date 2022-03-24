package Konsep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class coba1 {
    public static void main(String[] args) {
        int n=10, m=10,x=0,y=0; 
        int jumsuper=300, jumbiasa=300;
        int []pesanantelur = new int[50];
        
        Queue<String> pembeli = new LinkedList<>();
        Stack<Integer> telur1 = new Stack<>();
        Stack<Integer> telur2 = new Stack<>();
        Scanner pilih = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        int finish=-1;
        //int telurBiasa, telurSuper;
        int hbiasa=2000, hsuper=2500;

        for(int i=1; i<=10;i++){
            telur1.add(30);
            telur2.add(30);
        }
        System.out.println("Stok telur biasa:"+telur1);
        System.out.println("Stok telur super:"+telur2);
                 
        do{
            System.out.println("********************************");
            System.out.println("     PROGRAM KEDAI TELUR K1");
            System.out.println("");
            System.out.println("********************************");
            System.out.println("Silahkan pilih diantara menu berikut: ");
            System.out.println("");
            System.out.println("1. Pesan Telur");
            System.out.println("2. Panggil Pemesan");
            System.out.println("3. Cek Persediaan Telur");
            System.out.println("4. Daftar Antrian");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih menu: ");
            int menu = pilih.nextInt();

            switch(menu){
                case 1:
                    System.out.println("----Pesan Telur----");
                    System.out.println("Silahkan Inputkan:");
                    System.out.print("Nama :");
                    String nama = string.nextLine();

                    System.out.println("Silahkan pilih jenis telur");
                    System.out.println("1. Telur Biasa (Rp. 2000/butir)");
                    System.out.println("2. Telur Super (Rp. 2500/butir)");
                    System.out.print("Pilih: ");
                    int pilihan = pilih.nextInt();

                    if(pilihan==1 && pilihan<jumbiasa){
                        System.out.println("Inputkan jumlah telur yang akan dibeli");
                        System.out.print("Jumlah(butir): ");
                        int beli = pilih.nextInt();
                        pesanantelur[x]=beli;
                        x++;
                        System.out.println("Terima kasih, silahkan lakukan pembayaran");
                        System.out.println("Total harga :Rp."+beli*hbiasa);
                        int bayar;
                        do{
                            System.out.print("Bayar: ");
                            bayar = pilih.nextInt();
                            if(bayar<beli*hbiasa)
                                System.out.println("Maaf, uang yang anda inputkan kurang");    
                        }while(bayar<beli*hbiasa);
                        System.out.print("Kebalian :Rp. "+(bayar-beli*hbiasa));
                        pembeli.add(nama);
                        System.out.println("");
                    }else if(pilihan==2 && pilihan<jumsuper){
                        System.out.println("Inputkan jumlah telur yang akan dibeli");
                        System.out.print("Jumlah(butir): ");
                        int beli = pilih.nextInt();
                        pesanantelur[x]=beli;
                        x++;
                        System.out.println("Terima kasih, silahkan lakukan pembayaran");
                        System.out.println("Total harga :Rp."+beli*hsuper);
                        int bayar;
                        do{
                            System.out.print("Bayar: ");
                            bayar = pilih.nextInt();
                            if(bayar<beli*hsuper)
                                System.out.println("Maaf, uang yang anda inputkan kurang");    
                        }while(bayar<beli*hsuper);
                        System.out.print("Kebalian :Rp. "+(bayar-beli*hsuper));
                        pembeli.add(nama);
                        System.out.println("");
                    }else{
                        System.out.println("Maaf, pilihan tidak tersedia");
                    }
                    break;
                
                case 2:
                    System.out.println("Pesanan atas nama:"+pembeli.peek());
                    System.out.println("Jumlah pesanan:");
                    System.out.println(pesanantelur[y]+" Butir Telur");
                    
                    y++;
                    break;
                case 4:
                    System.out.println("Daftar antrian :"+pembeli);
                    pilih.next();
                    break;


            }


        } while(finish==-1);
        
    

    }
}
