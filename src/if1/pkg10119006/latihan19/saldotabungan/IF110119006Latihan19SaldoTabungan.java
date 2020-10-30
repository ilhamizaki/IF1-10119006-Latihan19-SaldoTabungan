/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Saldo tabungan perbulan
 */
public class IF110119006Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //varibel
        int saldoAwal, bulan, saldo, bunga;
        double bungaPersen;
        
        //input
        saldoAwal = 2500000;
        bungaPersen = 0.15;
        bulan = 6;
        
        //output
        for(int i=1; i <= bulan; i++) {
            bunga = (int) (saldoAwal * bungaPersen);
            saldo = saldoAwal + bunga;
            saldoAwal = saldo;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldo); 
        }
    }
    
}
