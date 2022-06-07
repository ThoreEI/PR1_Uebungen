public class Main {
    public static void main (String[] args) {

//        Beispielwerte:
//        tag: 31
//        monat:12
//        schaltjahr:false
        System.out.println(daysPassed(31, 12, true));
    }

    static int daysPassed(int day, int month, boolean leapYear) {
        int daysPassed;
        if (leapYear)
            daysPassed = 1;
        else
            daysPassed = 0;

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month >= 1 && month <= 12)
            for (int i = 0; i < month; i++)
                daysPassed += months[i];

        daysPassed -= months[month-1] - day;

        return daysPassed;


    }
}
