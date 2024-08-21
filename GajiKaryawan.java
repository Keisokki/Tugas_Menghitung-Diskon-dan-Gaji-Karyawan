import java.util.Scanner;

public class GajiKaryawan{

    
    public static void main(String[] args) {
        int jamKerja;
        Double pajak , tarifJam;
        Double gajiBersih , gajiKotor;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jam Kerja: ");
        jamKerja = scan.nextInt();
        System.out.println("Masukkan Tarif Per Jam: ");
        tarifJam = scan.nextDouble();

        gajiKotor = jamKerja * tarifJam;
        pajak = gajiKotor * 0.1;
        gajiBersih = gajiKotor - pajak;
        System.out.println("Gaji Bersih: " + gajiBersih);
        scan.close();
        
    }
}