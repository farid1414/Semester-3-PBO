/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg2;

/**
 *
 * @author MBSCo
 */
public class maingame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        karaktergame Raiden = new karaktergame ("Raiden",10,20);
        karaktergame Subzero = new karaktergame ("Sub Zero", 5,25);
        
        System.out.println("***HEALT AWAL***");
        System.out.println("Healt Raiden: " + Raiden.getlife_point());
        System.out.println("Healt Sub Zero" + Subzero.getlife_point());
        System.out.println("\n");
        
        //pertandingan dimulai
        System.out.println("==== READY ====");
                
        
        //raiden melakukan tendangan ke subzero 
        Raiden.kick(Subzero);
        
        System.out.println("Raiden melakukan tendangan ke Subzero");
        System.out.println("Healt Raiden : " + Raiden.getlife_point());
        System.out.println("Healt Subzero : " + Subzero.getlife_point());
        System.out.println("\n");
        
        //subzero melakukan tendangan ke raiden 
        Subzero.kick(Raiden);
        
        System.out.println("Subzero melakukan tendangan ke Raiden");
        System.out.println("Healt Raiden: " + Raiden.getlife_point());
        System.out.println("Healt Subzero:  " + Subzero.getlife_point());
        System.out.println("\n");
        
        //subzero melakukan pukulan 3x ke raiden 
         for(int i=0;i<3;i++){
          Subzero.hit(Raiden);
         }
         
         System.out.println("Subzero melakukan pukulan 3x ke Raiden");
         System.out.println("Healt Raiden: " + Raiden.getlife_point());
         System.out.println("Healt Subzero: " + Subzero.getlife_point());
         System.out.println("\n");        

         
         //raiden melakukan tendangan 4x ke subzero 
         for (int i=0;i<4;i++){
          Raiden.kick(Subzero);
         }
         
         System.out.println("Raiden melakukan tendangan sebanyak 4 kali kepada subzero");
         System.out.println("Healt Raiden : " +Raiden.getlife_point());
         System.out.println("Healt Subzero: " +Subzero.getlife_point());
         System.out.println("\n");
         
         //pertandingan selesai 
         System.out.println("==== SELESAI ====");
         
         //hasil pertandingan
         if (Raiden.getlife_point() > Subzero.getlife_point()){
             System.out.println("Winner : Raiden ");
             System.out.println("KO     : Subzero ");
         } else if (Subzero.getlife_point() > Raiden.getlife_point()){
             System.out.println("Winner  :Subzero");
             System.out.println("KO      :Raiden ");
         } else {
             System.out.println("Draw");
         }
    }   
         }
    
