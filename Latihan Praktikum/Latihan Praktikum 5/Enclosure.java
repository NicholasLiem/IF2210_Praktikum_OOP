import java.io.*;
import java.util.*;

public class Enclosure<T extends Animal> {
    private ArrayList<T> animals;

    public Enclosure() {
        this.animals = new ArrayList<>();
    } 

    public int getAnimalCount() {
        return this.animals.size();
    }

    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    public T getAnimalAt(int i) {
        return this.animals.get(i);
    }

    public void removeAnimalAt(int i) {
        this.animals.remove(i);
        // menghapus hewan pada this.animals pada index i
    }

    public boolean isEmpty() {
        return this.animals.size() == 0;
        // mengembalikan boolean yang menyatakan apakah this.animals kosong atau tidak
    }

    public void describe() {
        if (this.isEmpty()){
            System.out.println("Kandang ini kosong...");
        } else {
            System.out.println("Kandang berisi " + this.getAnimalCount() + " ekor hewan:");
            for(int i = 0; i < this.getAnimalCount(); i++){
                System.out.println((i+1) + ". " + this.getAnimalAt(i).getName() + ", spesies " + this.getAnimalAt(i).getSpecies() + ", umur " + this.getAnimalAt(i).getAge() + " tahun");
            }
        }
        // Menuliskan output berikut apabila this.animals kosong:
        // Kandang ini kosong...
        // Apabila tidak kosong menuliskan output serupa dengan output berikut:
        // Kandang berisi 2 ekor hewan:
        // 1. po, spesies Pandamus Maximus, umur 5 tahun
        // 2. po2, spesies Pandamus Maximus, umur 5 tahun
    }

    // public static void main(String args[]){
    //     Panda po = new Panda("po",5);
    //     Panda po2 = new Panda("po2", 5);
    //     Enclosure<Panda> e1 = new Enclosure<Panda>();
    //     e1.addAnimal(po);
    //     e1.addAnimal(po2);
    //     e1.describe();
    // }

    public void feed() {
        if (this.isEmpty()){
            System.out.println("Kandang ini kosong...");
        } else {
            for (Animal animal : this.animals) {
                animal.eat();
            }
        }
        // Menuliskan output berikut apabila this.animals kosong:
        // Kandang ini kosong...
        // Apabila tidak kosong maka akan memanggil method eat pada tiap animal dalam this.animals
    }

    public boolean safeForPetting() {
        for(Animal animal : this.animals) {
            if (!animal.isFriendly()) {
                return false;
            }
        }
        return true;
        // mengembalikan true apabila semua hewan dalam this.animals bersifat friendly
    }
}