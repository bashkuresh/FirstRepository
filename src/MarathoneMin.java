public class MarathoneMin {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate", "Arthur"};

        int[] times = {322, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265, 100};
        int  sum = 0;
        int  max = 0;
        int index = 0;

        for(int i=0; i<times.length;i++){
            if(times[i]> max){
                max=times[i];
                index=i;
            }
            sum=sum+times[i];
            //
        }

        double middle;
        middle=sum/times.length;
        System.out.println( times[index]  );
        System.out.println(names[index]);
        System.out.println(middle);

    }
}
