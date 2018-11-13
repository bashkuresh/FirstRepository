public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        boolean b =random.nextBoolean() ;
        if (b == true ){
            System.out.println("Rent a car!");
        } else System.out.println("Bus!");
    }
}
