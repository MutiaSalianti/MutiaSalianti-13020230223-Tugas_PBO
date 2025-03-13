import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan WHILE */  
public class PrintWhile {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi variabel
        int N;
        int i;
        
        // Meminta input dari pengguna
        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();  
        
        // Inisialisasi
        i = 1;
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
        
        // Menampilkan output menggunakan while
        System.out.println("Print i dengan WHILE:");  
        while (i <= N) { // Kondisi pengulangan
            System.out.println(i); // Proses
            i++; // Next Element
        }
    }
}