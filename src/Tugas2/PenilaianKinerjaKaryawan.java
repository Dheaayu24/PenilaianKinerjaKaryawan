package Tugas2;

/**
 * Kelas {@code PenilaianKinerjaKaryawan} digunakan untuk menilai kinerja seorang karyawan
 * berdasarkan tiga aspek utama, yaitu:
 * <ul>
 *     <li>Kedisiplinan</li>
 *     <li>Tanggung Jawab</li>
 *     <li>Kerjasama</li>
 * </ul>
 *
 * <p>Kelas ini menggunakan prinsip <b>encapsulation</b> untuk menjaga keamanan data
 * serta menerapkan beberapa teknik <b>refactoring</b> seperti:</p>
 * <ul>
 *     <li>Extract Method</li>
 *     <li>Rename Method</li>
 *     <li>Inline Variable</li>
 *     <li>Introduce Constant</li>
 * </ul>
 *
 * <p>Program ini menampilkan detail penilaian karyawan, menghitung hasil rata-rata,
 * dan menentukan kategori kinerja berdasarkan nilai tersebut.</p>
 *
 * <p><b>Contoh penggunaan:</b></p>
 * <pre>{@code
 * PenilaianKinerjaKaryawan Karyawan =
 *       new PenilaianKinerjaKaryawan("Dhea Ayu", "Staff", 90, 85, 80);
 * karyawan.tampilkanRinciKaryawan();
 * }</pre>
 *
 * @author Dhea
 * @version 1.0
 */
public class PenilaianKinerjaKaryawan {

    /** Nilai minimum untuk kategori "Baik" */
    public static final int NILAI_MINIMUM_KATEGORI = 70;
    // Encapsulated Field

    /** Nama Karyawan */
    private String namaKaryawan;
    /** Jabatan Karyawan */
    private String jabatan;
    /** Nilai Kedisiplinan Karyawan */
    private double nilaiKedisiplinan;
    /** Nilai Tanggung Jawab Karyawan */
    private double nilaiTanggungJawab;
    /** Nilai Kerjasama Karyawan */
    private double nilaiKerjasama;

    // Konstruktor

    /**
     * Membuat objek {@code PenilaianKinerjaKaryawan} dengan data awal.
     * @param namaKaryawan nama karyawan
     * @param jabatan jabatan karyawan
     * @param nilaiKedisiplinan nilai kedisiplinan
     * @param nilaiTanggungJawab nilai tanggung jawab
     * @param nilaiKerjasama nilai kerjasama
     */
    public PenilaianKinerjaKaryawan(String namaKaryawan, String jabatan, double nilaiKedisiplinan, double nilaiTanggungJawab, double nilaiKerjasama) {
        this.setNamaKaryawan(namaKaryawan);
        this.setJabatan(jabatan);
        this.setNilaiKedisiplinan(nilaiKedisiplinan);
        this.setNilaiTanggungJawab(nilaiTanggungJawab);
        this.setNilaiKerjasama(nilaiKerjasama);
    }

    // Extract Method - rename method - inline variabel

    /**
     * Menampilkan informasi lengkap mengenai penilaian karyawan,
     * termasuk nilai masing-masing aspek, nilai rata-rata,
     * serta kategori kinerja.
     */
    public void tampilkanRinciKaryawan() {

        System.out.println("Nama Karyawan       : " + getNamaKaryawan());
        System.out.println("Jabatan             : " + getJabatan());
        System.out.println("Nilai Kedisiplinan  : " + getNilaiKedisiplinan());
        System.out.println("Nilai Tanggung Jawab: " + getNilaiTanggungJawab());
        System.out.println("Nilai Kerjasama     : " + getNilaiKerjasama());
        System.out.println("Nilai Rata-Rata     : " + hitungRataRata() / 3);

        if (hitungRataRata() / 3 >= 85) {
            System.out.println("Kategori Kinerja    : Sangat Baik");
        } else if (hitungRataRata() / 3 >= NILAI_MINIMUM_KATEGORI) { // introduce constant
            System.out.println("Kategori Kinerja    : Baik");
        } else {
            System.out.println("Kategori Kinerja    : Perlu Ditingkatkan");
        }
    }

    public boolean isBerprestasiTinggi() {
        return hitungRataRata() / 3 >= 90;
    }

    /**
     * Menghitung total nilai dari ketiga aspek penilaian.
     *
     * @return jumlah dari kedisiplinan, tanggung jawab, dan kerjasama
     */

    private double hitungRataRata() {
        return getNilaiKedisiplinan() + getNilaiTanggungJawab() + getNilaiKerjasama();
    }

    /**
     * Mengambil nama karyawan
     * @return nama karyawan
     */
    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    /**
     * Mengatur nama karyawan
     * @param namaKaryawan nama karyawan
     */
    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    /**
     * Mengambil jabatan karyawan
     * @return jabatan karyawan
     */
    public String getJabatan() {
        return jabatan;
    }

    /**
     * Mengatur jabatan karyawan
     * @param jabatan jabatan karyawan
     */
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    /**
     * Mengambil nilai kedisiplinan
     * @return nilai kedisiplinan
     */
    public double getNilaiKedisiplinan() {
        return nilaiKedisiplinan;
    }

    /**
     * Mengatur nilai kedisiplinan
     * @param nilaiKedisiplinan nilai kedisiplinan
     */
    public void setNilaiKedisiplinan(double nilaiKedisiplinan) {
        this.nilaiKedisiplinan = nilaiKedisiplinan;
    }

    /**
     * Mengambil nilai tanggung jawab
     * @return nilai tanggung jawab
     */
    public double getNilaiTanggungJawab() {
        return nilaiTanggungJawab;
    }

    /**
     * Mengatur nilai tanggung jawab
     * @param nilaiTanggungJawab nilai tanggung jawab
     */
    public void setNilaiTanggungJawab(double nilaiTanggungJawab) {
        this.nilaiTanggungJawab = nilaiTanggungJawab;
    }

    /**
     * Mengambil nilai kerjasama
     * @return nilai kerjasama
     */
    public double getNilaiKerjasama() {
        return nilaiKerjasama;
    }

    /**
     * Mengatur nilai kerjasama
     * @param nilaiKerjasama nilai kerjasama
     */
    public void setNilaiKerjasama(double nilaiKerjasama) {
        this.nilaiKerjasama = nilaiKerjasama;
    }
}