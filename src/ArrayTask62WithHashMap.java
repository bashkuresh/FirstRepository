import java.util.ArrayList;
import java.util.HashMap;

public class ArrayTask62WithHashMap {
    public static void main(String[] args) {
        int[] originArray = new int[]{4,5,7,2,2,5,3,1,1};
        HashMap<Integer, Integer> resultArray = new HashMap<>();
        for (int i = 0; i< originArray.length; i++) {
            resultArray.put(i , 0);
        }

        for (int i = 0; i < originArray.length; i++) {
             Integer newValue = new Integer( resultArray.get(originArray[i]) + 1);
            resultArray.replace(originArray[i], newValue );
        }

        ArrayList<Integer> returnArrayList = new ArrayList<>();

        for(Integer key: resultArray.keySet()) {
            if (resultArray.get(key) ==1 ) {
                returnArrayList.add(key);
            }
        }

        System.out.println(returnArrayList);

    }
}
