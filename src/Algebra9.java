public class Algebra9 {
    public static void main(String[] args) {//|x|+x5, если x=−2. Ответ: -30
        int sum = 0;
        int x = -2;
        sum = (int) (Math.abs(x) +Math.pow(x,5));
        System.out.println(sum);
    }
}
