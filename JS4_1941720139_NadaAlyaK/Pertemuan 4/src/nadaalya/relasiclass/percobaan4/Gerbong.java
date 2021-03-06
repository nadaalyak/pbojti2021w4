/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nadaalya.relasiclass.percobaan4;

/**
 *
 * @author Nada Alya
 */
public class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    private void setKode(String kode) {
        this.kode = kode;
    }

    private String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        int index = nomor - 1;
        if (arrayKursi[index].getPenumpang() != null) {
            System.out.println("Kursi telat terisi, silahkan memilih kursi yang lain!");
        } else {
            this.arrayKursi[index].setPenumpang(penumpang);
        }
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    private Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode : " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
