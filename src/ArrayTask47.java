import java.util.*;

//В данном массиве найти максимальное количество одинаковых элементов.
public class ArrayTask47 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 4, 4, 1, 1, 7, 4, 6, 1, 8, 4, 4, 1};
        Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();


        for (int i = 0; i < intArray.length; i++) {
            if (mapA.containsKey(intArray[i])) {
                int count = mapA.get(intArray[i]);
                count++;
                mapA.replace(intArray[i], count);

            } else {
                mapA.put(intArray[i], 1);
            }
        }
        Collection<Integer> maxs =  mapA.values();
      //  maxs.
        int maxList = Collections.max(mapA.values());
        System.out.println("Maximum value of list is: "+mapA+" " + maxList);


    }
}
