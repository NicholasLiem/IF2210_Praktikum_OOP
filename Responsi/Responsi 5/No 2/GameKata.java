import java.util.*;

public class GameKata {
  public static void run(String[] tito, String[] wiwid) {
    int panjangTito = tito.length;
    int panjangWiwid = wiwid.length;
    // String, jumlahPemanggilan
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < panjangTito; i++) {
      if (map.containsKey(tito[i])){

      } else {
        map.put(tito[i], 1);
      }
    }
    
    for (int i = 0; i < panjangWiwid; i++) {
      if (map.containsKey(wiwid[i])) {
        int value = map.get(wiwid[i]);
        map.put(wiwid[i], value + 1);
      }
    }

    for(String key : map.keySet()) {
      if (map.get(key) > 1) {
        System.out.println(key);
      }
    }

  }
  public static void main(String[] args) {
    String[] tito = {"Budi", "Budi", "Adalah", "Budi"};
    String[] wiwid = {"Budi", "Bermain", "Bola", "Adalah"};
    run(tito, wiwid);
  }
}