import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTask62 {
    public static void main(String[] args) {
        //Удалить в массиве все числа, которые повторяются более двух раз.
        int count=0;
        int index=0;
        int[] intArray = new int[]{4,5,7,2,2,5,3,1,1};
        int [] checkArray = new int[intArray.length];


        for (int i=0;i<intArray.length;i++){
            boolean isReapeted=false;
            for (int j=0;j<checkArray.length;j++){
                if (intArray[i]==checkArray[j]){
                    isReapeted=true;
                }
            }
            checkArray[i] = intArray[i];

            if (!isReapeted){
                count++;
            }else {
                count--;
            }

        }

       // System.out.println("Count of unique elements in array:" + count );


        int [] result = new int[count];
        for (int i=0;i<intArray.length;i++){
            int repeteCount=0;
            for (int j=0;j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    repeteCount++;
                }
            }if (repeteCount==1){
                result[index]=intArray[i];
            index++;
            }

        }
        System.out.println(Arrays.toString(result));





//        int a[][] = new int [3][3];//two-dimention array
//        int k = 0;
//        for (int i=0; i< 3; i++) {
//            for (int j = 0 ; j< 3; j++) {
//                a[i][j] = k;
//                k++;
//            }
//        }
//
//        for(int i=0; i<3;i ++) {
//            System.out.println(Arrays.toString(a[i]));
//        }




    }
}












       /* ArrayList<Integer>  list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list);
*/