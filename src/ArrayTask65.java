
import java.util.*;

public class ArrayTask65 {
    public static void main(String[] args) {
        //тавить элементы массива в обратном порядке.
        int[] originArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<originArray.length;i++){
            stack.push(originArray[i]);
        }
        for (int i=0;i<originArray.length;i++){
            originArray[i]=stack.pop();
        }
        System.out.println(Arrays.toString(originArray));
        System.out.println(stack.toString());
     }
}
