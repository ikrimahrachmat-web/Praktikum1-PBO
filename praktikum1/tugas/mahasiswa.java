/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.tugas;

/**
 *
 * @author admin
 */
public class mahasiswa {
    String NIM ;
    String Nama ;
    String programStudi ;
    double IPK ;
    // 1. default constructor (tanpa parameter)
    public mahasiswa(){
        this.NIM = "Belum terdaftarl";
        this.Nama = "Belum terdaftar";
        this.programStudi = "Belum terdaftar";
        this.IPK = 0.0 ;
    }
    
    // 2. parameterized construktor (3 parameter : NIM, Nama, programStudi)
    public mahasiswa(String NIM, String Nama, String programStudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.programStudi = programStudi;
        this.IPK = 0.0 ;
    }
    // 3. parameterized construktor (4 parameter : NIM, Nama, programStudi, IPK)
    public mahasiswa(String NIM, String Nama, String programStudi, double IPK){
        this.NIM = NIM;
        this.Nama = Nama;
        this.programStudi = programStudi;
        this.IPK = IPK ;
    }
    //method
     public void cetakKHS () {
        System.out.println("----------------");
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("programStudi : " + programStudi);
        System.out.println("IPK : " + IPK);
        System.out.println("----------------");
    }
}