/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan59.detectiveconan;

/**
 *
 * @author User
 */
public class Polisi extends Grup
{
    public Polisi(String nama, String tujuan)
    {
        super(nama, tujuan);
    }
    
    public void tampilkanData()
    {
        System.out.println("Nama \t\t : " + getNama());
        System.out.println("Grup \t\t : Polisi");
        System.out.println("Tujuan Grup \t : " + getTujuan());
    }
}
