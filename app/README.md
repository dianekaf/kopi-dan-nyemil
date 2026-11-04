# Aplikasi Kopi dan Nyemil - UTS Pengembangan Aplikasi Mobile

Aplikasi mobile Android native berbasis Kotlin yang mengimplementasikan alur pemesanan makanan dan minuman secara interaktif sesuai *wireframe* rancangan antarmuka.

## 📱 Fitur & Alur Layar
1. **Splash Screen**: Layar sambutan awal (*landing screen*) dengan logo dan tombol *Start Now*.
2. **Sign Up (Landing)**: Pilihan awal untuk navigasi masuk (*Login*) atau mendaftar (*Register*).
3. **Login User**: Form autentikasi *username* dan *password*.
4. **Register**: Form pendaftaran akun baru.
5. **Home Screen**: Katalog menu makanan & minuman lengkap (17 item) terbagi kategori ☕ Kopi & Minuman serta 🍽️ Makanan & Cemilan.
6. **Profile Screen**: Pengaturan informasi profil pengguna.
7. **Alamat Pengiriman (Order)**: Form pengisian rincian nama, alamat, dan rincian lokasi pengiriman.
8. **Konfirmasi Pesanan**: Halaman status keberhasilan pesanan setelah pengiriman form.

## 🛠️ Spesifikasi & Teknologi
- **Bahasa Pemrograman**: Kotlin
- **UI Framework**: Android XML (Layouting)
- **Minimum SDK**: API 24 (Android 7.0 Nougat atau lebih tinggi)
- **Arsitektur Navigasi**: Explicit & Implicit Intents (`Intent.FLAG_ACTIVITY_CLEAR_TASK`)

## 🚀 Cara Menjalankan Aplikasi
1. *Clone* repositori ini ke komputer lokal:
   ```bash
   git clone [https://github.com/dianekaf/kopi-dan-nyemil.git](https://github.com/dianekaf/kopi-dan-nyemil.git)