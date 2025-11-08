/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp9;

// import tp9.Koordinat;
// import tp9.Koordinat3D;
// import tp9.Lebah;
// import tp9.Semut;
// import tp9.Serangga;
import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class Tp8 {

    public static void main(String[] args) {
        ArrayList<Serangga> daftarSerangga = new ArrayList();
        
        daftarSerangga.add(new Semut("merah", new Koordinat(70, 90)));
        daftarSerangga.add(new Lebah("oranye", new Koordinat3D(30, 40, 50)));
        
        for (Serangga s : daftarSerangga) {
            s.info();
        }
    }
}
