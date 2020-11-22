/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan59.detectiveconan;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan program detective conan
 *
 */
public class PBO10K10119901Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Detektif d = new Detektif("Shinichi Kudo / Conan Edogawa", "Mengungkap Misteri dan Kejahatan");
        d.tampilkanData();
        
        System.out.println();
        
        Polisi p = new Polisi("Inspektur Megure", "Menangkap Penjahat");
        p.tampilkanData();
        
        System.out.println();
        
        OrganisasiHitam oh = new OrganisasiHitam("Gin", "Melakukan Kejahatan");
        oh.tampilkanData();
        
        System.out.println();
        
        FBI fbi = new FBI("Jodie Starling", "Menangkap Organisasi Hitam");
        fbi.tampilkanData();
    }
}
