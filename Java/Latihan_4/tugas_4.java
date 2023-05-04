import java.util.Scanner;

public class tugas_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        double ipk;
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + i);
            System.out.print("Masukkan nama: ");
            String nama = input.next();
            System.out.print("Masukkan IP semester 1: ");
            double ip1 = input.nextDouble();
            System.out.print("Masukkan IP semester 2: ");
            double ip2 = input.nextDouble();
            System.out.print("Masukkan IP semester 3: ");
            double ip3 = input.nextDouble();
            ipk = (ip1 + ip2 + ip3) / 3;
            System.out.println("IPK " + nama + " adalah " + ipk);
        }
    }
}