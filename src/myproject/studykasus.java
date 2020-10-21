
package myproject;
import java.util.Scanner;
public class studykasus {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Pembelian Tiket Kereta Api");
        System.out.println("--------------------------");
        System.out.println("Masukkan Identitas Anda");
        
        String nama, asal;
        int nomorhp;
        System.out.println("Nama : ");
        nama = input.nextLine();
        System.out.println("Alamat Asal : ");
        asal = input.nextLine();
        System.out.println("Nomor Hp : ");
        nomorhp = input.nextInt();
        
        System.out.println("----<<<Rincian>>>---");
        System.out.println("T1. Blitar - Malang         = Rp; 12.000");
        System.out.println("T2. Tulungagung - Malang    = Rp; 13.000");
        System.out.println("T3. Kras - Malang           = Rp; 12.500");
        System.out.println("T4. Kediri - Malang         = Rp; 12.000");
        
        System.out.println("====Nota Pembelian====");
        String jalur;
        int jumlah;
        int harga, totalbayar, kembalian;
        
        System.out.println("Tiket yang Diambil = ");
        jalur = input.nextLine();
        System.out.println("Jumlah Tiket yang Diambil = ");
        jumlah = input.nextInt();
        System.out.println("Total Harga Tiket = ");
        harga = input.nextInt();
        System.out.println("Bayar = ");
        totalbayar = input.nextInt();
        System.out.println("Kembalian = " + (kembalian = totalbayar - harga));
        System.out.println("----------------");
        System.out.println("Terima Kasih");
        
        
        
      
   
    
        
   
       
    }
}
