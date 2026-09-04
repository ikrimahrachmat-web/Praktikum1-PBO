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
        mahasiswa mahasiswa1 = new mahasiswa ("L0325001", "Arifa", "Informatika",5);
        mahasiswa mahasiswa2 = new mahasiswa ("L0325044","Alivia","Informatika", 5);
        mahasiswa mahasiswa3 = new mahasiswa ("24040124140117", "Haza", "Fisika", 5);
        
        //memanggil method
        mahasiswa1.tamplikanInfo();
        mahasiswa2.tamplikanInfo();
        mahasiswa3.tamplikanInfo();
     
    }
}
