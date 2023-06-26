/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok.pkg13.uas.pbo.pkg2023;

import Interfaceses.Adonan;
import Interfaceses.HargaKomposisi;

/**
 *
 * @author ASUS
 */
public class RotiTawar extends FillingTopping implements Adonan{

    @Override
    public double hargaKeju() {
        double Keju = 31000/250 ;
        return Keju ;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hargaCoklat() {
        double Coklat = 29000/500 ;
        return Coklat ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hargaVanilla() {
        double Vanilla = 30000/500 ; 
        return Vanilla ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hargaSelaiRedBean() {
        double RedBean =  25000/500 ;
        return RedBean ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hargaSosis() {
        double Sosis = 80000/1000 ;
        return Sosis ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hargaSmokedBeef() {
        double SmokedBeef = 90000/1000 ;
        return SmokedBeef ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double hargaBawangBombay() {
        double BawangBombay = 40000/500 ;
        return BawangBombay ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double totalHargaFilling() {
        double total = this.hargaCoklat () + this.hargaKeju()  ;
        return total ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double totalHargaTopping() {
        return 0 ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratTepungTerigu() {
        double TepungTerigu = 40000/1000 ;
        return TepungTerigu ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratGula() {
        double Gula = 25000/1000 ;
        return Gula ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratButter() {
        double Butter = 23000/500 ;
        return Butter ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratRagi() {
        double Ragi = 5000/11 ;
        return Ragi ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratSusuBubuk() {
        double SusuBubuk = 39000/1000 ;
        return SusuBubuk ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratSusuCair() {
        double SusuCair = 24000/1000 ;
        return SusuCair ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratTelur() {
        double Telur = 23000/1000 ;
        return Telur ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratEsBatu() {
        double EsBatu = 2000/1000;
        return EsBatu ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double beratTotalAdonan() {
        double TotalAdonan = this.beratTepungTerigu() + this.beratGula() + this.beratButter() + this.beratRagi() + this.beratSusuBubuk () + this.beratSusuCair() + this.beratTelur() + this.beratEsBatu();
        return TotalAdonan ;
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
