package Latihan_3;

import java.util.Scanner;

public class tugas_3 {
    public static void main(String[] args) {
        int pilihan, pesanan, harga = 0, total;
        String nama;

        Scanner input = new Scanner(System.in);
        System.out.print("Nama pesanan: ");
        nama = input.nextLine();

        System.out.println("Silakan pilih menu makanan yang tersedia: ");
        System.out.println("Menu:\n1. Ayam Geprek\n2. Bakso\n3. Soto Daging");
        System.out.print("Masukan pilihan anda: ");
        pilihan = input.nextInt();
        System.out.print("Jumlah pesanan: ");
        pesanan = input.nextInt();
        switch (pilihan) {
            case 1: System.out.println("Menu yang dipilih: Ayam Geprek");
                harga = 12000;
                break;
            case 2: System.out.println("Menu yang dipilih: Bakso");
                harga = 10000;
                break;
            case 3: System.out.println("Menu yang dipilih: Soto Daging");
                harga = 15000;
                break;
            default: System.out.println("Pilihan yang anda masukan tidak ada!!!");
                break;
        }
        total = pesanan * harga;
        System.out.println("=================================");
        System.out.println("Nama pesanan: " + nama);
        System.out.println("Menu yang dipilih: " + pilihan);
        System.out.println("Jumlah pesanan: " + pesanan);
        System.out.println("Total harga: " + total);

    }
}
