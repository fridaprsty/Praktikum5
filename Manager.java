package pegawai;


import pegawai.pegawai;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Farida Prasetyaning
 */
public class Manager extends pegawai {
    double Tunjangan;
    public Manager(){   
    }
    public Manager(double Tunjangan){
       this.Tunjangan = Tunjangan;    
   }
    public Manager(String nama, double gajiPokok, double Tunjangan) {
       this.nama = nama;
       this.gajiPokok = gajiPokok;
       this.Tunjangan = Tunjangan;
    }
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan :" + this.Tunjangan);
    }
    public void setTunjangan( double Tunjangan){
        this.Tunjangan = Tunjangan; 
    }   
    public double getTunjangan(){
        return this.Tunjangan;  
}
     public void cetakTunjangan(){
          System.out.println("Tunjangan :" + this.Tunjangan);
        }
      public static void main(String[] args) {
        Manager roy = new Manager("Roy Simanjuntak", 4000000, 2000000);
        System.out.println("Nama :" + roy.nama);
        System.out.println("Gaji :" + roy.gajiPokok);
        System.out.println("Tunjangan :" + roy.Tunjangan);
}
}


