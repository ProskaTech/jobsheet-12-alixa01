//author 21343040_alixa arivya tofer
package latihan1;

public class JavaInheritance {
    public static void main(String args[]){
        // membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        //membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
