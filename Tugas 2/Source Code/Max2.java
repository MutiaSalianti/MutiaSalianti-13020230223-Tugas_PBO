import java.util.Scanner;
 
public class Max2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner masukan = new Scanner(System.in);
        
        int a, b;
        
        // Menampilkan instruksi kepada pengguna
        System.out.println("Maksimum dua bilangan:");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN: ");
        
        a = masukan.nextInt();
        b = masukan.nextInt();
        
        // Menutup Scanner untuk menghindari kebocoran sumber daya
        masukan.close();

        System.out.println("Kedua bilangan: a = " + a + " b = " + b);
        
        if (a >= b) {
            System.out.println("Nilai maksimum adalah a: " + a);
        } else {
            System.out.println("Nilai maksimum adalah b: " + b);
        }
    }
}