public class Assignment {
    public static void main(String[] args) {
        String txt = "Fantastic";
        String lang = "Java";
        txt +=lang;//Prisvoenie s obedineniem strok
        System.out.println("Присваивание с объединением строк"+ txt);
        int sum = 10;
        int num = 20;
        sum +=num;// Присваиваем рез 10+20+30
        System.out.println("Складываем и присваиваем Целые Числа:"+ sum);
        int factor = 5;
        sum *=factor;//Присваиваем Рез 30*5=150
        System.out.println("Рез Умножения"+ sum);
        sum /= factor;//Присваиваем результат 150.5=30
        System.out.println("Результат деления:"+ sum);


    }

}
