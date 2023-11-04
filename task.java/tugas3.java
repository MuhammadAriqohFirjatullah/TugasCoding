import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tanggal : ");
        int tanggal = sc.nextInt();
        System.out.print("Bulan : ");
        int bulan = sc.nextInt();


        String zodiak = "";

        if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            zodiak = "ARIES";
        }
        else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            zodiak = "TAURUS";
        }
        else if ((bulan == 5 && tanggal >= 21) || (bulan  == 6 && tanggal <= 20)) {
            zodiak = "GEMINI";
        }
        else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            zodiak = "CANCER";
        }
        else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            zodiak = "LEO";
        }
        else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            zodiak = "VIRGO";
        }
        else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            zodiak = "LIBRA";
        }
        else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            zodiak = "SCORPIO";
        }
        else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            zodiak = "SAGITTARIUS";
        }
        else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            zodiak = "CAPRICON";
        }
        else if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            zodiak = "AQUARIUS";
        }
        else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            zodiak = "PISCES";
        }

        System.out.println("Zodiak Anda adalah: " + zodiak);


    }
}
