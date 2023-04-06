class Barang{
    String nama;
    int amount;

    public Barang(String nama, int amount){
        this.nama = nama;
        this.amount = amount;
    }

    public String toString(){
        String ans = this.amount + " " + this.nama;
        return ans;
    }
}