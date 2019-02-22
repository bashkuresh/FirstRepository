import java.util.Arrays;

public class ArrayTask67 {
    public static void main(String[] args) {
        //В данном массиве найти все нулевые элементы и заменить их вместе с соседними элементами на 3.
        int[] arr=new int[]{0,5,4,3,2,0,1,50,8,0,6,0,43,3,4,40,0};
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if (i==0){
                    arr[i]=3;
                    arr[i+1]=3;
                }else  if (i==arr.length-1){
                    arr[i]=3;
                    arr[i-1]=3;
                }else{
                    arr[i]=3;
                    arr[i+1]=3;
                    arr[i-1]=3;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
