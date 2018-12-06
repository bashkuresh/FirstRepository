public class Task88 {
    public static void main(String[] args) {
        //Найти произведение 5⋅6⋅7⋅...⋅13.
        int sum =0;
        for (int i=5;i<14;i++){
            System.out.println(i);
            sum= i * sum;
            System.out.println(sum);
        }

    }
}
