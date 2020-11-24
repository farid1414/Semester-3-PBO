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
public class member {
    protected String nama;
    protected int umur;
 
    public member(String nama,int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public void display(){
        System.out.println("nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }
}
