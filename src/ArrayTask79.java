import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayTask79 {
    public static void main(String[] args) {
        //Даны два упорядоченных по возрастанию массива.
        // Образовать из этих двух массивов единый упорядоченный по возрастанию массив.
        Map<Integer, Integer> hashMap = new HashMap<>();
        int arr[] = new int[]{1, 3,3,3,2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = new int[]{10, 11, 12, 13, 14, 15};


        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i <= max; i++) {
            hashMap.put(i, 0);

        }
        for (int i = 0; i < arr.length; i++) {
            Integer newValue = new Integer(hashMap.get(arr[i]) + 1);
            hashMap.replace(arr[i], newValue);
        }

        for (int i = 0; i < arr2.length; i++) {
            Integer newValue = new Integer(hashMap.get(arr2[i]) + 1);
            hashMap.replace(arr2[i], newValue);

        }
        System.out.println(hashMap);
        List<Integer> arrayList=new ArrayList<>();
        for (Integer key : hashMap.keySet()) {
           if (hashMap.get(key)>0){
               for (int i=0;i<hashMap.get(key);i++){
                   arrayList.add(key);
               }
           }
        }
        System.out.println(arrayList);
    }
}