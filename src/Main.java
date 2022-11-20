public class Main {
    public static void main(String[] args) {
        //Task1
        int year = 1902;
        boolean leapYear = leap(year);
        conclusionYear(year, leapYear);
    }

    private static boolean leap(int year) {
        return year % 4 == 0 || year % 400 == 0 && year % 100 == 0;

    }

    private static void conclusionYear(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " Високосный год");
        } else
            System.out.println(year + " Не високосный год");
    }
}