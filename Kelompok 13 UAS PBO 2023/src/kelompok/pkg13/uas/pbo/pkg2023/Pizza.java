/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok.pkg13.uas.pbo.pkg2023;
import Interfaceses.*;
/**
 *
 * @author ASUS
 */
public class Pizza extends FillingTopping implements HargaKomposisi{

    @Override
    public double hargaKeju() {
        double Keju = 31000/250;
        return Keju;
    }

    @Override
    public double hargaCoklat() {
        double Coklat = 29000/500;
        return Coklat;
    }
    
    @Override
    public double hargaVanilla() {
        double Vanilla = 30000/500;
        return Vanilla;
    }

    @Override
    public double hargaSelaiRedBean() {
        double SelaiRedBean = 25000/500;
        return SelaiRedBean;
    }

    @Override
    public double hargaSosis() {
        double Sosis = 80000/1000;
        return Sosis;
    }
    
    @Override
    public double hargaSmokedBeef() {
        double SmokedBeef = 90000/1000;
        return SmokedBeef;
    }

    @Override
    public double hargaBawangBombay() {
        double BawangBombay = 40000/500;
        return BawangBombay;
    }

    @Override
    public double totalHargaFilling() {
        return 0;
    }

    @Override
    public double totalHargaTopping() {
        return this.hargaKeju()*30 + this.hargaSmokedBeef()*50 + this.hargaBawangBombay()*30;
    }

    @Override
    public double hargaTepungTerigu() {
        double TepungTerigu = 40000/1000;
        return TepungTerigu;
    }

    @Override
    public double hargaGula() {
        double Gula = 25000/1000;
        return Gula;
    }
    
    @Override
    public double hargaButter() {
        double Butter = 23000/500;
        return Butter;
    }

    @Override
    public double hargaRagi() {
        double Ragi = 5000/11;
        return Ragi;
    }

    @Override
    public double hargaSusuBubuk() {
        double SusuBubuk = 39000/1000;
        return SusuBubuk;
    }

    @Override
    public double hargaSusuCair() {
        double SusuCair = 24000/1000;
        return SusuCair;
    }

    @Override
    public double hargaTelur() {
        double Telur = 23000/1000;
        return Telur;
    }

    @Override
    public double hargaEsBatu() {
        double EsBatu = 2000/1000;
        return EsBatu;
    }

    @Override
    public double hargaTotalAdonan() {
       double total = this.hargaTepungTerigu()*1000 + this.hargaGula()*100 + this.hargaButter()*100 + this.hargaRagi()*20 + this.hargaSusuBubuk()*200 + this.hargaTelur()*50 + this.hargaEsBatu()*300;
       return total;
    }
    
    public double hargaRoti(){
        return this.totalHargaTopping() + (this.hargaTotalAdonan()/(1950/190));
    }
}
    