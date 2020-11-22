/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan54.koordinat;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini berisi tentang Koordinat
 */
public class IF110119004Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warnaKoordinat1 = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : ".concat(warnaKoordinat1.getNamaWarna()));
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat1.getX() + ", y : " + warnaKoordinat1.getY());
    }
    
}
