/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Ivan
 */
public class Dokter {
    private String nama;
    private String spesialis;
    
    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getSpesialis() {
        return spesialis;
    }
    
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
}
