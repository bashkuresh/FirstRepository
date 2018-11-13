public class Comparison {
    public static void main(String[] args) {
        String txt = "Fantastic";
        String lang = "Java";
        boolean state =(txt==lang);//prisvaivaem res proverki
        System.out.println("Proverka Strok Na Ravenstvo:"+ state);
        state = ( txt != lang);//prisvaivaem res
        System.out.println("Proverka Strok Na Neravenstvo"+state);
        int dozen = 12;
        int score =20;
        state = (dozen> score);//Prisvaivaem REs
        System.out.println("Proverka Na >:"+ state);
        state = ( dozen< score);//Proverka res
        System.out.println(" Proverka Na <:"+ state);
    }
}
