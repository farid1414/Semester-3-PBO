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
public class karaktergame {
    private String name;
    private int life_point;
    private int attackhitpoint;
    private int attackkickpoint;
    
    //constructor
    public karaktergame(String name, int hit, int kick){
        this.life_point =100;
        this.name= name;
        this.attackhitpoint= hit;
        this.attackkickpoint= kick;
    }
    
    //function 
    
    public String getname(){
     return name;
}
    public int getlife_point(){
        return life_point;
    }
    
    public void hit(karaktergame karA){
        karA.life_point = karA.life_point - this.attackhitpoint;
    }

    public void kick(karaktergame karA){
        karA.life_point =karA.life_point - this.attackkickpoint;
    }

}
