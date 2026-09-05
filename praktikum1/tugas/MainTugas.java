/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.tugas;

/**
 *
 * @author admin
 */
public class MainTugas {
    public static void main (String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa ();
        mahasiswa mahasiswa2 = new mahasiswa ("L0325001","Arifa","Informatika");
        mahasiswa mahasiswa3 = new mahasiswa ("24040124140117", "Haza", "Fisika", 5);
        
        //menampilkan data ketiga mhs
        System.out.println("=== DATA KHS MAHASISWA 1 ===");
        mahasiswa1.cetakKHS();

        System.out.println("\n=== DATA KHS MAHASISWA 2 ===");
        mahasiswa2.cetakKHS();

        System.out.println("\n=== DATA KHS MAHASISWA 3 ===");
        mahasiswa3.cetakKHS();
        
     
    }
}
