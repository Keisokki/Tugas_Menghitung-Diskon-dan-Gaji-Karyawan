import java.util.Scanner;

public class Diskon{
    public static void main(String[] args) {
        Double hargaAwal , persentaseDiskon , totalHarga;
        int jumlahBarang;

            Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan harga awal barang: ");
        hargaAwal = scan.nextDouble();
        System.out.print("Masukkan persentase diskon: ");
        persentaseDiskon = scan.nextDouble();
        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = scan.nextInt();

        totalHarga = hargaAwal * jumlahBarang;
        persentaseDiskon=(persentaseDiskon/100)*totalHarga;
        totalHarga = totalHarga - persentaseDiskon;
        System.out.println("Harga akhir barang setelah diskon: " + totalHarga);



    }
}