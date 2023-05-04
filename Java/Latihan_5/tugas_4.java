package Latihan_5;

public class tugas_4 {
    public static void main(String[] args) {
        int[] a = {6, 5, 7, 4}, b = {2, 3, 1, 3};
        int[] total = new int [5];
        
        total[0] = (a[0] - b[0]);
        total[1] = (a[1] - b[1]);
        total[2] = (a[2] - b[2]);
        total[3] = (a[3] - b[3]);

        System.out.println(total[0] + " " + total[1]);
        System.out.println(total[1] + " " + total[3]);

    }
}
