import java.util.Arrays;
import java.util.Map;
//Преобразовать массив таким образом, чтобы сначала располагались все элементы,
// модуль которых не превышает единицу, а потом – все остальные.
public class ArrayTask68 {
    public static void main(String[] args) {
        int index=0;
        double[] arr=new double[]{1,3,4,5,0.4,6,6,8,0.9,4,-0.4,-1,0,4,0};
        System.out.println(Arrays.toString(arr));
        double[]emptyArr=new double[arr.length];
        for(int i=0;i<arr.length;i++){
            if (Math.abs(arr[i])<=1){//используем метов модуля который выдает модуль числа то есть положительное число =этому числу
                emptyArr[index]=arr[i];//мы берем пустой аррей с 0 индексом и приравниваем его к аррею который имеет значения
                index++;//мы думаем о последующих индексах и будем их добавлять по одному
                //в итоге получится он расставит все числа подходящие под условие не <=1

            }
        }
        for(int i=0;i<arr.length;i++){//здесь мы добавляем все последующие числа не подходящие под условие
            if (Math.abs(arr[i])> 1){
                emptyArr[index]=arr[i];
                index++;

            }
        }
        System.out.println(Arrays.toString(emptyArr));
    }
}
