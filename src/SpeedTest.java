

public class SpeedTest {
    public static void main(String[] args) {
        int array[] = new int[1000];
        for ( int i = 0; i<array.length; i++) {
            array[i] = i;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long startTime = System.nanoTime();


        for (int i = 0; i<array.length; i++) {
            if (array[i] < min) {

                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        long finishTime = System.nanoTime();
        System.out.println(finishTime - startTime);

         min = Integer.MAX_VALUE;
         max = Integer.MIN_VALUE;


         startTime = System.nanoTime();


        for (int i = 0; i<array.length; i++) {
            if (array[i] < min) {

                min = array[i];
            }

        }
        for (int i = 0; i<array.length; i++) {
             if (array[i] > max) {
              max = array[i];
            }
         }
         finishTime = System.nanoTime();
        System.out.println(finishTime - startTime);

    }
}
