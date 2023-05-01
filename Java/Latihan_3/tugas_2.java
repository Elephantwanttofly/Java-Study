package Latihan_3;

import java.util.Scanner;

public class tugas_2 {
    public static void main(String[] args) {
        int uangJasa, komisi, PendapatanAwal, PendapatanAkhir;
        int sales = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan pendapatan = ");
        sales = input.nextInt();

        if (sales <= 2_000_000) {
            uangJasa = 100000;
            PendapatanAwal = sales + uangJasa;
            komisi = PendapatanAwal * 10/100;
            PendapatanAkhir = PendapatanAwal + komisi;
            System.out.println("Maka komisi yang anda terima adalah = " + komisi + " dengan pendapatan bersih = " + PendapatanAkhir);
        }
        else if (sales >=2_000_000 && sales >= 5000_000) {
            uangJasa = 200000;
            PendapatanAwal = sales + uangJasa;
            komisi = uangJasa * 15/100;
            PendapatanAkhir = PendapatanAwal + komisi;
            System.out.println("Maka komisi yang anda terima adalah = " + komisi + " dengan pendapatan bersih = " + PendapatanAkhir);

        }
        else if (sales > 5_000_000) {
            uangJasa = 300000;
            PendapatanAwal = sales + uangJasa;
            komisi = PendapatanAwal * 20/100;
            PendapatanAkhir = PendapatanAwal + komisi;
            System.out.println("Maka komisi yang anda terima adalah = " + komisi + " dengan pendapatan bersih = " + PendapatanAkhir);
        }
    }
    
}
