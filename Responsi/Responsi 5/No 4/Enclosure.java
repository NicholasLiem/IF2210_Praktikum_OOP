import java.io.*;
import java.util.*;

public class Enclosure {
    private ArrayList<Animal> animals;

    public Enclosure() {
        animals = new ArrayList<>();
    } 

    public int getAnimalCount() {
        return this.animals.size();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal getAnimalAt(int i){
        return this.animals.get(i);
    }

    public void removeAnimalAt(int i) {
        this.animals.remove(i);
    }

    public boolean isEmpty() {
        return this.animals.size() == 0;
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

    public static void main(String[] args) {
        Enclosure enc1 = new Enclosure();
        enc1.describe();
    }
}