package com.assami;

import java.util.Scanner;
import java.io.*;

public class No2 {
    public static void main(String[]args){

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("D:\\/Text2.txt");
            PrintStream p = new PrintStream(out);
            String[] npm = new String[100];
            String[] nama = new String[100];
            int[] nilai = new int[10];
            Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.print("Jumlah Data : "); int data = input.nextInt();
            System.out.println("-------------------------------------------");


            for(int i = 1; i<= data; i++){
                System.out.print("NPM   \t: "); npm[i] = input.next();
                System.out.print("Nama  \t: "); nama[i] = input.next();
                System.out.print("Nilai \t: "); nilai[i] = input.nextInt();
                System.out.println();
            }

            for(int i = 1; i<= data; i++){
                p.println(npm[i]+"|"+nilai[i]+"|"+nama[i]);
            }
            System.out.println("-------------------------------------------");
            System.out.println("Selesai Menulis Ke File");

        } catch (Exception e) {
            System.out.println("Error" +e.getMessage());
        }

    }
}