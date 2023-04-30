package Latihan_2;

import javax.swing.*;

public class tugas_3 {
    public static void main(String[] args) {
        double a1, a2, b1, b2, jumlah;
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Bilangan 1"));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan pangkat 1"));
        b1 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Bilangan 2"));
        b2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan pangakat 2"));

        jumlah = (Math.pow(a1, a2)) + (Math.pow(b1, b2));
        JOptionPane.showMessageDialog(null, jumlah);


    }
}
