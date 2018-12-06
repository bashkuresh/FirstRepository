public class Task87 {
    public static void main(String[] args) {
        //Найти сумму 10+11+12+13+...+88
        int sum = 0;
        for (int i=10;i<89;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
