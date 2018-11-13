public class Literali {
    public static void main(String[] args) {
        String header = "\n\tШиргалеев Салават Винирович за 3 месяца\n";
        header += "\tМесяц\tЧистота тела\tОдежда\tВес";
        header += "\t---\t\t---\t---\t---\n";

        String body = "\tMarch\tClean\tT-Shirt\t90\n";
        body += "\tApril\tNorm\tNaked\t95\n";
        body += "\tMay  \tSuper\tSuit\t99\n";
        System.out.print(header+body);
    }
}
