import java.util.Scanner;

public class PrintRepeat {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi variabel
        int N;
        int i;
        
        // Meminta input dari pengguna
        System.out.print("Nilai N > 0 = ");
        
        // Inisialisasi
        N = masukan.nextInt();
        i = 1;
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
        
        // Menampilkan output menggunakan do-while
        System.out.println("Print i dengan REPEAT:");
        do {
            System.out.println(i); // Proses
            i++; // Next Element
        } while (i <= N); // Kondisi pengulangan
    }
}