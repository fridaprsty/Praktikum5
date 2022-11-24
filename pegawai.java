/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pegawai;

/**
 *
 * @author Farida Prasetyaning
 */
public class pegawai {
    String nama ;
    double gajiPokok;
    
    public pegawai(){
    } 
    public pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    public void cetakInfo(){
        System.out.println("Nama :" + this.nama);
        System.out.println("Gaji Pokok :" + this.gajiPokok);
    }
   public void setNama(String nama){
       this.nama = nama;
   }
   
   public void setGajiPokok(double gajiPokok){
       this.gajiPokok = gajiPokok;
   }
   
   public String getNama(){
       return this.nama;
   } 
   
   public double getGajiPokok(){
       return this.gajiPokok;
   }

}
