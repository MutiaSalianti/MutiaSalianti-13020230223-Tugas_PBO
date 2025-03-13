import java.util.Scanner;

/* Membaca nilai x dan menjumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi variabel
        int sum = 0;
        int x;
        
        // Meminta input pertama dari pengguna
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");  
        x = masukan.nextInt(); // First Element
        
        // Menggunakan while untuk melakukan penjumlahan
        while (x != 999) { // Kondisi berhenti
            sum += x; // Proses penjumlahan
            System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");  
            x = masukan.nextInt(); // Next Element
        }
        
        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + sum);
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
    }
}