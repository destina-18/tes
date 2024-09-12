package persewaan;//nama  folder tempat penyimpanan
//subclass
public class CD extends product {
    private String artist;
    private int totalSong;
    private String label;

    public CD () {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 0;
        price = 0.0;
        artist = "Salman";
        totalSong = 0;
        label = "Sony Music";
    }

    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    public void CDprint() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CDprint'");
    }
}
