package persewaan;

public class DVD extends product {
    private int leght;
    private String rating;
    private String studio;

    public DVD (){
        number = 10;
        name = "gatau mau apa";
        quantity = 0;
        price = 0.0;
        leght = 4;
        rating = "All age";
        studio = "Destin Studio";
    }
    public void print () {
        System.out.println("number: "+ number);
        System.out.println("name: "+ name);
        System.out.println("quantity: "+ quantity);
        System.out.println("price: "+ price);
        System.out.println("leght: "+ leght);
        System.out.println("rating: "+ rating);
        System.out.println("studio: "+ studio);
    }
    public void DVDprint() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DVDprint'");
    }
}
