import java.util.Scanner;

public class kafe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlkopi, jmiTeh, jmlRoti;
        double hargakopi = 12000.0, hargateh = 7000.0, hargaRoti = 20000.0, nominalBayar;
        float diskon = 10/100f;

        System.out.print("Masukkikan keanggotaan (true/false): "); 
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembeliah kopi");
        jmlkopi = input.nextInt();
        System.out.print ("Masukkan jumlah pembeliane teh: "); 
        jmiTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlkopi*hargakopi) + (jmiTeh*hargateh) + (jmlRoti*hargaRoti);
        nominalBayar = totalHarga - (diskon*totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlkopi + "jmlTeh" + "teh" + jmlRoti + "roti");
        System.out.println( "Nominal bayar: Rp" + nominalBayar);

    }
}

