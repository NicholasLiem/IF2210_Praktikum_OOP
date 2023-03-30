/**
 * Elang.java
 * Implementasi dari Elang
 * @author 13521135 Nicholas Liem
 */

public class Elang extends Animal {
    int basePower;
    int jumlahTelur;

    public Elang(int basePower){
        super(2);
        this.basePower = basePower;
        this.jumlahTelur = 0;
    }

    public int getJumlahTelur(){
        return this.jumlahTelur;
    }

    public void bertelur(){
        this.jumlahTelur += 1;
    }

    public int getAnimalPower(){
        return this.basePower * super.children - this.jumlahTelur;
    }
}
