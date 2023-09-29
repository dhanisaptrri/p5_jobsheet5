import java.util.Scanner;

public class PemilihanPercobaan107{

    public static void main(String [] args){

        Scanner input07 = new Scanner(System.in);

        System.out.println("masukan angka: ");
        int angka = input07.nextInt();

        if (angka % 2 == 0 )
            System.out.println("angka "+angka+" bilangan genap");
        
        else
            System.out.println("angka "+angka+" bilangan ganjil");
            
    }
}