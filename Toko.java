
package pertemuan05;


public class Toko {
     String nama;
     String lokasi;
     int tahunBerdiri;
     int jumlah;
     double luas;
     
    
     
     void jualan(){
         System.out.println("=================================");
         System.out.println("| Jenis Barang : Sembako        |");
         System.out.println("| Toko Buka    : 08.00-21.00    |");
         System.out.println("=================================");
     }
     
     void dataToko(){
         System.out.println("===================================");
         System.out.println("| Nama Toko     :  "+nama+"");
         System.out.println("| Lokasi        :  "+lokasi+"");
         System.out.println("| Tahun Berdiri :  "+tahunBerdiri+"");
         System.out.println("| Jumlah Toko   :  "+jumlah+"");
         System.out.println("| Luas          :  "+luas+"");
         System.out.println("====================================");
     }
}
