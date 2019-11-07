/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan60.akatsuki;

/**
 *
 * @author         
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas : Akatsuki
 */
public class Akatsuki extends Anggota{
    public Akatsuki() {
        super();
    }
    
    public void tampilAnggotaDesa(int desa) {
        System.out.println("Anggota Dari "+getNamaDesa(desa)+" : ");
        
        if(desa <= 8) {
            System.out.println(getAnggotaDesa(desa));
        } else {
            super.tampilAnggotaDesa();
        }
    }
}
