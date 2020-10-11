package com.assami;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String mahasiswa[] = new String[100];

    public static void main(String[] args)
    {
        System.out.println("Pilih Menu : ");
        System.out.println();

        do{
            pilihMenu();
        }while (true);
    }

        static void pilihMenu()
        {
            System.out.println("1.Perkalian");
            System.out.println("2.Pembagian");
            System.out.println("3.Input Mahasisawa");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Pilih Menu = ");
            int menu = input.nextInt();
            System.out.println();
            switch(menu)
            {
                case 1 :
                    perkalianSwitch();
                    break;

                case 2 :
                    pembagianSwitch();
                    break;

                case 3 :
                    array();
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Masukan Pilihan Anda Dengan Benar");
            }
        }

        static int perkalianSwitch ()
        {
            int a,b,luas;
            System.out.println("--Perkalian--");
            System.out.print("Masukan a = "); a = input.nextInt();
            System.out.print("Masukan b = "); b = input.nextInt();
            luas = a*b;
            System.out.println("Hasil = "+luas);
            System.out.println();
            return luas;
        }

        static double pembagianSwitch()
        {
            int a,b;
            double pembagian;
            System.out.println("--Pembagian--");
            System.out.print("Masukan Nilai a = "); a = input.nextInt();
            System.out.print("Masukan Nilai b = "); b = input.nextInt();
            pembagian = a/b;
            System.out.println("Hasil = "+ pembagian);
            System.out.println();
            return pembagian;
        }

        static void array()
        {
            int i;
            System.out.println("-Data Mahasiswa-");
            System.out.println();
            System.out.print("Jumlah Mahasiswa Yang ingin Di Input = ");
            int angka = input.nextInt();
            for (i = 1 ; i <= angka ; i++)
            {

                System.out.print("Nama = ");
                mahasiswa[i] = input.next();
            }
            System.out.println();
            System.out.println("Nama Mahasiswa Yang Anda Input = ");

            for (i= 1 ; i<= angka ; i++)
            {
                System.out.println(mahasiswa[i]);

            }
            System.out.println();
        }

}
