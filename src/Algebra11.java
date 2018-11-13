public class Algebra11 {
    public static void main(String[] args) {//|x−5|−sinx3+x2+2014−−−−−−−−√cos2x−3
        double sum = 0;
        double sum1 = 0;
        double x = -2.34;
        sum = (Math.abs(x - 5) - Math.sin(x)) / 3;
        sum1= Math.sqrt(Math.pow(x,2)+(2014*Math.cos(2*x))+3);
        System.out.println(sum1);
    }
}
