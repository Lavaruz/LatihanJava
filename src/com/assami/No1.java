package com.assami;

import java.util.Scanner;

public class No1 {
    public static void main(String[]args){

        String[] nsks = new String[100];
        String[] ndosen = new String[100];
        String[] mk = new String[100];
        Scanner input = new Scanner(System.in);
        int i;

        System.out.print("Nama : "); String nama = input.nextLine();
        System.out.print("NPM : "); long npm = input.nextLong();
        System.out.println("-------------------------------------------");
        System.out.print("Jumlah Mata Kuliah : "); int data = input.nextInt();
        System.out.println("-------------------------------------------");

        for (i=0; i < data ; i++){
            System.out.print("Kode MK : ");
            mk[i] = input.next();
            System.out.print("SKS : ");
            nsks[i] = input.next();
            System.out.print("Nama Dosen : ");
            ndosen[i] = input.next();
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        System.out.println("\t\t\t\t" +"KRS" + "\t\t\t\t");
        System.out.println("-------------------------------------------");
        System.out.println("NPM : " + npm +"\t \t \t"+ "Nama : " + nama);
        System.out.println("-------------------------------------------");
        System.out.println("Kode MK"+"\t\t"+"SKS : "+"\t\t"+"Nama Dosen : ");
        System.out.println("-------------------------------------------");

        for (i = 0; i<data ; i++){
            System.out.println(mk[i] +"\t\t\t"+ nsks[i] +"\t\t\t"+ ndosen[i]);
        }
        System.out.println();
        System.out.println("-------------------------------------------");
    }
}
