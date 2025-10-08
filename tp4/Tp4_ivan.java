/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp4;

/**
 *
 * @author Ivan
 */
public class Tp4_ivan {

    public static void main(String[] args) {
        Dokter dt1 = new Dokter("Grisha", "Mata");
        Dokter dt2 = new Dokter("Faye", "Gigi");
        Dokter dt3 = new Dokter("Zeke", "Telinga");
        
        Pasien ps1 = new Pasien("Historia", 20);
        Pasien ps2 = new Pasien("Sasha", 37);
        Pasien ps3 = new Pasien("Petra", 55);
        
        Pemesanan[] daftar = new Pemesanan[5];
        daftar[0] = new Pemesanan(dt1, ps1, "Selasa");
        daftar[1] = new Pemesanan(dt2, ps1, "Kamis");
        daftar[2] = new Pemesanan(dt2, ps2, "Selasa");
        daftar[3] = new Pemesanan(dt3, ps2, "Jumat");
        daftar[4] = new Pemesanan(dt1, ps3, "Senin");
        
        for (int i = 0; i < daftar.length; i++) {
            Pemesanan p = daftar[i];
            System.out.println();
            System.out.println("Urutan ke-" + (i + 1));
            System.out.println("Nama Dokter: " + p.getDokter().getNama());
            System.out.println("Spesialis: " + p.getDokter().getSpesialis());
            System.out.println("Nama Pasien: " + p.getPasien().getNama() + " (" + p.getPasien().getUmur() + ")");
            System.out.println("Hari: " + p.getHari());
            System.out.println();
        }
        
    }
}
