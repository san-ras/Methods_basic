

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(6);
    }

    private static void printFromNumberToOne(int numberFrom) {
        for (int i = numberFrom; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
