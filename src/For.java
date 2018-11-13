public class For {
    public static void main(String[] args) {
        int num = 0;
        for (int i=1; i<4; i++){
            System.out.println("Vneshniy cikl i="+i);
        }
        for (int j=1;j<4; j++){
            System.out.println("\tVnutrenniy cikl j="+j);
            System.out.println("\t\tVsego num="+(++num));
        }
    }
}
