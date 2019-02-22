import java.util.ArrayList;
import java.util.HashMap;

public class ArrayTask62WithHashMap {
    public static void main(String[] args) {
        int[] originArray = new int[]{4,5,7,2,2,5,3,1,1};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i< originArray.length; i++) {
            hashMap.put(i , 0);
        }

        for (int i = 0; i < originArray.length; i++) {
             Integer newValue = new Integer( hashMap.get(originArray[i]) + 1);
            hashMap.replace(originArray[i], newValue );
        }

        ArrayList<Integer> returnArrayList = new ArrayList<>();

        for(Integer key: hashMap.keySet()) {
            if (hashMap.get(key) ==1 ) {
                returnArrayList.add(key);
            }
        }

        System.out.println(returnArrayList);

    }
}
