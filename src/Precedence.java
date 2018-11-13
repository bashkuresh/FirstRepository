public class Precedence {//Старшинство
    public static void main(String[] args) {
        int sum = 32-8+16*2;
        System.out.println("Порядок действий по умолчанию:"+sum);

        sum = (32-8+16)*2;
        System.out.println("Указанный порядок действий:"+sum);

        sum = (32-(8+16))*2;
        System.out.println("Специфичный порядок действий:"+sum);

    }
}
