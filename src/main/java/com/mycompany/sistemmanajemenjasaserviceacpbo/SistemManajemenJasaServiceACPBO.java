/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenjasaserviceacpbo;

import Model.DataPelanggan;
import Model.DataService;
import Model.DataTeknisi;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class SistemManajemenJasaServiceACPBO {


    public static int inputAngka(Scanner input, String pesan) {

        while (true) {

            System.out.print(pesan);

            if (input.hasNextInt()) {
                return input.nextInt();
            } else {

                System.out.println(
                    "Input harus berupa angka! Coba lagii"
                );

                input.next();
            }
        }
    }

    public static double inputDouble(
        Scanner input,
        String pesan
    ) {

        while (true) {

            System.out.print(pesan);

            if (input.hasNextDouble()) {
                return input.nextDouble();
            } else {

                System.out.println(
                    "Input harus berupa angka! Coba lagii"
                );

                input.next();
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArrayList<DataPelanggan> daftarPelanggan =
            new ArrayList<>();

        ArrayList<DataTeknisi> daftarTeknisi =
            new ArrayList<>();

        ArrayList<DataService> daftarService =
            new ArrayList<>();



        int pilihan;


        
        do {

            System.out.println(
                "\n=== SISTEM MANAJEMEN JASA SERVIS AC ==="
            );

            System.out.println("1. Data Pelanggan");
            System.out.println("2. Data Teknisi");
            System.out.println("3. Data Servis AC");
            System.out.println("0. Keluar");

            pilihan = inputAngka(input, "Pilih menu: ");
            input.nextLine();


            switch (pilihan) {



                case 1:

                    int pilihanPelanggan;

                    do {

                        System.out.println(
                            "\n=== DATA PELANGGAN ==="
                        );

                        System.out.println("1. Tambah Pelanggan");
                        System.out.println("2. Lihat Pelanggan");
                        System.out.println("3. Ubah Pelanggan");
                        System.out.println("4. Hapus Pelanggan");
                        System.out.println("0. Kembali");

                        pilihanPelanggan =
                            inputAngka(
                                input,
                                "Pilih menu: "
                            );

                        input.nextLine();


                        switch (pilihanPelanggan) {



                            case 1:

                                System.out.print(
                                    "Nama Pelanggan: "
                                );

                                String nama =
                                    input.nextLine();

                                System.out.print(
                                    "Alamat: "
                                );

                                String alamat =
                                    input.nextLine();

                                int noHp =
                                    inputAngka(
                                        input,
                                        "Nomor HP: "
                                    );

                                input.nextLine();

                                daftarPelanggan.add(
                                    new DataPelanggan(
                                        nama,
                                        alamat,
                                        noHp
                                    )
                                );

                                System.out.println(
                                    "Pelanggan berhasil ditambahkan yakk :)!"
                                );

                                break;


                                
                            case 2:

                                if (
                                    daftarPelanggan.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data pelanggan, jangan lupa di input dulu ya datanya!."
                                    );

                                } else {

                                    System.out.println(
                                        "\n=== DAFTAR PELANGGAN ==="
                                    );

                                    for (
                                        int i = 0;
                                        i < daftarPelanggan.size();
                                        i++
                                    ) {

                                        DataPelanggan p =
                                            daftarPelanggan.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            p.getNama() +
                                            " | " +
                                            p.getAlamat() +
                                            " | " +
                                            p.getNoHp()
                                        );
                                    }
                                }

                                break;



                            case 3:

                                if (
                                    daftarPelanggan.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data pelanggan, jangan lupa di input dulu ya datanya!."
                                    );

                                } else {

                                    int no =
                                        inputAngka(
                                            input,
                                            "Nomor pelanggan: "
                                        );

                                    input.nextLine();

                                    if (
                                        no >= 1 &&
                                        no <= daftarPelanggan.size()
                                    ) {

                                        DataPelanggan p =
                                            daftarPelanggan.get(
                                                no - 1
                                            );

                                        System.out.print(
                                            "Nama baru: "
                                        );

                                        p.setNama(
                                            input.nextLine()
                                        );

                                        System.out.print(
                                            "Alamat baru: "
                                        );

                                        p.setAlamat(
                                            input.nextLine()
                                        );

                                        p.setNoHp(
                                            inputAngka(
                                                input,
                                                "Nomor HP baru: "
                                            )
                                        );

                                        input.nextLine();

                                        System.out.println(
                                            "Data pelanggan berhasil diubah yakk :)!"
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor pelanggan tidak tersedia, coba lagii."
                                        );
                                    }
                                }

                                break;



                            case 4:

                                if (
                                    daftarPelanggan.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data pelanggan, jangan lupa di input dulu ya datanya!."
                                    );

                                } else {

                                    int no =
                                        inputAngka(
                                            input,
                                            "Nomor pelanggan: "
                                        );

                                    input.nextLine();

                                    if (
                                        no >= 1 &&
                                        no <= daftarPelanggan.size()
                                    ) {

                                        daftarPelanggan.remove(
                                            no - 1
                                        );

                                        System.out.println(
                                            "Pelanggan berhasil dihapus guyss!"
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor pelanggan tidak tersedia."
                                        );
                                    }
                                }

                                break;


                            default:

                                if (pilihanPelanggan != 0) {

                                    System.out.println(
                                        "Pilihan tidak tersedia, coba input yang lain :)."
                                    );
                                }
                        }

                    } while (pilihanPelanggan != 0);

                    break;



                case 2:

                    int pilihanTeknisi;

                    do {

                        System.out.println(
                            "\n=== DATA TEKNISI ==="
                        );

                        System.out.println("1. Tambah Teknisi");
                        System.out.println("2. Lihat Teknisi");
                        System.out.println("3. Ubah Teknisi");
                        System.out.println("4. Hapus Teknisi");
                        System.out.println("0. Kembali");

                        pilihanTeknisi =
                            inputAngka(
                                input,
                                "Pilih menu: "
                            );

                        input.nextLine();


                        switch (pilihanTeknisi) {



                            case 1:

                                System.out.print(
                                    "Nama Teknisi: "
                                );

                                String namaTeknisi =
                                    input.nextLine();

                                int noHpTeknisi =
                                    inputAngka(
                                        input,
                                        "Nomor HP: "
                                    );

                                input.nextLine();

                                daftarTeknisi.add(
                                    new DataTeknisi(
                                        namaTeknisi,
                                        noHpTeknisi
                                    )
                                );

                                System.out.println(
                                    "Teknisi berhasil ditambahkan yakk!"
                                );

                                break;



                            case 2:

                                if (
                                    daftarTeknisi.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data teknisi :("
                                    );

                                } else {

                                    System.out.println(
                                        "\n=== DAFTAR TEKNISI ==="
                                    );

                                    for (
                                        int i = 0;
                                        i < daftarTeknisi.size();
                                        i++
                                    ) {

                                        DataTeknisi t =
                                            daftarTeknisi.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            t.getNama() +
                                            " | " +
                                            t.getNoHp()
                                        );
                                    }
                                }

                                break;



                            case 3:

                                if (
                                    daftarTeknisi.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data teknisi :("
                                    );

                                } else {

                                    int no =
                                        inputAngka(
                                            input,
                                            "Nomor teknisi: "
                                        );

                                    input.nextLine();

                                    if (
                                        no >= 1 &&
                                        no <= daftarTeknisi.size()
                                    ) {

                                        DataTeknisi t =
                                            daftarTeknisi.get(
                                                no - 1
                                            );

                                        System.out.print(
                                            "Nama baru: "
                                        );

                                        t.setNama(
                                            input.nextLine()
                                        );

                                        t.setNoHp(
                                            inputAngka(
                                                input,
                                                "Nomor HP baru: "
                                            )
                                        );

                                        input.nextLine();

                                        System.out.println(
                                            "Data teknisi berhasil diubah yak :)!"
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor teknisi tidak tersedia."
                                        );
                                    }
                                }

                                break;



                            case 4:

                                if (
                                    daftarTeknisi.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data teknisi :(."
                                    );

                                } else {

                                    int no =
                                        inputAngka(
                                            input,
                                            "Nomor teknisi: "
                                        );

                                    input.nextLine();

                                    if (
                                        no >= 1 &&
                                        no <= daftarTeknisi.size()
                                    ) {

                                        daftarTeknisi.remove(
                                            no - 1
                                        );

                                        System.out.println(
                                            "Teknisi berhasil dihapus yak :)"
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor teknisi tidak tersedia :("
                                        );
                                    }
                                }

                                break;


                            default:

                                if (pilihanTeknisi != 0) {

                                    System.out.println(
                                        "Pilihan tidak tersedia, coba input yang lain :)"
                                    );
                                }
                        }

                    } while (pilihanTeknisi != 0);

                    break;



                case 3:

                    int pilihanService;

                    do {

                        System.out.println(
                            "\n=== DATA SERVIS AC ==="
                        );

                        System.out.println("1. Tambah Servis");
                        System.out.println("2. Lihat Servis");
                        System.out.println("3. Ubah Servis");
                        System.out.println("4. Hapus Servis");
                        System.out.println("0. Kembali");

                        pilihanService =
                            inputAngka(
                                input,
                                "Pilih menu: "
                            );

                        input.nextLine();


                        switch (pilihanService) {



                            case 1:

                                System.out.print(
                                    "Nama Pelanggan: "
                                );

                                String pelanggan =
                                    input.nextLine();

                                System.out.print(
                                    "Jenis AC: "
                                );

                                String jenisAc =
                                    input.nextLine();

                                System.out.print(
                                    "Keluhan: "
                                );

                                String keluhan =
                                    input.nextLine();

                                System.out.print(
                                    "Nama Teknisi: "
                                );

                                String teknisi =
                                    input.nextLine();

                                double biaya =
                                    inputDouble(
                                        input,
                                        "Biaya Servis: Rp "
                                    );

                                input.nextLine();

                                daftarService.add(
                                    new DataService(
                                        pelanggan,
                                        jenisAc,
                                        keluhan,
                                        teknisi,
                                        biaya
                                    )
                                );

                                System.out.println(
                                    "Data servis berhasil ditambahkan yak! :)"
                                );

                                break;



                            case 2:

                                if (
                                    daftarService.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data servis :("
                                    );

                                } else {

                                    System.out.println(
                                        "\n=== DAFTAR SERVIS AC ==="
                                    );

                                    for (
                                        int i = 0;
                                        i < daftarService.size();
                                        i++
                                    ) {

                                        DataService s =
                                            daftarService.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            s.getPelanggan() +
                                            " | " +
                                            s.getJenisAc() +
                                            " | " +
                                            s.getKeluhan() +
                                            " | Teknisi: " +
                                            s.getTeknisi() +
                                            " | Rp" +
                                            s.getBiaya()
                                        );
                                    }
                                }

                                break;



                            case 3:

                                if (
                                    daftarService.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data servis :("
                                    );

                                } else {

                                    int no =
                                        inputAngka(
                                            input,
                                            "Nomor servis: "
                                        );

                                    input.nextLine();

                                    if (
                                        no >= 1 &&
                                        no <= daftarService.size()
                                    ) {

                                        DataService s =
                                            daftarService.get(
                                                no - 1
                                            );

                                        System.out.print(
                                            "Nama pelanggan baru: "
                                        );

                                        s.setPelanggan(
                                            input.nextLine()
                                        );

                                        System.out.print(
                                            "Jenis AC baru: "
                                        );

                                        s.setJenisAc(
                                            input.nextLine()
                                        );

                                        System.out.print(
                                            "Keluhan baru: "
                                        );

                                        s.setKeluhan(
                                            input.nextLine()
                                        );

                                        System.out.print(
                                            "Teknisi baru: "
                                        );

                                        s.setTeknisi(
                                            input.nextLine()
                                        );

                                        s.setBiaya(
                                            inputDouble(
                                                input,
                                                "Biaya baru: Rp "
                                            )
                                        );

                                        input.nextLine();

                                        System.out.println(
                                            "Data servis berhasil diubah!"
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor servis tidak tersedia :("
                                        );
                                    }
                                }

                                break;



                            case 4:

                                if (
                                    daftarService.isEmpty()
                                ) {

                                    System.out.println(
                                        "Belum ada data servis :(."
                                    );

                                } else {

                                    int no =
                                        inputAngka(
                                            input,
                                            "Nomor servis: "
                                        );

                                    input.nextLine();

                                    if (
                                        no >= 1 &&
                                        no <= daftarService.size()
                                    ) {

                                        daftarService.remove(
                                            no - 1
                                        );

                                        System.out.println(
                                            "Data servis berhasil dihapus yak!"
                                        );

                                    } else {

                                        System.out.println(
                                            "Nomor servis tidak tersedia disini :("
                                        );
                                    }
                                }

                                break;


                            default:

                                if (pilihanService != 0) {

                                    System.out.println(
                                        "Pilihan tidak tersedia, coba input yang lain :)."
                                    );
                                }
                        }

                    } while (pilihanService != 0);

                    break;



                case 0:

                    System.out.println(
                        "Terima kasih telah menggunakan sistem ini yaa guyss!!."
                    );

                    break;



                default:

                    System.out.println(
                        "Pilihan tidak tersedia, coba input yang lain :)"
                    );
            }

        } while (pilihan != 0);


        input.close();
    }
}