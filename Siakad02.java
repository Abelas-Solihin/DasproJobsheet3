 import java.util.Scanner;

    /**
     * Siakad02
     */
    public class Siakad02 {
        public static void main (String[] agrs) {
            Scanner sc = new Scanner(System.in);
            String nama, nim;
            char kelas;
            byte absen;
            double nilaikuis, nilaiTugas, nilaiUjian, nilaiAkhir;
            
            System.out.print("Masukkan nama: "); 
            nama = sc.nextLine();
            System.out.print("Masukkan NIM: "); 
            nim = sc.nextLine();
            System.out.print("Masukkan kelas: "); 
            kelas = sc.nextLine().charAt(0);
            System.out.print("Masukkan nomor absen: "); 
            absen = sc.nextByte();
            System.out.print("Masukkan nilai kuis: "); 
            nilaikuis = sc.nextDouble();
            System.out.print("Masukkan nilai tugas: ");
            nilaiTugas = sc.nextDouble();
            System.out.print("Masukkan nilai ujian "); 
            nilaiUjian = sc.nextDouble();
            
            nilaiAkhir = (nilaikuis + nilaiTugas + nilaiUjian);
            
            System.out.print ("Nama: " + nama + "Nim" + nim);
            System.out.print ("Kelas: " + kelas + "Absen: " + absen);
            System.out.println("Nilai akhir: " + nilaiAkhir);
    
        
    }
   
    
}
