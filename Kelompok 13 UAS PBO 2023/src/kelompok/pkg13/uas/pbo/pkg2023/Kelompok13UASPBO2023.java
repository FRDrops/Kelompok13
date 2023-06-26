/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelompok.pkg13.uas.pbo.pkg2023;

/**
 *
 * @author ASUS
 */
public class Kelompok13UASPBO2023 {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        int a1 = 50;
        int a2 = 100;
        int a3 = 70;
        int b1 = 20;
        int b2 = 15;
        int c = 10;
        int akg1 = a1*65;
        int akg2 = a2*65;
        int akg3 = a3*70;
        int bkg1 = b1*480;
        int bkg2 = b2*480;
        int ckg = c/250;
        RotiManis rm = new RotiManis();
        RotiTawar rt = new RotiTawar();
        Pizza p = new Pizza();
        KalkulasiHarga KH = new KalkulasiHarga();
        p.modalP();
        rm.modalRM();
        rt.modalRT();
        p.hargaJualP();
        rm.hargaJualRM();
        rt.hargaJualRT();
        
        
        System.out.println("Pesanan anda: ");
        System.out.println("1. Roti Manis Varian 1 " + a1 + " pcs" );
        System.out.println("2. Roti Manis Varian 2 " + a2 + " pcs");
        System.out.println("3. Roti Manis Varian 2 " + a3 + " pcs");
        System.out.println("4. Roti Tawar Varian 1 " + b1 + " pcs");
        System.out.println("5. Roti Tawar Varian 2 " + b2 + " pcs");
        System.out.println("6. Pizza Varian 1 " + c + " pcs");
        
        System.out.println("Total Bayar " +  + rm.hargaJualRM() + rt.hargaJualRT() + p.hargaJualP());
        
    }
    
}
