package Latihan_4;

import java.util.Scanner;

public class tugas1_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;

        System.out.print("Masukan nama anda: ");
        nama = input.nextLine();

        for (int i = 0; i <= 100; i++ ) {
            System.out.println(nama + " Yang Ke- " + i);
        }
    }
}
