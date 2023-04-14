public class Couple<K, V>{
    private K key;
    private V value;

    public Couple(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return this.key;
    }

    public V getVal(){
        return this.value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setVal(V value){
        this.value = value;
    }

    public boolean isEqual(Couple<K,V> c){
        return (this.key == c.key) && (this.value == c.value);
    }

    public int nearEQ(Couple<K,V> couple){
        if (this.isEqual(couple)){
            return 3;
        } else if (this.key == couple.key && this.value != couple.value) {
            return 1;
        } else if ((this.value == couple.value) && (this.key != couple.key)) {
            return 2;
        }
        return 0;
    }

    // public static void main(String args[]){
    //     Couple<Integer,Integer> hehe = new Couple<Integer, Integer>(1,1);
    //     hehe.setVal(2);
    //     hehe.setKey(0);
    //     Couple<Integer,Integer> hehe2 = new Couple<Integer, Integer>(1,2);
    //     System.out.println(hehe.nearEQ(hehe2));
    // }
}