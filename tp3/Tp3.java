/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tp3;

/**
 *
 * @author Ivan
 */

class Prodi {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
}

class Mahasiswa {
    private String nama;
    private Prodi prodi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi.getNama();
    }

    public void displayMahasiswa() {
        System.out.println("Nama Mahasiswa: " + this.nama);
        System.out.println("Nama Prodi: " + this.getProdi());
        System.out.println("------------------------");
    }
}

public class Tp3 {
    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();

        pr1.setNama("Informatika");
        pr2.setNama("Data Science");

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();

        mhs1.setNama("Bruce Wayne");
        mhs1.setProdi(pr1);

        mhs2.setNama("Tony Stark");
        mhs2.setProdi(pr2);

        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
}
