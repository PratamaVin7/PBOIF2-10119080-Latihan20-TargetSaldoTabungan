/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Target Saldo Tabungan
 */
public class PBOIF210119080Latihan20TargetSaldoTabungan {

    public static Double bunga, totalbunga;
    public static int saldotarget, lama, saldoawal;
    
    public static double hitungbunga(double bunga, int saldo) {
        totalbunga = bunga * saldo;
        return totalbunga;
    }
    
    public static void tampilsaldo(double bunga, int saldo, int saldotarget) {
        lama = 1;
        while(saldo < saldotarget) {
            saldo += hitungbunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+lama+" Rp. %,d%n", saldo);
            lama++;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tampilsaldo(0.08, 3500000, 6000000);      
    }
    
}
