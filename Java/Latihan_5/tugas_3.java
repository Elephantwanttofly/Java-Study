package Latihan_5;

import java.util.Arrays;

public class tugas_3 {
    public static void main(String[] args) {
        int[] a = {12, 8, 100, -45, 3, -1};
        int min = a[0], max = a[0];
        Arrays.sort(a);
        System.out.println("Array setelah diurutkan: " + (Arrays.toString(a)));
        System.out.println("Jumlah bilangan array: " + a.length);

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Nilai min dari arrays diatas: " + min);
        System.out.println("Nilai max dari arrays diatas: " + max);

    }
}
