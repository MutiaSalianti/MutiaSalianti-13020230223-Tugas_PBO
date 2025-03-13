import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan while (ringkas) */  
public class PrintWhile1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi variabel
        int N;
        int i = 1;
        
        // Meminta input dari pengguna
        System.out.print("Nilai N > 0 = ");  
        N = masukan.nextInt();
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
        
        // Menampilkan output menggunakan while
        System.out.println("Print i dengan WHILE (ringkas):");  
        while (i <= N) {
            System.out.println(i++);
        }
    }
}