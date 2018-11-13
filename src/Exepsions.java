public class Exepsions {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println("Vi Vveli:"+num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Trebuet Celochislenniy argument");
        }
        finally {
            System.out.println("Programma Zavershila Rabotu.");
        }
    }
}
