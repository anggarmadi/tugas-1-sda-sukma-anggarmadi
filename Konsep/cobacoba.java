package Konsep;

import java.util.Stack;
import java.util.Scanner;

public class cobacoba {
    public static void main(String[] args) {
        int a=-1,b;
        Scanner jumlah = new Scanner(System.in);
        Stack<Integer> test = new Stack<>();
        test.add(10);
        test.add(40);
        test.add(70);
        test.add(40);
        test.add(20);
        test.add(30);
        System.out.println(test);
        
        System.out.println(test.peek());
        do{
            b=test.size()-1;
            System.out.print("Ambil berapa: ");
            int beli = jumlah.nextInt();
            if(beli<(test.get(b))){
                test.set(b, (test.get(b))-beli);
            } else if(beli==(test.get(b))){
                test.pop();
            }else if(beli>(test.get(b))){
                beli=beli-test.get(b);
                test.pop();
                test.set(b-1, (test.get(b-1))-beli);
            }
            
            System.out.println("Hasil: "+test);
        }while(a==-1);
        


    }
    
}
