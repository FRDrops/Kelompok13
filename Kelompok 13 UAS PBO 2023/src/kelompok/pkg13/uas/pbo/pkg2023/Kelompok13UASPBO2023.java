/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelompok.pkg13.uas.pbo.pkg2023;

/**
 *
 * @authorrm.ASUS
 */
public class Kelompok13UASPBO2023 {

    /**
     * @paramrm.args the command linerm.arguments
     */
      
    public static void main(String[]args) {
        // TODO coderm.application logic here
        RotiManis rm = new RotiManis();
        RotiTawar rt = new RotiTawar();
        Pizza p = new Pizza();
        KalkulasiHarga KH = new KalkulasiHarga();
        rm.a1 = 50;
        rm.a2 = 100;
        rm.a3 = 70;
        rt.b1 = 20;
        rt.b2 = 15;
        p.c = 10;
        int akg1 = rm.a1*65;
        int akg2 = rm.a2*65;
        int akg3 = rm.a3*70;
        int bkg1 = rt.b1*480;
        int bkg2 = rt.b2*480;
        int ckg = p.c/250;
        double total;
        double totalm;
        p.modalP();
        rm.modalRM();
        rt.modalRT();
        p.hargaJualP();
        rm.hargaJualRM();
        rt.hargaJualRT();
        total = rm.hargaJualRM() + rt.hargaJualRT() + p.hargaJualP();
        totalm = rm.modalRM() + rt.modalRT() + p.modalP();
        
        
        System.out.println("Pesananrm.anda: ");
        System.out.println("1. Roti Manis Varian 1 " +rm.a1 + " pcs" );
        System.out.println("2. Roti Manis Varian 2 " +rm.a2 + " pcs");
        System.out.println("3. Roti Manis Varian 2 " +rm.a3 + " pcs");
        System.out.println("4. Roti Tawar Varian 1 " + rt.b1 + " pcs");
        System.out.println("5. Roti Tawar Varian 2 " + rt.b2 + " pcs");
        System.out.println("6. Pizza Varian 1 " + p.c + " pcs");
        
        System.out.println("Total Bayar " + Math.round(total) );
        System.out.println("Total Modal " + Math.round(totalm));
        
    }
    
}
