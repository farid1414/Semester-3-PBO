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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tim juragan14 = new Tim("juragan14");
        
        //deklarasi member 
        member orang_1 = new member("Farid", 20);
        member orang_2 = new member ("wahyu", 24);
        member orang_3 = new member ("Hafid" , 25);
        
        //deklarasi trainer
        
        member orang_4 = new Trainer ("kevin",20, 8);
        member orang_5 = new Trainer ("Adi,",30, 5);
        member orang_6 = new Trainer ("Rico",26, 10);
        
        //menambahkan data 
        juragan14.addmember(orang_1);
        juragan14.addmember(orang_2);
        juragan14.addmember(orang_3);
        juragan14.addmember(orang_4);
        juragan14.addmember(orang_5);
        juragan14.addmember(orang_6);
        
        //output
        juragan14.displayFullmember();
        juragan14.displayTrainer();
    }
    
}
