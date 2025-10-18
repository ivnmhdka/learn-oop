/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Ivan
 */

import java.time.format.DateTimeFormatter;

public class HandoBaet extends SepedaMotor {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
    public HandoBaet(String warna) {
        super(warna);
        this.ukuranTangki = 4;
    }
    
    @Override
    public boolean jalan() {
        if (super.cekKapanHabis() == null) {
            System.out.println("Bensin Habis, sepeda motor tidak dapat jalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            System.out.println("Motor Baet akan habis bensin pada " + super.cekKapanHabis().format(formatter));
            return true;
        }
    }
}
