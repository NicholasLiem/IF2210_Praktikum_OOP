public class TempatTinggal {
    protected int luas;
    protected double hargaBahanBangunan;

    public double hitungBiayaBangun(){
        return luas * hargaBahanBangunan;
    }

    public int getLuas(){
        return luas;
    }

    public double getHargaBahanBangunan(){
        return hargaBahanBangunan;
    }
}

class Rumah extends TempatTinggal {

    public Rumah(int lebar, int panjang, double hargaBahanBangunan) {
        this.luas = lebar * panjang;
        this.hargaBahanBangunan = hargaBahanBangunan;
    }

    public Rumah(int luas, double hargaBahanBangunan) {
        this.luas = luas;
        this.hargaBahanBangunan = hargaBahanBangunan;
    }

    public double hitungBiayaBangun() {
        return super.hitungBiayaBangun();
    }

    public double hitungBiayaBangun(double setoranOrmas){
        return super.hitungBiayaBangun() + setoranOrmas;
    }

    public void setLuas(int lebar, int panjang) {
        this.luas = lebar * panjang;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getLuas() {
        return luas;
    }

    public double getHargaBahanBangunan() {
        return hargaBahanBangunan;
    }

    public void setHargaBahanBangunan(double hargaBahanBangunan) {
        this.hargaBahanBangunan = hargaBahanBangunan;
    }

}

interface Kendaraan{
    public float hitungJarakTempuh();
}

class Karavan extends TempatTinggal implements Kendaraan{
    private float bensin;
    private float pemakaianBensin;

    public void setLuas(int lebar, int panjang) {
        this.luas = lebar * panjang;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getLuas() {
        return luas;
    }

    public void  setHargaBahanBangunan(double hargaBahanBangunan) {
        this.hargaBahanBangunan = hargaBahanBangunan;
    }

    public double getHargaBahanBangunan() {
        return hargaBahanBangunan;
    }

    public float hitungJarakTempuh(){
        return bensin * pemakaianBensin;
    }

    public void setBensin(float a){
        this.bensin = a;
    }

    public void setPemakaianBensin(float a){
        this.pemakaianBensin = a;
    }

    public float getBensin(){
        return bensin;
    }

    public float getPemakaianBensin(){
        return pemakaianBensin;
    }


}