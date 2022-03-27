package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Junal04 {
    public static void main(String[] args) {
        LinkedList<String> aa = new LinkedList<String>();
        Scanner bb = new Scanner(System.in);
        int ulang = 0;
        while (ulang != 4) {
            System.out.println("Operasi dalam Linked List");
            System.out.println("1. Input Lagu \n"
                    + "2. Hapus Lagu \n"
                    + "3. Mainkan Lagu \n"
                    + "4. Keluar");
            System.out.println("Pilih operasi : ");
            int pilih = bb.nextInt();

            switch (pilih){
                case 1 :
                    System.out.println("Menu operasi : \n"
                            + "1. Penambahan diawal \n"
                            + "2. Penambahan diakhir");
                    System.out.println("Pilih model penambahan : ");
                    int pilih_tam = bb.nextInt();
                    switch (pilih_tam){
                        case 1 :
                            System.out.print("Masukkan lagu yang akan ditamnbahkan diawal \n");
                            String tambah = bb.next();
                            aa.addFirst(tambah);
                            break;
                        case 2 :
                            System.out.print("Masukkan lagu yang akan ditambahkan diakhir \n");
                            tambah = bb.next();
                            aa.addLast(tambah);
                            break;
                        default:
                            break;
                    }break;
                case 2 :
                    System.out.println("Menu operasi hapus: \n"
                            + "1. Hapus lagu yang diinginkan (Penulisan harus tepat) \n"
                            + "2. Hapus lagu diawal playlist \n"
                            + "3. Hapus terakhir dimasukkan");
                    System.out.println("Pilih model hapus : ");
                    int pilih_hap = bb.nextInt();
                    switch (pilih_hap){
                        case 1 :
                            System.out.print("Masukkan lagu yang akan dihapus \n");
                            String hapus = bb.next();
                            aa.remove(hapus);
                            break;
                        case 2 :
                            aa.removeFirst();
                            break;
                        case 3 :
                            aa.removeLast();
                            break;
                        default:
                            break;
                    }break;
                case 3 :
                    System.out.println("Saya cukup bingung disini bu :( ");
                    break;
            }
            ulang = pilih;
        }
    }
}