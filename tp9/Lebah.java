/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp8;

/**
 *
 * @author Ivan
 */
public class Lebah extends Serangga {
    public Lebah (String warna, Koordinat k) {
        super(warna, k);
    }
    
    public void gerak(Koordinat k) {
        Koordinat3D pos = (Koordinat3D) getPosisi();
        pos.setX(pos.getX()+15);
        pos.setY(pos.getY()+15);
        pos.setZ(pos.getZ()+15);
    }
    
    @Override
    public void info() {
        Koordinat3D k = (Koordinat3D) getPosisi();
        System.out.println("Warna lebah : " + getWarna());
        System.out.println("Posisi lebah : X = " + k.getX());
        System.out.println("               Y = " + k.getY());
        System.out.println("               Z = " + k.getZ());

        gerak(k);

        System.out.println("Posisi lebah : X = " + k.getX());
        System.out.println("               Y = " + k.getY());
        System.out.println("               Z = " + k.getZ());
        System.out.println();
    }
}
