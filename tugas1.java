import java.util.Scanner; 
public class tugas1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        int penggunaan; 
        double total, tariflistrik = 1500.0;
        boolean cek;

        System.out.print("gaya listrik yang di gunakan: ");
        total = sc.nextDouble();
        
        cek = total>500;
         
        double totalpengeluaran = total * tariflistrik;

        System.out.println("Apakah melebihi 500 kWh " + cek);
        System.out.println("total pengeluaran anda " + totalpengeluaran );


    }
}