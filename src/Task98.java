public class Task98 {
    public static void main(String[] args) {
        //Начав тренировки, лыжник в первый день пробежал 10 км.
        // Каждый следующий день он увеличивал пробег на 10% от пробега предыдущего дня.
        // Определите: а) пробег лыжника за второй, третий, ..., десятый день тренировок;
        // б) какой суммарный путь он пробежал за первые 7 дней тренировок.
        // в) суммарный путь за n дней тренировок;
        // г) в какой день ему следует прекратить увеличивать пробег, если он не должен превышать 80 км?
        double sum = 0;
        for (int i=1;i<11;i++){
            System.out.println(i);
            sum = sum*i*0.1;

        } System.out.println(" - "+sum);

    }
}
