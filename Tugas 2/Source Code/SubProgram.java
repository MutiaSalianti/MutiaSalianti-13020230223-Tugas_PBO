import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
public class SubProgram {

    // Fungsi untuk mencari maksimum dua bilangan bulat
    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;
    }

    // Prosedur untuk menukar dua bilangan bulat
    public static void tukar(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }

    // Program Utama
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Maksimum dua bilangan");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan ENTER: \n");
        
        int a = masukan.nextInt();
        int b = masukan.nextInt();
        
        System.out.println("Ke dua bilangan : a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));
        
        System.out.println("Tukar kedua bilangan...");
        
        int[] nums = {a, b};
        tukar(nums);
        System.out.println("Ke dua bilangan setelah tukar: a = " + nums[0] + " b = " + nums[1]);
        
        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}