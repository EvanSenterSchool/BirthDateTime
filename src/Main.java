import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SCANNNNNNNNNER SCANNNN
        Scanner scan = new Scanner(System.in);
        int dayMax = 0;
        //USER

        int year = inputhelper.getRangedInt(scan, "Input your birth year", 1950, 2010);
        int month = inputhelper.getRangedInt(scan, "Input your birth month", 1, 12);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayMax = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayMax = 30;
        }
        else if (month == 2) {
            dayMax = 29;
        }

        int day = inputhelper.getRangedInt(scan, "Input your birth day",1 , dayMax);
        int hour = inputhelper.getRangedInt(scan, "Input your birth hour", 1, 24);
        int minute = inputhelper.getRangedInt(scan, "Input your birth minute", 1, 60);

        System.out.println("Year:  " + year);
        System.out.println("Month:  " + month);
        System.out.println("Day:  " + day);
        System.out.println("Hour:  " + hour);
        System.out.println("Minute:  " + minute);
    }
}