import java.util.Scanner;
//Пользователь вводит курс доллара в рублях.
// Показать таблицу цен 1$, 2$, ..., 100$ в рублях,
// третьим столбцом добавить количество кг конфет, которые можно купить на данные суммы,
// если цена 1 кг конфет равна 20 руб. Пример: 1$ - 70 р - 3.5 кг и так далее (всего 100 строк).
public class Task84 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter Kurs Dollars in Rubles");
        double x = s.nextDouble();
        for (int i=1;i<101;i++){
            System.out.println(i+" - "+x*i+" - "+(x*i)/20+" kg candies");
        }
    }
}
