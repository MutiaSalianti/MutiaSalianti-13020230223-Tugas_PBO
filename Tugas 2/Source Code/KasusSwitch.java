import java.util.Scanner;

public class KasusSwitch {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        // Deklarasi variabel
        char cc;
        
        // Menampilkan pesan ke pengguna
        System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN: ");
        
        // Membaca input dari pengguna
        cc = masukan.next().charAt(0);
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();
        
        // Menggunakan switch untuk memeriksa karakter
        switch (cc) {
            case 'a':
                System.out.println("Yang anda ketik adalah a");
                break;
            case 'u':
                System.out.println("Yang anda ketik adalah u");
                break;
            case 'e':
                System.out.println("Yang anda ketik adalah e");
                break;
            case 'i':
                System.out.println("Yang anda ketik adalah i");
                break;
            case 'o':
                System.out.println("Yang anda ketik adalah o");
                break;
            default:
                System.out.println("Yang anda ketik adalah huruf mati");
        }
    }
}
