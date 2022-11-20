import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task2
        int os = 1;
        int typeosYear = 2021;
        printProgramVersion(os, typeosYear);
        //Task3
        int howManyKm = 95;
        int totalOfDays = calculateDays(howManyKm);
        System.out.println("Потребуется дней: " +totalOfDays+ " + срок доставки");

    }

    private static String getVersion(int type) {
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
        String os = getVersion(type);
        String whatIsTheTime = requiredSoftware(typeOsYear);
        System.out.println("Нужно установить " + whatIsTheTime + " версию ПО для" + os);
    }

    private static int calculateDays(int howManyKm) {
        int totalOfDays = 1;
        int interval = 40;
        int initialInterval = 20;
        if (howManyKm > initialInterval) {
            totalOfDays = totalOfDays + (int) Math.ceil((howManyKm - initialInterval) / (double) interval);
        }
        return totalOfDays;
    }
}