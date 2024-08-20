import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        
        double jumlahJam, tarifPerjam, pajak, gajiKaryawan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Jam: ");
        jumlahJam = input.nextDouble();
        System.out.println("Masukkan Tarif Perjam: ");
        tarifPerjam = input.nextDouble();
        System.out.println("Masukkan Pajak: ");
        pajak = input.nextDouble();

        gajiKaryawan=jumlahJam*tarifPerjam;
        pajak=(pajak/100)*gajiKaryawan;
        gajiKaryawan=gajiKaryawan-pajak;
        System.out.println("gajiKaryawan :"+gajiKaryawan);
    }
    
}
