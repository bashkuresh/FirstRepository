public class Task90 {
    public static void main(String[] args) {
        //Найти сумму cos3/5+cos5/7+cos7/9+...+cos111/113.
        double sum = 0;
        for (double i=Math.cos(3/5); i<=Math.cos(111/113);i=i+Math.cos(2/2)){
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
