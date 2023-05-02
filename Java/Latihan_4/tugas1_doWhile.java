package Latihan_4;

import java.util.Scanner;

public class tugas1_doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        String nama;

        System.out.print("Masukan nama anda: ");
        nama = input.nextLine();

        do {
            System.out.println(nama + " Yang Ke- " + i);
            i++;
        } while (i <= 100);
    }
}
