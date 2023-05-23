//Alya Ryana Putri Rahmadyna
//227064516080

package ujiantengahsemester;
import java.util.Scanner;
public class coba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kategori;
        int jumlahtiket;
        int hargatiket;
        
        System.out.println("## COLDPLAY MUSIC of SPHERES ##");
        System.out.println("========= WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");
        System.out.println();
        System.out.println("Kategori tiket yang tersedia: ");
        System.out.println("1. Category 1 (Rp.5.000.000)");
        System.out.println("2. Category 2 (Rp.4.000.000)");
        System.out.println("3. Category 3 (Rp.3.250.000)");
        System.out.println("4. Category 4 (Rp.2.500.000)");
        
        System.out.print("Pilih kategori tiket (1-4): ");
        kategori = input.nextInt();
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        jumlahtiket = input.nextInt();
        
        System.out.println("=======================================");
        System.out.println("           INVOICE PEMBELIAN           ");
        System.out.println("=======================================");
        
        System.out.println("Kategori Tiket : " + kategori);
        System.out.println("Jumlah Tiket : " + jumlahtiket);
        System.out.println("Harga Tiket : ");
        hargatiket = input.nextInt();
        
        switch (hargatiket){
            case 1:
                System.out.println("Harga Tiket : ");
                hargatiket = jumlahtiket * 5000000;
                break;
            case 2:
                System.out.println("Harga Tiket : " + kategori + jumlahtiket);
                break;
            case 3:
                System.out.println("Harga Tiket : " + kategori + jumlahtiket);
                break;
            case 4:
                System.out.println("Harga Tiket : " + kategori + jumlahtiket);
                break;
            default:
                System.out.println("Inputan salah");
        }
        
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        System.out.println("kembalian : ");
        System.out.println("=======================================");
    }
        
    }
