/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author sekar
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    private String gender;
    private String nilai;
    
    public Mahasiswa(String nim, String nama, String kelas, String gender, String nilai){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.gender = gender;
        this.nilai = nilai;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    
    public String getNim() {
        return this.nim;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getKelas() {
        return this.kelas;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getNilai() {
        return this.nilai;
    }
}
