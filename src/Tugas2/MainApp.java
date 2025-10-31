package Tugas2;

/**
 * Kelas {@code Mainpp} berfungsi sebagai titik masuk (entry point)
 * dari program penilaian kinerja karyawan.
 * <p>
 *     Kelas ini membuat objek {PenilaianKinerjaKaryawan}
 *     dengan data contoh, lalu menampilkan hasil penelitian
 *     menggunakan method {@code tampilkanRinciKaryawan()}.
 * </p>
 *
 * <p><b>Langkah kerja program:</b></p>
 * <ol>
 *     <li>Membuat objek karyawan baru.</li>
 *     <li>Menampilkan data lengkap karyawan dan hasil penelitian.</li>
 * </ol>
 *
 * <p><b>Contoh output:</b></p>
 * <pre>
 * Nama Karyawan        : Dhea Ayu
 * Jabatan              : Staff
 * Nilai Kedisiplinan   : 90.0
 * Nilai Tanggung Jawab : 85.0
 * Nilai Kerjasama      : 80.0
 * Nilai Rata-Rata      : 85.0
 * Kategori Kinerja     : Sangat Baik
 * </pre>
 *
 * @author Dhea
 * @version 1.0
 */
public class MainApp {

    /**
     * Method utama (main method) yang akan dijalankan pertama kali oleh program Java.
     * <p>
     * Method ini membuat instance dari kelas {PenilaianKinerjaKaryawan}
     * dengan parameter nama, jabatan, dan nilai-nilai penilaian.
     * setelah itu, program akan menampilkan rincian hasil penelitian
     * </p>
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    // Move method
    public static void main(String[] args) {
        PenilaianKinerjaKaryawan karyawan = new PenilaianKinerjaKaryawan("Dhea Ayu", "Staff", 90, 85, 80);
        karyawan.tampilkanRinciKaryawan();
    }
}