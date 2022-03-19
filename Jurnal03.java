package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Jurnal03 {
    String nip, nama, divisiPegawai;
    public static Scanner in = new Scanner(System.in);
    public static Scanner string = new Scanner(System.in);
    public static void main(String[] args){
        LinkedList <String> aa = new LinkedList<String>();
        Scanner bb = new Scanner(System.in);
        int ulang = 0;
        while(ulang !=4 ){
            System.out.println("Operasi dalam Linked List");
            System.out.println("1. Penambahan data \n"
                    + "2. Hapus data \n"
                    + "3. Cetak list data \n"
                    + "4. Keluar");

            System.out.println("Pilih operasi : ");
            int pilih = bb.nextInt();

            switch (pilih){
                case 1 :
                    System.out.println("Menu operasi : \n"
                            + "1. Penambahan \n"
                            + "2. Penambahan diawal \n"
                            + "3. Penambahan diakhir");
                    System.out.println("Pilih model penambahan : ");
                    int pilih_tam = bb.nextInt();
                    switch (pilih_tam){
                        case 1 :
                            System.out.print("Masukkan data yang akan ditambahkan \n");
                            System.out.print("Tuliskan nip, nama, divisi pegawai");
                            String tambah = bb.next();
                            String tambah1 = bb.next();
                            String tambah2 = bb.next();
                            aa.add(tambah);
                            break;
                        case 2 :
                            System.out.print("Masukkan data yang akan ditamnbahkan diawal \n");
                            System.out.print("Tuliskan nip, nama, divisi pegawai");
                            tambah = bb.next();
                            tambah1 = bb.next();
                            tambah2 = bb.next();
                            aa.addFirst(tambah);
                            break;
                        case 3 :
                            System.out.print("Masukkan data yang akan ditambahkan diakhir \n");
                            System.out.print("Tuliskan nip, nama, divisi pegawai");
                            tambah = bb.next();
                            tambah1 = bb.next();
                            tambah2 = bb.next();
                            aa.addLast(tambah);
                            break;
                        default:
                            break;
                    }break;
                case 2 :
                    System.out.println("Menu operasi hapus: \n"
                            + "1. Hapus \n"
                            + "2. Hapus diawal \n"
                            + "3. Hapus diakhir");
                    System.out.println("Pilih model hapus : ");
                    int pilih_hap = bb.nextInt();
                    switch (pilih_hap){
                        case 1 :
                            String hapus = "";
                            aa.remove();
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