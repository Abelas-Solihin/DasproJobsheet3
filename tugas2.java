
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKerja;
        double upahKerja;
        System.out.println("Jam kerja karyawan" );
        jamKerja=sc.nextInt();
        System.out.println("Upaha perjam Karyawan: Rp");
        upahKerja = sc.nextDouble();

        double penghasilanKaryawan = upahKerja*jamKerja;
        double bonus = penghasilanKaryawan*10/100;
        double pajak = penghasilanKaryawan*5/100;

        System.out.print("Total upah karyawan: Rp." + (penghasilanKaryawan+bonus-pajak));

    }
}
