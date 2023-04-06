class DaftarBelanja{
    Barang[] listBelanja;
    int Max;
    int indexEff;

    public DaftarBelanja(int Max){
        this.listBelanja = new Barang[Max];
        this.indexEff = 0;
        this.Max = Max;
    }

    public void belanja(int lorong, int qty, String keterangan){
        String namaBaru = keterangan + " (lorong " + lorong + ")";
        if(this.indexEff >= this.Max){

        } else {
            this.listBelanja[this.indexEff] = new Barang(namaBaru, qty);
            this.indexEff += 1;
        }
    }

    public void belanja(int lorong, String keterangan){
        String namaBaru = keterangan + " (lorong " + lorong + ")";
        if (this.indexEff >= this.Max){
        } else {
            this.listBelanja[this.indexEff] = new Barang(namaBaru, 1);
            this.indexEff += 1;
        }
    }

    public void belanja(String barang){
        if (this.indexEff >= this.Max){

        } else {
            this.listBelanja[this.indexEff] = new Barang(barang, 1);
            this.indexEff += 1;
        }
    }

    public void belanja(String barang, int qty){
        if (this.indexEff >= this.Max){

        } else {
            this.listBelanja[this.indexEff] = new Barang(barang, qty);
            this.indexEff += 1;
        }
    }

    public void print(){
        for(int i = 0; i < this.indexEff; i++){
            System.out.println(i+1 + ". " + this.listBelanja[i].toString());
        }
    }
}