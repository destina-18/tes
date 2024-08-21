//Driver Class
public class KaryawanTester{
    public static void main(String[] args) {
        //object
        //Class object = new Constructor
        karyawan Lia = new karyawan ( 123, "Lia", "TU", "Malang");
        karyawan Budi = new karyawan (78, "Budi", "Kurikulum", "probolinggo");
        karyawan Lila = new karyawan (94, "Lila", "Sarpra", "Surabaya");
        karyawan Rudi = new karyawan (83, "Rudi", "Kesiswaan", "Kediri");
        karyawan Agus = new karyawan (97, "Agus", "Hubin", "Jember");

        Lia.print();
        Budi.print();
        Lila.print();
        Rudi.print();
        Agus.print();
    
    }
}
