import java.util.Scanner;

public class PemilihanPercobaan2Modifikasi07{

    public static void main(String [] args){

        Scanner input07 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float uas = input07.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input07.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input07.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input07.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) +(tugas*0.2F);

        if (total > 80 && total <= 100 ) {
            System.out.println("Nilai anda A (Sangat Baik)");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai anda B+ (Lebih dari Baik)");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai anda B (Baik)");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai anda C+ (Lebih dari Cukup)");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai anda C (Cukup)");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai anda D (Kurang)");
        } else {
            System.out.println("Nilai anda E (Gagal)");
        }
        
        
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + "sehingga" + message);

        
    }
    
}