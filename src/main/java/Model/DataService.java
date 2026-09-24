/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class DataService {


    private String pelanggan;
    private String jenisAc;
    private String keluhan;
    private String teknisi;
    private double biaya;


    public DataService(
        String pelanggan,
        String jenisAc,
        String keluhan,
        String teknisi,
        double biaya
    ) {
        this.pelanggan = pelanggan;
        this.jenisAc = jenisAc;
        this.keluhan = keluhan;
        this.teknisi = teknisi;
        this.biaya = biaya;
    }


    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }


    public String getJenisAc() {
        return jenisAc;
    }

    public void setJenisAc(String jenisAc) {
        this.jenisAc = jenisAc;
    }


    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

   
    public String getTeknisi() {
        return teknisi;
    }

    public void setTeknisi(String teknisi) {
        this.teknisi = teknisi;
    }


    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
}