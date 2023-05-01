package Latihan_3;

import java.util.Scanner;

public class tugas_1 {
    public static void main(String[] args) {
        int Nilai;
        String nama, grade;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan nama siswa = ");
        nama = input.nextLine();
        System.out.print("Masukan nilai siswa = ");
        Nilai = input.nextInt();

        if (Nilai >= 100) {
            System.out.println("Nilai yang anda inputkan terlalu banyak!!!");
            
        } 
        else if (Nilai >= 86) {
            grade = "A";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);

        } 
        else if (Nilai <=85 && Nilai >=76) {
            grade = "B+";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);
        }
        else if (Nilai <=75 && Nilai >=66) {
            grade = "B";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);
        }
        else if (Nilai <=65 && Nilai >=56) {
            grade = "C+";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);
        }
        else if (Nilai <=55 && Nilai >=46) {
            grade = "C";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);
        }
        else if (Nilai <=45 && Nilai >=36) {
            grade = "D";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);
        }
        else if (Nilai <=35) {
            grade = "E";
            System.out.println("Nama anda adalah " + nama);
            System.out.println("Nilai anda adalah " + Nilai + " dengan grade " +grade);
        }
        
    }
}
