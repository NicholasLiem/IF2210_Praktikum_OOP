/**
 * Gajah.java
 * Implementasi dari Gajah
 * @author 13521135 Nicholas Liem
 */

public class Gajah extends Animal {
    int basePower;
    int age;

    public Gajah(int bp, int age){
        super(4);
        this.basePower = bp;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public int getAnimalPower(){
        return 3 * (this.basePower + this.age + super.children);
    }

}
