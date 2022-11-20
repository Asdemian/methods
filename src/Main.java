import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task2
        int os = 1;
        int typeosYear = 2021;
        printProgramVersion(os, typeosYear);

    }

    private static String version(int type) {
        if (type == 1) {
            return " Android";
        } else if (type == 0) {
            return " iOS";
        } else {
            return "Another";
        }
    }

    private static String requiredSoftware(int typeos) {
        int currentYear = LocalDate.now().getYear();
        if (typeos >= currentYear) {
            return "актуальную";
        } else
            return "облегченную";
    }

    private static void printProgramVersion(int type, int typeOsYear) {
        String os = version(type);
        String whatIsTheTime = requiredSoftware(typeOsYear);
        System.out.println("Нужно установить " + whatIsTheTime + " версию ПО для" + os);
    }
}