public class tugas_2 {
    public static void main(String[] args) {
        int biayaOP, bonus, kar1, kar2, kar3, potongan1, potongan2, pengeluaranPerusahaan;

        biayaOP = 5_500_000;

        bonus = 6_000_000 * 15/100;
        kar1 = 6_000_000 + bonus;

        potongan1 = 7500_000 * 10/100;
        kar2 = 7500_000 - potongan1;

        potongan2 = 10_500_000 * 12/100;
        kar3 = 10_500_000 - potongan2;

        pengeluaranPerusahaan = biayaOP + kar1 + kar2 + kar3;
        System.out.println("gaji = " + kar1);

        System.out.println("Pengeluaran Perusahaan setiap bulan adalah = " + pengeluaranPerusahaan);



    }
}
