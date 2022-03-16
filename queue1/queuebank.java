package queue1;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class queuebank {
    int antrianTeler[];
    int antrianCS[];
    int capacity=5;
    int front = 0;
    int rear = -1;
    int currentSize = 0;
    int capacity1=5;
    int front1 = 0;
    int rear1 = -1;
    int currentSize1 = 0;
    int masukTeler=0;
    int masukCS;


    public queuebank(int batas){
        antrianTeler = new int[batas];  //deklarasi batas teler
        antrianCS = new int[batas];    //deklarasi batas CS
    }

    public void tambahTeler(int item){
        if (isTeler()){
            System.out.println("Maaf antrian sudah penuh silahkan menunggu");
        } else{
            rear++;
            antrianTeler[rear]=item;
            currentSize++;
            masukTeler++;
            System.out.println("Berhasil "+item+" adalah nomor antrian Anda");
        }
    }

    public void tambahCS(int item){
        if (isCS()){
            System.out.println("Maaf antrian sudah penuh silahkan menunggu");
        } else{
            rear1++;
            antrianCS[rear1]=item;
            currentSize1++;
            masukCS++;
            System.out.println("Berhasil "+item+" adalah nomor antrian Anda");
        }
    }

    public void panggilTeler(){
        if(isTelerEmpty()){
            System.out.println("Maaf antrian masih kosong");
        } else{
            currentSize--;
            System.out.println("Nomor antrian Teler :"+antrianTeler[front]+" Silahkan menuju Teler");
            int i=1;
            while(i<masukTeler){
                antrianTeler[i-1]=antrianTeler[i];
                i++;
            }
            masukTeler--;
            rear--;
        }
    }

    public void panggilCS(){
        if(isCSEmpty()){
            System.out.println("Maaf antrian masih kosong");
        } else{
            currentSize1--;
            System.out.println("Nomor antrian Teler :"+antrianTeler[front1]+" Silahkan menuju Teler");
            int i=1;
            while(i<masukCS){
                antrianCS[i-1]=antrianCS[i];
                i++;
            }
            masukCS--;
            rear1--;
        }
    }

    public boolean isTeler(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        } return status;
    }

    public boolean isCS(){
        boolean status = false;
        if (currentSize1 == capacity1){
            status = true;
        } return status;
    }

    public boolean isTelerEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        } return status;
    }

    public boolean isCSEmpty(){
        boolean status = false;
        if (currentSize1 == 0){
            status = true;
        } return status;
    }


    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        queuebank queue = new queuebank(5);
        int finish=0;
        int teler=0;
        int masuk=0;
        int cs=0;
        int masuk1=0;
               
        System.out.println("Selamat datang di SDA01 Bank");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        do{
            System.out.println("1. Ambil antrian Teler");
            System.out.println("2. Ambil antrian CS");
            System.out.println("3. Panggil Teler");
            System.out.println("4. Panggil CS");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Silahkan pilih tujuan Anda: ");
            int input = pilih.nextInt();

            switch(input){
                case 1:
                    masuk++;
                    if(masuk<6){
                        teler++;
                    }else{
                        masuk--;
                    }
                    queue.tambahTeler(teler);
                    
                    System.out.println("");
                    break;
                
                case 2:
                    masuk1++;
                    if(masuk1<=5){
                        cs++;
                    }else{
                        masuk1--;
                    }
                    queue.tambahCS(cs);
                    System.out.println("");
                    break;
                
                case 3:
                    queue.panggilTeler();
                    System.out.println("");
                    masuk--;
                    break;

                case 4:
                    queue.panggilCS();
                    System.out.println("");
                    masuk1--;
                    break;
                
                case 5:
                    finish++;
                    System.out.println("");
                    break;
                
                default:
                System.out.println("Pilihan tidak tersedia");

            }

        }while(finish==0);
        



    }


    



    
}
