import java.util.Scanner;

public class PemilihanPercobaan1Modifikasi07 {

    public static void main(String [] args) {

        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukan angka: ");

        int angka = input07.nextInt();
        String result = (angka * 2 == 0) ? "genap" : "ganjil";

        System.out.println("angka " + angka + " bilangan " + result);


    }
     
}
