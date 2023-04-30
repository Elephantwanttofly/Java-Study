public class tugas_3 {
    public static void main(String[] args) {
        double a = 2, b = 4, c = 8, hasil1, hasil2;
        
        hasil1 = (Math.pow(a, c)) + (Math.pow(b, a));
        hasil2 = (Math.pow(a, a)) + (Math.pow(b, a)) / (Math.pow(a, a));

        System.out.println("Hasil dari soal A adalah = " + hasil1);
        System.out.println("Hasil dari soal B adalah = " + hasil2);
        
    }
}
