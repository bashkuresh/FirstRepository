public class Task83 {
    public static void main(String[] args) {
        //Выведите следующие строки. Первая: 25  25.5  24.8. Вторая: 26 26.5 25.8.  И так далее. Последняя строка: 35 35.5 34.8.
        int x = 25;
        double y  = 25.5;
        double z = 24.8;

        for (int i=0; i<10;i++){
            System.out.println(z+" "+y+" "+x);
            x++;
            y++;
            z++;
        }


    }
}
