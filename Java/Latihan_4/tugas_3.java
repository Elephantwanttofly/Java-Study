package Latihan_4;

import java.util.Scanner;

public class tugas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, j = 0;
        System.out.println("Inputkan Bilangan: ");
        nilai = input.nextInt();

        for (int i = 1; i <= nilai; i++) {
            j = nilai + j;           
        }
        System.out.println("Jumlah total Bilangan anda: " + j);
    }
}
