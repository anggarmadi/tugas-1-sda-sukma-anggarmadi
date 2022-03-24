package Konsep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class coba1 {
    public static void main(String[] args) {
        int n=10, m=10,x=0,y=0,z=0; 
        int jumsuper=300, jumbiasa=300;
        int []pesanantelur = new int[50];
        String []jenisTelur = new String[50];
        
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
            System.out.println("5. Tambah Persediaan");
            System.out.println("6. Keluar Program");
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

                    if(pilihan==1){
                        System.out.println("Inputkan jumlah telur yang akan dibeli");
                        System.out.print("Jumlah(butir): ");
                        int beli = pilih.nextInt();
                        int bayar;
                        if(beli<jumbiasa){
                            pesanantelur[x]=beli;
                            jenisTelur[y]="telur biasa";
                            jumbiasa=jumbiasa-beli;
                            x++; y++;
                            System.out.println("Terima kasih, silahkan lakukan pembayaran");
                            System.out.println("Total harga :Rp."+beli*hbiasa);
                        }else{
                            System.out.println("Maaf, Persediaan telur tidak cukup");
                            System.out.println("Harap isi ulang stok");
                            break;
                        }
                        
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
                        if(beli<jumbiasa){
                            pesanantelur[x]=beli;
                            jenisTelur[y]="telur super";
                            jumsuper=jumsuper-beli;
                            x++; y++;
                            System.out.println("Terima kasih, silahkan lakukan pembayaran");
                            System.out.println("Total harga :Rp."+beli*hsuper);
                        }else{
                            System.out.println("Maaf, Persediaan telur tidak cukup");
                            System.out.println("Harap isi ulang stok");
                            break;
                        }
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
                    pembeli.poll();
                    System.out.println("Jumlah pesanan:");
                    System.out.println(pesanantelur[z]+" Butir Telur");
                    if(jenisTelur[z]=="telur biasa"){
                        int b = telur1.size()-1;
                        int ambil=pesanantelur[z];
                        if(ambil<(telur1.get(b))){
                            telur1.set(b, (telur1.get(b))-ambil);    
                        }else if(ambil==(telur1.get(b))){
                            telur1.pop();
                        }else{
                            while(ambil>(telur1.get(b))){
                                ambil=ambil-telur1.get(b);
                                telur1.pop();
                                b--;
                            }
                            telur1.set(b, (telur1.get(b))-ambil);
                        }
                    } else if(jenisTelur[z]=="telur super"){
                        int b = telur2.size()-1;
                        int ambil=pesanantelur[z];
                        if(ambil<(telur2.get(b))){
                            telur2.set(b, (telur2.get(b))-ambil);    
                        }else if(ambil==(telur2.get(b))){
                            telur2.pop();
                        }else{
                            while(ambil>(telur2.get(b))){
                                ambil=ambil-telur2.get(b);
                                telur2.pop();
                                b--;
                            }
                            telur2.set(b, (telur2.get(b))-ambil);
                        }
                    }
                    
                    z++;
                    break;
                
                case 3:
                    System.out.println("Stok telur biasa: "+telur1);
                    System.out.println("Stok telur biasa: "+jumbiasa);
                    System.out.println("Stok telur super: "+telur2);
                    System.out.println("Stok telur super: "+jumsuper);
                    break;

                case 4:
                    System.out.println("Daftar antrian :"+pembeli);
                    pilih.next();
                    break;

                case 5:
                    System.out.println("Pilih jenis telur yang akan diisi:");
                    System.out.println("1. Telur Biasa");
                    System.out.println("2. Telur Super");
                    int stok = pilih.nextInt();
                    if(stok==1){
                        System.out.println("Jumlah(karpet): ");
                        int tambah = pilih.nextInt();
                        if(tambah>0){
                            for(int i=0;i<tambah;i++){
                                telur1.add(30);
                            }
                        }else {
                            System.out.println("Nilai tidak valid");
                        }
                    } else if(stok==2){
                        System.out.println("Jumlah(karpet): ");
                        int tambah = pilih.nextInt();
                        if(tambah>0){
                            for(int i=0;i<tambah;i++){
                                telur2.add(30);
                            }
                        }else {
                            System.out.println("Nilai tidak valid");
                        }
                    } else {
                        System.out.println("Maaf, Pilihan tidak tersedia");
                    }
                    break;
                    case 6:
                        finish++;
                        break;
                    
                    default:
                        System.out.println("Error!!");
            }



        } while(finish==-1);
        
    

    }
}
