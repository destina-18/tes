//Driver Class
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Inputkan Nama Siswa:");
        // String nama = input.nextLine();
        // System.out.println("Inputkan Id Siswa:");
        // int id = input.nextInt();
        // System.out.println("Inputkan IPK:");
        // double ipk = input.nextDouble();

        // Siswa avelin = new Siswa(id, nama, ipk);
        // avelin.print();
        
        //object
        //Class object = new Constructor
        Siswa litha = new Siswa();
        Siswa sasa = new Siswa();
        Siswa lila = new Siswa();
        Siswa zea = new Siswa();
        Siswa nimas = new Siswa();
        Siswa ima = new Siswa(123, "Fahrian", 80.5);

        litha.print();
        sasa.print();
        lila.print();
        zea.print();
        nimas.print();
        ima.print();

        litha.nama = "Talitha";
        litha.ipk = 90.0;
        litha.id = 34;

        sasa.nama = "Latisa";
        sasa.ipk= 89.0;
        sasa.id = 17;

        lila.nama = "kalila";
        lila.ipk = 92.0;
        lila.id = 12;

        zea.nama ="azzahra";
        zea.ipk = 88.0;
        zea.id = 6;

        nimas.nama = "nimasputu";
        nimas.ipk = 93.0;
        nimas.id = 30;
        //2 kondisi --> nilai < 75 dannilai >=75
        if (litha.getIpk() >= 75) {
            System.out.println(litha.getNama() + "Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }

        //3 kondisi
        if (litha.getIpk() > 90) {
            System.out.println("Excellent");
        } else if (litha.getIpk() < 90 && litha.getIpk() >= 75) {
            System.out.println("Great");
        } else {
            System.out.println("So Bad");
        }


        System.out.println("Nama : "+ litha.nama);
        System.out.println("Absen : "+ litha.id);
        System.out.println("Nilai : "+ litha.ipk);

        System.out.println("Nama : "+ sasa.nama);
        System.out.println("Absen : "+ sasa.id);
        System.out.println("Nilai : "+ sasa.ipk);

        System.out.println("Nama : "+ lila.nama);
        System.out.println("Absen : "+ lila.id);
        System.out.println("Nilai : "+ lila.ipk);

        System.out.println("Nama : "+ zea.nama);
        System.out.println("Absen : "+ zea.id);
        System.out.println("Nilai : "+ zea.ipk);

        System.out.println("Nama : "+ nimas.nama);
        System.out.println("Absen : "+ nimas.id);
        System.out.println("Nilai : "+ nimas.ipk);
        
    }
}
