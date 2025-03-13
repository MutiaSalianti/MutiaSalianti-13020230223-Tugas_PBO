import java.util.Scanner;

/* Membaca nilai x dan menjumlahkan nilai yang dibaca dengan ITERATE */  
public class PrintXinterasi {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi variabel
        int sum = 0;
        int x;
        
        // Meminta input pertama dari pengguna
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: "); 
        x = masukan.nextInt(); // First Element
        
        if (x == 999) {   
            System.out.println("Kasus kosong"); 
        } else { 
            // Minimal ada satu data yang dijumlahkan
            sum = x; // Inisialisasi
            
            while (true) { // Loop tanpa batas
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: "); 
                x = masukan.nextInt(); // Next Element
                
                if (x == 999) {  
                    break; 
                }
                sum += x; // Proses penjumlahan
            } 
        }   
        
        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + sum);
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
    }   
}
