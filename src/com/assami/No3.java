package com.assami;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.*;

public class No3 {
    public static void main(String[]args){

        try {
            FileOutputStream out = new FileOutputStream("D:\\/Text3.txt");
            PrintStream p = new PrintStream(out);
            String[] npm = new String[100];
            String[] nama = new String[100];
            int[] nilai = new int[10];
            Scanner input = new Scanner(System.in);
            String huruf = "Kosong";
            int total = 0;

            System.out.println();
            System.out.print("Jumlah Data : "); int data = input.nextInt();
            System.out.println("-------------------------------------------");


            for(int i = 1; i<= data; i++){
                System.out.print("NPM   \t: "); npm[i] = input.next();
                System.out.print("Nama  \t: "); nama[i] = input.next();
                System.out.print("Nilai \t: "); nilai[i] = input.nextInt();
                System.out.println();
                total = total+nilai[i];

            }

            p.println("No\t\t"+"NPM\t\t"+"Nama\t\t"+"Nilai\t\t"+"Huruf");

            for(int i = 1; i<= data; i++){

                if(nilai[i] >90) huruf = "A";
                else if(nilai[i]>=80) huruf = "A-";
                else if(nilai[i]>=76) huruf = "B+";
                else if(nilai[i]>=72) huruf = "B";
                else if(nilai[i]>=68) huruf = "B-";
                else if(nilai[i]>=62) huruf = "C+";
                else if(nilai[i]>=56) huruf = "C";
                else if(nilai[i]>=45) huruf = "D";
                else if(nilai[i]>=0) huruf = "E";
                else System.out.println("Error");



                p.println(i+"\t\t"+npm[i]+"\t\t"+nama[i]+"\t\t"+nilai[i]+"\t\t"+huruf);
            }

            p.println();
            p.println("Jumlah Mahasiswa\t\t"+data);
            p.println("Nilai Rata Rata \t\t"+total/data);

            System.out.println("-------------------------------------------");
            System.out.println("Selesai Menulis Ke File");

        } catch (Exception e){
            System.out.println("Error" +e.getMessage());
        }



    }
}
