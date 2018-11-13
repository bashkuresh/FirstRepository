import com.sun.jdi.PathSearchingVirtualMachine;

public class Lgic {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;
        System.out.println("Resultexpressions yes And yes:"+(yes&&yes));
        System.out.println("Resultexpressions yes And no:"+(yes&&no));

        System.out.println("Resultexpressions yes Or yes:"+(yes||yes));
        System.out.println("Resultexpressions yes Or no:"+(yes||no));
        System.out.println("Resultexpressions no Or no:"+(no||no));

        System.out.println("Initial value yes:"+yes);
        System.out.println("Inversion value yes:"+!yes);

    }
}
