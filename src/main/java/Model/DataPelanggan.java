/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */

public class DataPelanggan extends DataOrang {

    private String alamat;


    public DataPelanggan(String nama, String alamat, int noHp) {
        super(nama, noHp);
        this.alamat = alamat;
    }


    public String getAlamat() {
        return alamat;
    }


    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}