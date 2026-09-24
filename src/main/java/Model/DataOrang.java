/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class DataOrang {


    private String nama;
    private int noHp;


    public DataOrang(String nama, int noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public int getNoHp() {
        return noHp;
    }


    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }
}