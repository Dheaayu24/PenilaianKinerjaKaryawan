package Tugas1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        order order = new order();

        MenuItem nasi = new MenuItem("Nasi Goreng Sambel Cummi", 20000);
        MenuItem mie = new MenuItem("Mie Kuah", 10000);
        MenuItem minuman = new MenuItem("Teh Tarik", 6000);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.println("Selamat datang, " + nama + "!");
        System.out.println("Pesanan Anda:");

        order.tambahPesanan(nasi, 2);
        order.tambahPesanan(mie, 1);
        order.tambahPesanan(minuman, 2);

        order.cetakNota();
    }
}