import java.util.Arrays;

public class ArrayTask69 {
    public static void main(String[] args) {
        //Даны два массива. Сформировать третий массив, состоящий из тех элементов, которые:
        // а) присутствуют в обоих массивах;
        // б) присутствуют только в одном из массивов.
        int firstArr[]=new int[]{1,2,4,5,0,4,};
        int secondArr[]=new int[]{1,4,5,3,4,5,9};
        int thirdArr[]=new int[firstArr.length];

        int index=0;
        for (int i=0;i<firstArr.length;i++){
            for(int j=0;j<secondArr.length;j++)
            if (firstArr[i]==secondArr[j]){//первое условие
                thirdArr[i]=firstArr[i];
                index++;

            }

        }
        System.out.println(Arrays.toString(thirdArr));
//        for (int i=0;i<firstArr.length;i++){
//            for (int j=0;j<secondArr.length;j++){
//                if (firstArr[i]!=secondArr[i]){
//                    thirdArr[index]=firstArr[i];
//                    index++;
//                }
            }
        }



