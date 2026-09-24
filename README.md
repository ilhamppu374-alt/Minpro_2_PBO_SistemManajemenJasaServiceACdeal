Nama : Muhammad Ilham Zaini
<br>
Kelas : Sistem Informasi C'25
<br>
Nim : 2509116091
<br>

# Sistem Manajemen Jasa Service AC

## <b>1. Deskripsi Singkat Program</b>

Sistem Manajemen Jasa Service AC merupakan program berbasis Java yang berguna untuk mengelola data teknisi, data pelanggan, dan data service AC. Program ini dijalankan melalui console dan menggunakan <b>ArrayList</b> untuk menyimpan data selama program berjalan.

Program ini memiliki tiga menu utama, yaitu:

<b>1. Data Pelanggan</b>, digunakan untuk mengelola data teknisi yang melakukan service AC.

<b>2. Data Teknisi</b>, digunakan untuk mengelola data pelanggan yang menggunakan jasa service AC.

<b>3. Data Service AC</b>, digunakan untuk mengelola data service AC yang dilakukan oleh teknisi kepada pelanggan.

Setiap menu dari sistem manajemen jasa service AC ini memiliki fitur <b> CRUD (Create, Read, Update, Delete)</b>, yaitu menambah, melihat, mengubah, dan menghapus data.

---

## <b>2. Penjelasan Alur Program</b>

Ketika program dijalankan, sistem akan menampilkan <b>Menu Utama</b> yang terdiri dari menu Data Pelanggan, Data Teknisi, Data Servis AC, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia. Setelah memilih salah satu menu, sistem akan menampilkan submenu yang berisi fitur tambah, lihat, ubah, hapus, dan kembali ke menu utama.

<b>A. Menu Data Pelanggan</b>

Menu Data Pelanggan digunakan untuk mengelola informasi pelanggan yang menggunakan jasa servis AC.

Terdapat beberapa pilihan:

<b>1. Tambah Pelanggan</b>, Pengguna memasukkan nama pelanggan, alamat, dan nomor HP. Data tersebut kemudian dibuat menjadi objek Pelanggan dan disimpan ke dalam ArrayList.

<b>2. Lihat Pelanggan</b> ,Sistem menampilkan seluruh data pelanggan yang telah tersimpan. Data yang ditampilkan meliputi nama, alamat, dan nomor HP pelanggan.

<b>3. Ubah Pelanggan</b>, Pengguna memilih nomor pelanggan yang ingin diubah. Setelah itu, pengguna dapat memasukkan nama, alamat, dan nomor HP baru.

<b>4. Hapus Pelanggan</b>, Pengguna memilih nomor pelanggan yang ingin dihapus, kemudian sistem menghapus data pelanggan tersebut dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>B. Menu Data Teknisi</b>

Menu Data Teknisi digunakan untuk mengelola data teknisi yang menangani pekerjaan servis AC.

Terdapat beberapa pilihan:

<b>1. Tambah Teknisi</b>, Pengguna memasukkan nama teknisi dan nomor HP. Data tersebut kemudian dibuat menjadi objek Teknisi dan disimpan ke dalam ArrayList.

<b>2. Lihat Teknisi</b>, Sistem menampilkan seluruh data teknisi yang telah tersimpan. Informasi yang ditampilkan berupa nama dan nomor HP teknisi.

<b>3. Ubah Teknisi</b>, Pengguna memilih nomor teknisi yang ingin diubah, kemudian memasukkan nama dan nomor HP baru.

<b>4. Hapus Teknisi</b>, Pengguna memilih nomor teknisi yang ingin dihapus, kemudian sistem menghapus data teknisi tersebut dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>C. Menu Data Servis AC</b>

Menu Data Servis AC digunakan untuk mengelola data pekerjaan servis AC yang dilakukan untuk pelanggan.

Terdapat beberapa pilihan:

<b>1. Tambah Servis</b>, Pengguna memasukkan nama pelanggan, jenis AC, keluhan, nama teknisi, dan biaya servis. Data tersebut kemudian dibuat menjadi objek Service dan disimpan ke dalam ArrayList.

<b>2. Lihat Servis</b>, Sistem menampilkan seluruh data servis AC yang telah tersimpan. Informasi yang ditampilkan meliputi pelanggan, jenis AC, keluhan, teknisi, dan biaya servis.

<b>3. Ubah Servis</b>, Pengguna memilih nomor servis yang ingin diubah. Setelah itu, pengguna dapat memasukkan nama pelanggan, jenis AC, keluhan, teknisi, dan biaya servis yang baru.

<b>4. Hapus Servis</b>, Pengguna memilih nomor servis yang ingin dihapus, kemudian sistem menghapus data servis tersebut dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>D. Keluar Program</b>, Jika pengguna memilih menu <b>0. Keluar</b> pada Menu Utama, sistem akan menampilkan pesan:

<b>"Terima kasih telah menggunakan sistem."</b>

Setelah itu, perulangan program akan berhenti.

---

## <b>3. Dokumentasi Program</b>

### <b>A. Menu Data Pelanggan</b>

Berikut merupakan dokumentasi tampilan Menu Data Pelanggan yang digunakan untuk mengelola data pelanggan. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data pelanggan.

<img width="230" height="160" alt="Screenshot 2026-09-10 215541" src="https://github.com/user-attachments/assets/6dec70e9-7c64-4bbe-9410-62e96818796a" />


### <b>B. Menu Data Teknisi</b>

Berikut merupakan dokumentasi tampilan Menu Data Teknisi yang digunakan untuk mengelola data teknisi. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data teknisi.

<img width="237" height="152" alt="Screenshot 2026-09-10 215746" src="https://github.com/user-attachments/assets/0cd7b534-c447-4a1d-9861-24757018b8a6" />

### <b>C. Menu Data Service AC</b>

Berikut merupakan dokumentasi tampilan Menu Data Servis AC yang digunakan untuk mengelola data pekerjaan servis AC. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data servis.

<img width="277" height="152" alt="Screenshot 2026-09-10 215953" src="https://github.com/user-attachments/assets/fd3f8ab3-c84c-490e-ad35-d39339450e5a" />

## <b>3. Implementasi Program</b>

### <b>3.1 Implementasi Menu Data Pelanggan</b>

<p> Menu Data Pelanggan digunakan untuk mengelola data pelanggan yang menggunakan jasa servis AC. Pada menu ini terdapat fitur <b>Tambah Pelanggan</b>, <b>Lihat Pelanggan</b>, <b>Ubah Pelanggan</b>, dan <b>Hapus Pelanggan</b>. </p>

<img width="345" height="706" alt="image" src="https://github.com/user-attachments/assets/712e1041-79b3-4802-81f6-d80df0004e74" />
  <img width="278" height="186" alt="image" src="https://github.com/user-attachments/assets/623f6db8-d808-46d3-b49c-aa190cb526dd" />

<p align="center">
  <b>Gambar 3.1 Implementasi Menu Data Pelanggan</b>
</p>

### <b>3.2 Implementasi Menu Data Teknisi</b>

<p> Menu Data Teknisi digunakan untuk mengelola data teknisi yang bertugas melakukan servis AC. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data teknisi yang tersimpan dalam sistem. </p>

<p align="center">
<img width="321" height="845" alt="Screenshot 2026-09-10 222712" src="https://github.com/user-attachments/assets/720702a0-3daf-42eb-b2c0-5a2553fc637c" />
  <img width="317" height="386" alt="Screenshot 2026-09-10 222759" src="https://github.com/user-attachments/assets/48869be9-8c5a-434a-91b5-6515efa25373" />
</p>

<p align="center">
  <b>Gambar 3.2 Implementasi Menu Data Teknisi</b>
</p>

### <b>3.3 Implementasi Menu Data Service AC </b>

<p> Menu Data Servis AC digunakan untuk mengelola data pekerjaan servis AC. Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus data servis yang telah tersimpan. </p>

<p align="center">
<img width="552" height="781" alt="image" src="https://github.com/user-attachments/assets/0060e5d4-68b8-4c3b-8b30-90095908b9d3" />
 <img width="288" height="187" alt="image" src="https://github.com/user-attachments/assets/91d2e5df-88fa-4a7b-bc1a-25ab66aee1b6" />

<p align="center">
  <b>Gambar 3.4 Implementasi Menu Data Service AC</b>
</p>

### <b>3.4 Lainnya </b>

<p> Disini saya menerapkan output yang lebih interaktif untuk pengguna program. </p>

<p align="center">
<img width="532" height="507" alt="image" src="https://github.com/user-attachments/assets/40299a35-45aa-49d7-b3b4-86ef469197b9" />
 <img width="223" height="355" alt="image" src="https://github.com/user-attachments/assets/2ede7af5-f5b5-4e1f-9d46-967682a53140" />

 ### <b>3.5 Implementasi Penerapan Validasi Input </b>

<p> Disini saya menerapkan Validasi Input, yang dimana ini berguna untuk kita dapat menggunakan hak aksesnya, seperti private, public, dll.</p>

<p align="center">
<img width="617" height="55" alt="image" src="https://github.com/user-attachments/assets/3462236b-ddd2-47fc-b509-f633d58e32c8" />

<p align="center">
  <b>Gambar 3.5 Implementasi Validasi Input</b>
</p>

 ### <b>3.6 Implementasi Penerapan Encapsulation </b>

<p> Disini saya menerapkan Encapsulation agar dapat memberikan hak akses ke dalam setiap sub classnya. </p>

<p align="center">
<img width="305" height="187" alt="image" src="https://github.com/user-attachments/assets/94053bb2-488e-4504-90fc-8cc96616f267" />

 <p align="center">
  <b>Gambar 3.6 Implementasi Encapsulation</b>
</p>

 ### <b>3.7 Implementasi Penerapan inheritance  </b>

<p> Disini saya menerapkan Inheritance, yang dimana menambahkan DataOrang sebagai Superclass dan isinya ada Subclass DataTeknisi, DataPelanggan  </p>

<p align="center">
<img width="1067" height="680" alt="image" src="https://github.com/user-attachments/assets/0f2617be-8d57-4557-a4e7-d28403a0afef" />  
<img width="1032" height="391" alt="image" src="https://github.com/user-attachments/assets/397e2a3f-c537-413a-baa0-2a0af5c48310" />

 <p align="center">
  <b>Gambar 3.7 Implementasi Inheritance</b>
</p>

 ### <b>3.8 Implementasi Penerapan Dummy Data </b>

<p> Disini saya menerapkan Dummy Data pada DataTeknisi. </p>

<p align="center">
<img width="620" height="392" alt="image" src="https://github.com/user-attachments/assets/bab4e162-85dc-4e07-9107-fa453f29dc72" />
<img width="317" height="185" alt="image" src="https://github.com/user-attachments/assets/c3557949-b73d-47a4-9d7d-b77cefe14ceb" />

 <p align="center">
  <b>Gambar 3.8 Implementasi Dummmy Data</b>
</p>
