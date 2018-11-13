public class Demenshions {
    public static void main(String[] args) {
        boolean [][] points = new boolean[5][20];
        points[0][5]=true;
        points[1][6]=true;
        points[2][7]=true;
        points[3][8]=true;
        points[4][9]=true;
        for ( int i= 0; i<points.length; i++){

        System.out.println("\n");
    }
    for (int j=0; j<points.length;j++){
            char mark = (points[0][j])?'X':'-';
        System.out.println(mark);
    }

    }
}
