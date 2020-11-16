import FacadePattern.*;
import TemplateMethod.*;
import java.util.*;
/**
 *
 * @author Rizal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ulang = "y";
            System.out.println("==== Implementasi Design Pattern Di Ruang Bangun Persegi Panjang ====");
            System.out.println("======================================================================");
            while (ulang.equals("y")) {
                System.out.println("==== Pilihan :" +
                        "\n 1. Template Method(Visualisasi Persegi Panjang)" +
                        "\n 2. Strategy Pattern(Menghitung Nilai Luas, Keliling, dan Diagonal Persegi Panjang)" +
                        "\n 3. Facade Pattern (Detail Rumus)" +
                        "\n 4. Keluar ");
                System.out.print("Masukkan Pilihan = ");
                Scanner sc = new Scanner(System.in);
                int pilih = sc.nextInt();

                switch (pilih) {
                    case 1: {          
                        System.out.println("Masukkan panjang dan Lebar Bangun Segi Empat: ");
                        Pola1 pola1 = new Pola1();
                        pola1.segiempat();
                        break;
                    }
                    case 2: {                     
                        break;
                    }
                    case 3: {
                        Detail();
                        break;
                    }

                    case 4: {        
                        System.out.println("Terimakasih Atas Perhatiannya :)"); 
                        System.exit(0);
                    }

                }
                System.out.println("======================================================================");
                System.out.println("Apakah mau lagi (y/t)?");
                ulang = sc.next();
            }
            System.out.println("======================================================================");
            System.out.println("Terimakasih Atas Perhatiannya :)");
            System.out.println("======================================================================");
        
    }  
    
    public static void Detail(){
            Persegi3 persegi = new Persegi3();
            PersegiPanjang3 persegiP = new PersegiPanjang3();

            System.out.println("\n========= Persegi : ");
            persegi.ketentuan();
            persegi.Luas();
            persegi.Keliling();
            persegi.Diagonal();

            System.out.println("\n========= Persegi Panjang : ");
            persegiP.ketentuan();
            persegiP.Luas();
            persegiP.Keliling();
            persegiP.Diagonal();
        }
}
