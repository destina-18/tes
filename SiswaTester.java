//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        Siswa litha = new Siswa();
        Siswa sasa = new Siswa();
        Siswa lila = new Siswa();
        Siswa zea = new Siswa();
        Siswa nimas = new Siswa();

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
