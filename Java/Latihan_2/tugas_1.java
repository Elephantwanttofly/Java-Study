package Latihan_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas_1 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double r1 = 0, r2 = 0, total1, total2;
        double phi = 3.14, kelili1, kelili2, Lakhir1, Lakhir2;

        System.out.println("Program menghitung luas dan keliling lingkaran");

        try {
            System.out.print("Masukan jari-jari lingkaran 1 = ");
            r1 = Integer.parseInt(input.readLine());

            System.out.print("Masukan jari-jari lingkaran 2 = ");
            r2 = Integer.parseInt(input.readLine());
        } catch (IOException e) {
            System.out.println("Program anda error");
        }

        Lakhir1 = phi * r1 * r1;
        Lakhir2 = phi * r2 * r2;        

        kelili1 = 2 * phi * r1;
        kelili2 = 2 * phi * r2;

        total1 = Lakhir1 + Lakhir2;
        total2 = kelili1 + kelili2;

        System.out.println("Total kedua luas lingkaran adalah " + total1);
        System.out.println("Total kedua keliling lingkaran adalah " + total2);
    }
}
