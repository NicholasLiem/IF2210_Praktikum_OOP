import java.util.ArrayList;

public class Queue<T>{

  private ArrayList<T> data;

  private int lastElmIdx, size;

  private final static int DEFAULT_QUEUE_SIZE = 500;


  public Queue(){
    this.size = DEFAULT_QUEUE_SIZE;
    this.lastElmIdx = -1;
    this.data = new ArrayList<T>(this.size);
  }

//Instantiate dengan size = n

  public Queue(int n){
    this.size = n;
    this.lastElmIdx = -1;
    this.data = new ArrayList<T>(this.size);
  }

//Copy queue

  public Queue(final Queue<T> q){
    ArrayList<T> newData = q.data;
    this.size = q.size;
    this.lastElmIdx = q.lastElmIdx;
    this.data = newData;
  }

  public void push(T t){
    if (!this.isFull()){
        this.lastElmIdx++;
        this.data.add(t);
    }
  }

  public T pop(){
    if (!this.isEmpty()){
        T item = this.data.get(0);
        this.data.remove(this.data.get(0));
        this.lastElmIdx--;
        return item;
    }
    return null;
  }

  public boolean isEmpty(){
    return this.lastElmIdx == -1;
  }

  public boolean isFull(){
    return this.lastElmIdx == this.size - 1;
  }

//   public static void main(String args[]){
//     Queue<Integer> hehe = new Queue<Integer>();
//     hehe.push(10);
//     hehe.push(11);
//     Integer item = hehe.pop();
//     System.out.println(item);
//     // for(int i = 0; i <= hehe.lastElmIdx; i++){
//     //     System.out.println(hehe.data.get(i));
//     // }
//   }
}