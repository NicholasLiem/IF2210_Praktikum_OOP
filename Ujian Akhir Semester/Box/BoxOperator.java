import java.util.ArrayList;
import java.util.List;

public class BoxOperator {
    public static <T> List<T> getContents(Box<?> box, Class<T> type) {
        List<T> hasil = new ArrayList<>();
        for(int i = 0; i < box.getContents().size();i++){
            if(box.getContents().get(i) != null){
                Object temp = box.getContents().get(i);
                if(type.isAssignableFrom(temp.getClass())){
                    hasil.add(type.cast(temp));
                }
            }
        }
        return hasil;
        // Implement this function.
        // Case need to be handled: Box may contains null value, please make sure it is not returned.
    }
}
