/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpecahan;

/**
 *
 * @author MBSCo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // TODO code application logic here
        Praktikumpecahan pertama = new Praktikumpecahan (3,2);
        
        //tampil pecahan
        System.out.println("==== PECAHAN ====\n");
        System.out.println("pertama = 1 "  + pertama.getpembilang() + "/" + pertama.getpenyebut());
        
        //Tampilkan hasil
        
        Praktikumpecahan p;
        int x,y;
        
        p= pertama.tambah(pertama);
        
        x = p.pembilang;
        y = p.penyebut;
        System.out.println("Hasil= " + x + "/" + y);
    }
    
}
