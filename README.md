# TugasCoding
# Muhammad Ariqoh Firjatullah.Coding
# Tugas 1
Kode di atas adalah program Java sederhana yang mencetak angka dari 1 hingga 100 ke layar. Pada setiap iterasi perulangan `for`, program melakukan pemeriksaan kondisi dengan menggunakan pernyataan `if`. Jika nilai `i` (angka iterasi saat ini) kurang dari atau sama dengan 9, maka program akan mencetak angka itu sendiri. Namun, jika `i` lebih besar dari 9, maka program akan mencetak teks "Herlita" sebagai gantinya. Oleh karena itu, program ini akan mencetak angka dari 1 hingga 9, dan kemudian mencetak "Herlita" dari 10 hingga 100.
# Penjelasan Tugas
## Tugas 1
1. perulangan for yang menjelaskan menggunakan int dan variabel i adalah 1. Jika i kurang dari 100. maka variabel i ditambah.
 ```sh
   for (int i = 1; i <= 100; i++)
   ```
2. Jika variabel i kurang dari 9 maka akan memunculkan output angka yaitu 1, 2, 3, 4, 5, 6, 7, 8, 9.
```sh
   if (i <= 9) {
  System.out.println(i);
}
```
## Tugas 2
```sh
public class tugas2{
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
  ```      
Scanner sc = new Scanner(System.in); digunakan untuk membaca masukan dari pengguna yang diketikkan melalui keyboard int angka; Ini adalah deklarasi variabel angka yang akan digunakan untuk membaca angka-angka yang dimasukkan oleh pengguna 
```sh
while (true) {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti) : ");
            angka = scanner.nextInt();

while (true) {: Ini adalah awal dari loop while yang akan terus berjalan selama kondisinya selalu benar (dalam hal ini, selalu benar karena kondisinya adalah true). Ini berarti loop akan berjalan terus-menerus tanpa henti sampai suatu waktu Anda menggunakan pernyataan break untuk keluar dari loop. angka = sc.nextInt();: Dalam setiap iterasi loop, program menggunakan objek Scanner (sc) untuk membaca angka yang dimasukkan oleh pengguna. Metode nextInt() dari objek Scanner digunakan untuk membaca angka yang dimasukkan oleh pengguna
```sh
 if (angka == 0) {
                System.out.println("Perulangan telah dihentikan.");
                break;
            } else if (angka % 2 == 0) {
                System.out.println("Angka yang dimasukkan adalah angka genap.");
            } else {
                System.out.println("Angka yang dimasukkan adalah angka ganjil.");
            }
        }
        
        scanner.close();
    }
}
```
if (angka == 0) {: Ini adalah pernyataan kondisional if yang memeriksa apakah nilai angka yang dimasukkan oleh pengguna sama dengan 0. break digunakan untuk keluar dari loop while yang berjalan tanpa henti. Ini akan menghentikan eksekusi loop dan memungkinkan program melanjutkan ke pernyataan di luar loop. else {: Jika nilai angka tidak sama dengan 0 (kondisi if tidak terpenuhi), maka program akan masuk ke blok else.
# Outputnya
```sh
Masukkan sebuah angka (0 untuk berhenti) : 3
Angka yang dimasukkan adalah angka ganjil. 
Masukkan sebuah angka (0 untuk berhenti) : 10
Angka yang dimasukkan adalah angka genap.
Masukkan sebuah angka (0 untuk berhenti) : 23  
Angka yang dimasukkan adalah angka ganjil.
Masukkan sebuah angka (0 untuk berhenti) : 67
Angka yang dimasukkan adalah angka ganjil.
Masukkan sebuah angka (0 untuk berhenti) :
```
## Tugas 3
```sh
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
```
# penjelasan
import java.util.Scanner;adalah pernyataan impor (import statement) dalam bahasa pemrograman Java. Fungsi dari pernyataan ini adalah untuk mengimpor kelas Scanner dari pustaka standar Java yang disebut java.util.
```sh
 System.out.print("Tanggal : ");
        int tanggal = sc.nextInt();
        System.out.print("Bulan : ");
        int bulan = sc.nextInt();
```
Program mencetak teks "Tanggal : " dan  program mencetak teks "Bulan : ".ke layar dan kemudian menggunakan sc.nextInt() untuk membaca input pengguna yang merupakan bilangan bulat (integer) dan menyimpannya dalam variabel tanggal, dan bulan
```sh
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
```
serangkaian pernyataan if-else yang digunakan untuk menentukan tanda zodiak berdasarkan tanggal dan bulan yang dimasukkan oleh pengguna. Setiap blok if dan else if memeriksa apakah tanggal dan bulan cocok dengan rentang tertentu untuk tanda zodiak tertentu. Jika cocok, variabel zodiak akan diisi dengan nama tanda zodiak yang sesuai.
# Outputnya
```sh
Tanggal : 05
Bulan : 06
Zodiak Anda adalah: GEMINI
```
## Tugas 4
```sh
public class tugas4 {
    public static void main(String[] args) {
        String[] TempatWisataTujuansaya = {
            "Bali", "Bandung", "Jepang", "Korea Selatan"
        };
        for (int i=0 ; i<TempatWisataTujuansaya.length; i++){
            System.out.println(TempatWisataTujuansaya[i]);
        }
    }
}
```
# penjelasan
String[] TempatWisataTujuansaya = { "Bali", "Bandung", "Jepang", "Korea Selatan"};: Di sini, sebuah array string dengan nama "TempatWisataTujuansaya" or (int i = 0; i < TempatWisataTujuansaya.length; i++) {: Ini adalah loop for yang digunakan untuk mengulanginya sebanyak TempatWisataTujuansaya.length kali. TempatWisataTujuansaya.length adalah panjang dari array "TempatWisataTujuansaya", yang dalam hal ini adalah 4. Oleh karena itu, loop akan berjalan empat kali
# Outputnya
```sh
Bali
Bandung      
Jepang       
Korea Selatan
```
