/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Ivan
 */

import java.time.LocalDateTime;

public class SepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;
    
    public SepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.ukuranTangki = 3;
        this.waktuIsiBensin = null;
    }
    
    public void isiTangkiFull() {
        this.waktuIsiBensin = LocalDateTime.now();
    }
    
    public LocalDateTime cekKapanHabis() {
        if (waktuIsiBensin == null) {
            return null;
        } else {
            return waktuIsiBensin.plusHours(ukuranTangki);
        }
    }
    
    public boolean jalan() {
        if (waktuIsiBensin == null) {
            System.out.println("Bensin Habis, sepeda motor tidak dapat jalan");
            return false;
        } else {
            System.out.println("Sepeda motor sedang berjalan");
            return true;
        }
    }
}
