public class driver {
    private int tahunPembuatan;
    private String jenisMobil;

    public int getTahunPembuatan() {
        return this.tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getJenisMobil() {
        return this.jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    //constructor Parameter
    public driver (int tahunPembuatan, String jenisMobil){
        //variabel = parameter
        this.tahunPembuatan = tahunPembuatan;
        this.jenisMobil = jenisMobil;
    
    }

    //method print
    public void print(){
        System.out.println("Tahun Pembuatan: "+ jenisMobil);
        System.out.println("Jenis Mobil: "+ tahunPembuatan);
    }


    
}
