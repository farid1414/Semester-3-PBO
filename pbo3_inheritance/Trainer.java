/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_inheritance;

/**
 *
 * @author MBSCo
 */
public class Trainer extends member {
        private int lamaTraining;
    
    public Trainer(String nama, int umur,  int lamaTraining){
        super(nama, umur);
        this.lamaTraining = lamaTraining;
    }
    
    @Override  
    public void  display (){
        super.display();
        System.out.println("lama training (Bulan) : " + this.lamaTraining);
    }
}
