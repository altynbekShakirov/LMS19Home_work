import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

        String juma= scanner.nextLine().toLowerCase(Locale.ROOT);
        switch (juma) {
            case "monday":
                DaysOfTheWeek days = DaysOfTheWeek.MONDAY;
                System.out.println(days);
                break;
            case "tuesday":
                DaysOfTheWeek days1 = DaysOfTheWeek.TUESDAY;
                System.out.println(days1);
                break;
            case "wednesday":
                DaysOfTheWeek days2 = DaysOfTheWeek.WEDNESDAY;
                System.out.println(days2);
                break;
            case "thursday":
                DaysOfTheWeek days3 = DaysOfTheWeek.THURSDAY;
                System.out.println(days3);
                break;
            case "friday":
                DaysOfTheWeek days4 = DaysOfTheWeek.FRIDAY;
                System.out.println(days4);
                break;
            case "saturday":
                DaysOfTheWeek days5 = DaysOfTheWeek.SATURDAY;
                System.out.println(days5);
                break;
            case "sunday":
                DaysOfTheWeek days6 = DaysOfTheWeek.SUNDAY;
                System.out.println(days6);
                break;
        }


        }



    }
}