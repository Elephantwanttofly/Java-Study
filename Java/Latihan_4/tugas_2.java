package Latihan_4;

import java.util.Scanner;

public class tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in;
        System.out.print("Masukan angka: ");
        in = input.nextInt();

        for (int i = 1; i <= in; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " Adalah angka Genap ");
            } else {
                System.out.println(i + " Adalah angka Ganjil ");
                
            }
            
        }

    }
}
