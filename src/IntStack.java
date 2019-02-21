import java.util.Arrays;
import java.util.Scanner;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;


    private IntStack() {//constructor
        top = 40;//parametors
        size = 40;
        stack = new int[50];
        stack[0]=40;
        stack[1]=40;

    }
    private IntStack(int size){//constructor
        top=-1;
        this.size=size;//этоотносится к этому size
        stack=new int[this.size];
    }

    public IntStack(int[] stack, int top, int size) {//Constractor where we put our own vals
        this.stack = stack;
        this.top = top;
        this.size = size;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        IntStack intStack = new IntStack();

       /* IntStack intStack1 = new IntStack(500);//500
        System.out.println(intStack1.getSize());//-1
        System.out.println(intStack1.getTop());
        System.out.println(Arrays.toString(intStack1.getStack()));


*/      int arr[]=new int[20];
       IntStack intStack2= new IntStack(arr, 7, 70 );
        System.out.println();
    }
}


