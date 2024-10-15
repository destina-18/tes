import java.util.Scanner;

public class testerInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("pilih guitar atau piano");
        String pilihan = in.nextLine();

        if (pilihan.equals("guitar")) {
            System.out.println("Inputkan nama Guitar: ");
            String name = in.nextLine();
            System.out.println("Inputkan harga Guitar: ");
            double harga = in.nextDouble();
            System.out.println("Inputkan jumlah senar: ");
            int numsString = in.nextInt();
            System.out.println("Inputkan jenis Elektrik/nonElektrik: ");
            boolean isElectric = in.nextBoolean();

            guitar guitar1 = new guitar(name, harga, numsString, isElectric);
            guitar1.print();

        } else if (pilihan.equals("piano")) {
            System.out.println("Inputkan nama: ");
            String name = in.nextLine();
            System.out.println("Inputkan harga: ");
            double price = in.nextDouble();
            in.nextLine();
            System.out.println("Inputkan pianoType: ");
            String pianoType = in.nextLine();

            piano piano2 = new piano(pianoType, name, price);
            piano2.print();
        }

    }

}
