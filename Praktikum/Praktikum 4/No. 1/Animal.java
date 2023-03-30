/**
 * Animal.java
 * Sebagai ABC untuk animal
 * @author 13521135 Nicholas Liem
 */

public abstract class Animal implements Comparable<Animal> {
  int numberOfLegs;
  int children;

  public Animal(int numOfLegs){
    this.numberOfLegs = numOfLegs;
    this.children = 0;
  }

  public int getNumberOfLegs(){
    return this.numberOfLegs;
  }

  public int getNumberOfChildren(){
    return this.children;
  }

  public void increaseChild(int inc){
    this.children += inc;
  }

  abstract public int getAnimalPower();
  
  public int compareTo(Animal a) {
    if (this.getAnimalPower() == a.getAnimalPower()){
      return 0;
    } else if (this.getAnimalPower() > a.getAnimalPower()) {
      return 1;
    } else {
      return -1;
    }
    // compareTo mengembalikan:
    // 0 bila this sama dengan m
    // 1 bila this lebih dari m
    // -1 bila this kurang dari m
    
  }
}
