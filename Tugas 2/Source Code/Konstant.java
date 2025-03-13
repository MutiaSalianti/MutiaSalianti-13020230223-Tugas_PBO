import java.util.Scanner;

public class Konstant {
    public static void main(String[] args) {

        final float PHI = 3.1415f;  
        float r; 
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Jari-jari lingkaran = ");  
        r = masukan.nextFloat();
        
        masukan.close();
        
        System.out.println("Luas lingkaran = " + (PHI * r * r));  
        System.out.println("Akhir program");  
    }
}
