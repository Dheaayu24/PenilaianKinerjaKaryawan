package Tugas1;

import java.util.ArrayList;

public class order {
    private final ArrayList<MenuItem> daftarPesanan = new ArrayList<>();
    private final ArrayList<Integer> jumlahPesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem item, int jumlah) {
        daftarPesanan.add(item);
        jumlahPesanan.add(jumlah);
    }

    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < daftarPesanan.size(); i++) {
            total += daftarPesanan.get(i).getHarga() * jumlahPesanan.get(i);
        }
        return total;

    }

    public void cetakNota() {
        System.out.println("=== Nota Pemesanan ===");
        for (int i = 0; i < daftarPesanan.size(); i++) {
            System.out.println(
                    daftarPesanan.get(i).getNama() + " x" + jumlahPesanan.get(i) +
                    " = Rp " + (daftarPesanan.get(i).getHarga() * jumlahPesanan.get(i))
            );
        }
        System.out.println("------------------------");
        System.out.println("Total: Rp " + hitungTotal());
    }
}
