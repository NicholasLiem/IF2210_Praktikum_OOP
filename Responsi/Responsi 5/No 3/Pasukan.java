import java.util.*;

public class Pasukan {
    private List<Integer> pasukan;
    private int n;

    public Pasukan(List<Integer> pasukan, int n){
        this.pasukan = pasukan;
        this.n = n;
    }

    public void reset(){
        pasukan.clear();
        for(int i = 0; i < n; i++){
            pasukan.add(0);
        }
    }

    public long get(int idx){
        this.reset();
        long start = Util.getTime();
        pasukan.get(idx);
        long end = Util.getTime();
        return end-start;
    }

    public long del(int idx, int t){
        this.reset();
        long start = Util.getTime();
        for(int i = 0; i < t; i++){
            pasukan.remove(idx);
        }
        long end = Util.getTime();
        return end-start;
    }
}
