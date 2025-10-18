/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp6;

/**
 *
 * @author Ivan
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tp6 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatterTanpaDetik = DateTimeFormatter.ofPattern("yyyy-MM:dd HH:mm");
        
        SepedaMotor sp = new SepedaMotor("Hitam");
        HandoBaet hb = new HandoBaet("Biru");
        YahamaMoi ym = new YahamaMoi("Merah");
        
        System.out.println("Status Awal Sepeda Motor:");
        System.out.println(sp.jalan());
        System.out.println("Status Awal HandoBaet:");
        System.out.println(hb.jalan());
        System.out.println("Status Awal YahamaMoi:");
        System.out.println(ym.jalan());
        
        sp.isiTangkiFull();
        hb.isiTangkiFull();
        ym.isiTangkiFull();
        
        System.out.println("\n------------------------------------");
        
        System.out.println("\nStatus Terbaru Sepeda Motor:");
        System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
        sp.jalan();
        System.out.println(sp.cekKapanHabis().format(formatterTanpaDetik));
        
        System.out.println("\nStatus Terbaru HandoBaet:");
        System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
        hb.jalan();
        
        System.out.println("\nStatus Terbaru YahamaMoi:");
        System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
        ym.jalan();
    }
}
