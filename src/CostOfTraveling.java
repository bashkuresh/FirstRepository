import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class CostOfTraveling {
    //вводится расстояние в км,литры на 100 км, ввести среднюю цену на голлон бензина в $$$, вывести цену поездки в $$$
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите расстояние в км");
        double distance = s.nextDouble(); //distane =2126 miles
        distance=distance/1.6; //distance = 2126 * 1.6
        System.out.println("Введите расход топлива в литрах");
        double consouption = s.nextDouble();
        consouption=consouption/3.81/62/1.6; //литров на 100 км галлонов на 100км   галлонов на 1 миль  галлонов на  62 милей
        consouption = distance*consouption;
        System.out.println("Введите цену бензина в $$$");
        double price = s.nextDouble();
        double cost =consouption*price;  //расстояние мили* расход цена =
        System.out.println(cost);
        //мили х галлон/миль = кол-во галлонов за поездку



    }
}
