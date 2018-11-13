public class Task31 {
    public static void main(String[] args) {
        //Дан прямоугольник размером 647 x 170.
        // Сколько квадратов со стороной 30 можно вырезать из него?
        int s1 = 647;
        int s2 = 170;
        int s3 = 30;
        int sum = 0;
        sum = s1/s3+s2/s3;
        System.out.println(sum);

    }
}
