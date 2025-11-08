/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9;

/**
 *
 * @author Ivan
 */
public abstract class Serangga {
    private String warna;
    private Koordinat posisi;
    
    public Serangga(String warna, Koordinat k) {
        this.warna = warna;
        this.posisi = k;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public Koordinat getPosisi() {
        return posisi;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public abstract void gerak(Koordinat k);
    
    public abstract void info();
}
