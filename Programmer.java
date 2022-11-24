/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pegawai;

/**
 *
 * @author Farida Prasetyaning
 */
public class Programmer extends pegawai{
    double bonus;

    public Programmer(){
        
    }
    public Programmer(String nama, double gajiPokok, double bonus) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
    }
public void cetakInfo(){
    super.cetakInfo();
    
    System.out.println("Bonus :" + this.bonus);
}
public void setBonus(double Bonus){
    this.bonus = Bonus;   
}
public double getBonus(){
    return this.bonus;
}
public void cetakBonus(){
    System.out.println("Bonus :" + this.bonus);
}
 public static void main(String[] args) {
        
        Programmer andi = new Programmer ("Andi Herlambang", 300000, 400000);
        System.out.println("Nama :" + andi.nama);
        System.out.println("Gaji :" + andi.gajiPokok);
        System.out.println("Bonus :" + andi.bonus);
        
        Programmer riko = new Programmer ("Riko Simanjuntak", 500000, 200000);
        System.out.println("Nama :" + riko.nama);
        System.out.println("Gaji :" + riko.gajiPokok);
        System.out.println("Bonus :" + riko.bonus);
        
        Programmer dina = new Programmer ("Dina Rahmawati", 800000, 200000);
        System.out.println("Nama :" + dina.nama);
        System.out.println("Gaji :" + dina.gajiPokok);
        System.out.println("Bonus :" + dina.bonus);
 }
}
