public class StringSearch {
    public static void main(String[] args) {
        String[] books =
                { "Java in easy steps", "XML in easy steps" ,
                        "HTML in easy steps" , "CSS in easy steps" ,
                        "Gone With the Wind" , "Drop the Defense" };
        int counter1=0;
        int counter2=0;
        int counter3=0;
        for (int i=0;i<books.length;i++){
            System.out.println(books[i].substring(0,4)+'|');
        }

    }
}
