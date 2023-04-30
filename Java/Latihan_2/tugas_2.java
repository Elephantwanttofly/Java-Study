package Latihan_2;

import java.util.Scanner;

public class tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double biayaOP, kar1, kar2, kar3, pengeluaranPerusahaan, total1, total2, total3;
        double bonus1, bonus2, bonus3;
        String nama1, nama2, nama3;

            System.out.print("Masukan nama karyawan 1 = ");
            nama1 = input.next();
            System.out.print("Masukan gaji karyawan 1 = ");
            kar1 = input.nextDouble();
            System.out.print("Masukan bonus karyawan 1 = ");
            bonus1 = input.nextDouble();

            System.out.print("Masukan nama karyawan 2 = ");
            nama2 = input.next();
            System.out.print("Masukan gaji karyawan 2 = ");
            kar2 = input.nextDouble();
            System.out.print("Masukan bonus karyawan 2 = ");
            bonus2 = input.nextDouble();

            System.out.print("Masukan nama karyawan 3 = ");
            nama3 = input.next();
            System.out.print("Masukan gaji karyawan 3 = ");
            kar3 = input.nextDouble();
            System.out.print("Masukan bonus karyawan 3 = ");
            bonus3 = input.nextDouble();

            System.out.print("Berapa biaya operasional perusahaan = ");
            biayaOP = input.nextInt();

        
        bonus1 = kar1 * bonus1;
        total1 = kar1 + bonus1;

        bonus2 = kar2 * bonus2;
        total2 = kar2 + bonus2;

        bonus3 = kar3 * bonus3;
        total3 = kar3 + bonus3;

        System.out.println("Jadi gaji karyawan " + nama1 + " adalah = " + total1);
        System.out.println("Jadi gaji karyawan " + nama2 + " adalah = " + total2);
        System.out.println("Jadi gaji karyawan " + nama3 + " adalah = " + total3);

        pengeluaranPerusahaan = biayaOP + total1 + total2 + total3;

        System.out.println("Pengeluaran Perusahaan setiap bulan adalah = " + pengeluaranPerusahaan);
    }
}
