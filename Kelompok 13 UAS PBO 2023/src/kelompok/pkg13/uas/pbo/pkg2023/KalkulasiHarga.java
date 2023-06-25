/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok.pkg13.uas.pbo.pkg2023;

/**
 *
 * @author ASUS
 */
public class KalkulasiHarga {
    int var1;
    int var2;
    int var3;
    int a;
    int b;
    int c;
    int d;
    int akg;
    int bkg;
    int ckg;
    void JumlahRoti(){
        a = akg/50;
        b = bkg/400;
        c = ckg/190;
    }
    void TotalHargaU(){
       d = d*140/100;
    }
    void Modal(){
        d = a*var1 + b*var2 + c*var3;
    }
}
