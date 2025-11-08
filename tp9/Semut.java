/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9;

/**
 *
 * @author Ivan
 */
public class Semut extends Serangga{
    public Semut(String warna, Koordinat k) {
        super(warna, k);
    }
    
    @Override
    public void gerak(Koordinat k) {
        k.setX(k.getX()+10);
        k.setY(k.getY()+10);
    }
    
    @Override
    public void info() {
        System.out.println("Warna semut: " + super.getWarna());
        System.out.println("Posisi semut: X = " + super.getPosisi().getX());
        System.out.println("              Y = " + super.getPosisi().getY());
        
        gerak(super.getPosisi());
        
        System.out.println("Posisi semut: X = " + super.getPosisi().getX());
        System.out.println("              Y = " + super.getPosisi().getY());
        System.out.println("");
    }
}
