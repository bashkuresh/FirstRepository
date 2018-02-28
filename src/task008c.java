import java.util.Scanner;

public class task008c {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        double x=s.nextDouble ();
        System.out.format("%f%n", Math.abs(x));
        System.out.format("%f%n", Math.sin(x));
        System.out.format("%f%n", Math.cos(x));
        System.out.format("%f%n", Math.PI*x);
        System.out.format("%f%n", Math.sqrt(x));
        System.out.format("%f%n", Math.cbrt(x));
        System.out.format("%f%n", Math.log(x));
        System.out.format("%f%n", Math.log10(x));
        System.out.format("%f%n", Math.exp(x));
        System.out.format("%f%n", Math.pow(x,Math.E));

    }

}
